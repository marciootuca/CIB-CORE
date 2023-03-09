package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.TblHisto;
import br.com.lello.cibcore.model.TblHistoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TblHistoRepository extends JpaRepository<TblHisto, TblHistoId> {

	@Query(value = "SELECT h FROM TblHisto h WHERE h.id.condominio = ?1 AND h.id.acordo = ?2")
	TblHisto obterRegistroExisteConta(Long condominio, Long acordo);
}
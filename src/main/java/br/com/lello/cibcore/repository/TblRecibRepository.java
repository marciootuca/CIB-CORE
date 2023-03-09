package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.TblRecib;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TblRecibRepository extends JpaRepository<TblRecib, Long> {

	@Query("SELECT r FROM TblRecib r WHERE r.codParcela = ?1")
	Optional<TblRecib> obterTblRecibCodParcela(Integer codParcela);

	@Query("SELECT r FROM TblRecib r WHERE r.id.condominio = ?1 AND r.id.recibo = ?2")
	TblRecib buscarReciboPeloCondominioERecibo(Integer condominio, Integer recibo);

}
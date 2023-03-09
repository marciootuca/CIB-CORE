package br.com.lello.cibcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.lello.cibcore.model.remessa.CesDet1;
import br.com.lello.cibcore.model.remessa.CesHeader;

public interface CNABCesRepository extends JpaRepository<CesHeader, Long> {

	String QUERY = "Select h From CesHeader h ORDER BY COD ";
    String QUERY1 = "Select d From CesDet1 d WHERE codHeaderArq = ?1 ORDER BY COD ";

    @Query(value = QUERY)
    List<CesHeader> listarTodos();

    @Query(value = QUERY1)
    List<CesDet1> listarDet1(Long codigo);

}

package br.com.lello.cibcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.lello.cibcore.model.remessa.PagH;
import br.com.lello.cibcore.model.remessa.PagamentoDetalheA;
import br.com.lello.cibcore.model.remessa.PagamentoDetalheB;

public interface CNABPagamentoTransferenciaRepository extends JpaRepository<PagH, Long> {

	String QUERY = "Select h From PagH h WHERE h.codHeaderArq = ?1  ORDER BY COD ";
    String QUERYA = "Select d From PagamentoDetalheA d WHERE codHeaderLote = ?1 ORDER BY COD ";

	@Query(value = QUERY)
	List<PagH> listarPorArquivo(Long codigo);

    @Query(value = QUERYA)
    List<PagamentoDetalheA> listarDetA(Long codigo);

}

package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.remessa.PagamentoCobrancaDetalheJ;
import br.com.lello.cibcore.model.remessa.PagamentoCobrancaHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CNABPagamentoCobrancaRepository extends JpaRepository<PagamentoCobrancaHeader, Long> {

	String QUERY = "Select h From PagamentoCobrancaHeader h WHERE h.codHeaderArq = ?1  ORDER BY COD ";
	String QUERYJ = "Select j From PagamentoCobrancaDetalheJ j WHERE j.headerLote.cod = ?1  ORDER BY COD ";

	@Query(value = QUERY)
	List<PagamentoCobrancaHeader> listarPorArquivo(Long codigo);

	@Query(value = QUERYJ)
	List<PagamentoCobrancaDetalheJ> listarDetJ(Long codigo);

}

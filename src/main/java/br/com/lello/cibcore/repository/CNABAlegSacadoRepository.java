package br.com.lello.cibcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.lello.cibcore.model.remessa.HeaderAlegacaoSAC;
import br.com.lello.cibcore.model.remessa.PagamentoCobrancaDetalheY;


public interface CNABAlegSacadoRepository extends JpaRepository<HeaderAlegacaoSAC, Long> {

    String QUERY = "Select h From HeaderAlegacaoSAC h WHERE h.codHeaderArq = ?1 ORDER BY COD ";
	@Query(value = QUERY)
	List<HeaderAlegacaoSAC> listarPorArquivo(Long codigo);

	String QUERYY = "Select o From PagamentoCobrancaDetalheY o WHERE o.codHeaderLote = ?1 ORDER BY COD";
    @Query(value = QUERYY)
    List<PagamentoCobrancaDetalheY> listarDetY(Long codigo);

}
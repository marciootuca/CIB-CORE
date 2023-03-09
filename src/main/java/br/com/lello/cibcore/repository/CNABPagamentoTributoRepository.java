package br.com.lello.cibcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.lello.cibcore.model.remessa.HeaderLoteTrib;
import br.com.lello.cibcore.model.remessa.PagamentoDetalheN;
import br.com.lello.cibcore.model.remessa.PagamentoDetalheO;

public interface CNABPagamentoTributoRepository extends JpaRepository<HeaderLoteTrib, Long> {

    String QUERY = "Select h From HeaderLoteTrib h WHERE h.codHeaderArq = ?1 ORDER BY COD ";
	@Query(value = QUERY)
	List<HeaderLoteTrib> listarPorArquivo(Long codigo);

	String QUERYO = "Select o From PagamentoDetalheO o WHERE o.codHeaderLote = ?1 ORDER BY COD";
    @Query(value = QUERYO)
    List<PagamentoDetalheO> listarDetO(Long codigo);

	String QUERYN = "Select n From PagamentoDetalheN n WHERE n.codHeaderLote = ?1 ORDER BY COD";
    @Query(value = QUERYN)
    List<PagamentoDetalheN> listarDetN(Long codigo);

}

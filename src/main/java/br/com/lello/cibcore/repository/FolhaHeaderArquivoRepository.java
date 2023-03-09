package br.com.lello.cibcore.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.lello.cibcore.model.remessa.FolhaHeaderArquivo;
import br.com.lello.cibcore.model.remessa.FolhaHeaderLote;
import br.com.lello.cibcore.model.remessa.FolhaPagamentoDetalheA;
import br.com.lello.cibcore.model.remessa.FolhaPagamentoDetalheB;
import br.com.lello.cibcore.model.remessa.FolhaPagamentoDetalheC;

public interface FolhaHeaderArquivoRepository extends JpaRepository<FolhaHeaderArquivo, Long> {

	String QUERY_HEADER_ARQUIVO = "SELECT headerArq FROM FolhaHeaderArquivo headerArq WHERE headerArq.tipoArquivoRmRt = 'RM' ORDER BY cod";
	String QUERY_HEADER_LOTE = "SELECT headerLote FROM FolhaHeaderLote headerLote WHERE headerLote.codHeaderArq = :codHeaderArq ORDER BY cod";
	String QUERY_DETALHE_A = "SELECT detA FROM FolhaPagamentoDetalheA detA WHERE detA.codHeaderLote = :codHeaderLote ORDER BY cod";
	String QUERY_DETALHE_B = "SELECT detB FROM FolhaPagamentoDetalheB detB WHERE detB.codDet = :codDet ORDER BY cod";
	String QUERY_DETALHE_C = "SELECT detC FROM FolhaPagamentoDetalheC detC WHERE detC.codDet = :codDet ORDER BY cod";
	String QUERY_DELETE_DETALHE_C = "DELETE FROM FolhaPagamentoDetalheC WHERE codDet IN :listIdFolhaPagamentoDetalheC";
	String QUERY_DELETE_DETALHE_B = "DELETE FROM FolhaPagamentoDetalheB WHERE codDet IN :listIdFolhaPagamentoDetalheB";
	String QUERY_DELETE_DETALHE_A = "DELETE FROM FolhaPagamentoDetalheA WHERE codHeaderLote IN :listIdFolhaPagamentoDetalheA";
	String QUERY_DELETE_HEADER_LOTE = "DELETE FROM FolhaHeaderLote WHERE cod IN :listIdFolhaHeaderLote";
	String QUERY_DELETE_HEADER_ARQUIVO = "DELETE FROM FolhaHeaderArquivo WHERE cod IN :listIdFolhaHeaderArquivo";

	@Query(value = QUERY_HEADER_ARQUIVO)
	List<FolhaHeaderArquivo> listarHeaderArquivo();

	@Query(value = QUERY_HEADER_LOTE)
	List<FolhaHeaderLote> listarFolhaHeaderLote(@Param("codHeaderArq") Long codHeaderArq);

	@Query(value = QUERY_DETALHE_A)
	List<FolhaPagamentoDetalheA> listarFolhaPagamentoDetalheA(@Param("codHeaderLote") Long codHeaderLote);

	@Query(value = QUERY_DETALHE_B)
	List<FolhaPagamentoDetalheB> listarFolhaPagamentoDetalheB(@Param("codDet") Long codDet);

	@Query(value = QUERY_DETALHE_C)
	List<FolhaPagamentoDetalheC> listarFolhaPagamentoDetalheC(@Param("codDet") Long codDet);

	@Modifying
	@Transactional
	@Query(value = QUERY_DELETE_DETALHE_C)
	void deletePagamentoDetalheCByListId(@Param("listIdFolhaPagamentoDetalheC") List<Long> listIdFolhaPagamentoDetalheC);

	@Modifying
	@Transactional
	@Query(value = QUERY_DELETE_DETALHE_B)
	void deletePagamentoDetalheBByListId(@Param("listIdFolhaPagamentoDetalheB") List<Long> listIdFolhaPagamentoDetalheB);

	@Modifying
	@Transactional
	@Query(value = QUERY_DELETE_DETALHE_A)
	void deletePagamentoDetalheAByListId(@Param("listIdFolhaPagamentoDetalheA") List<Long> listIdFolhaPagamentoDetalheA);

	@Modifying
	@Transactional
	@Query(value = QUERY_DELETE_HEADER_LOTE)
	void deleteHeaderLoteByListId(@Param("listIdFolhaHeaderLote") List<Long> listIdFolhaHeaderLote);

	@Modifying
	@Transactional
	@Query(value = QUERY_DELETE_HEADER_ARQUIVO)
	void deleteHeaderArquivoByListId(@Param("listIdFolhaHeaderArquivo") List<Long> listIdFolhaHeaderArquivo);

}

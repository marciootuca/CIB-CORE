package br.com.lello.cibcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.lello.cibcore.model.remessa.HeaderArquivo;

public interface CNABArquivoRepository extends JpaRepository<HeaderArquivo, Long> {

	String QUERY = "Select h From HeaderArquivo h WHERE h.tipoArquivoRmRt='RM' AND h.tipoEndpoint = ?1 ";

	@Query(value = QUERY)
	List<HeaderArquivo> listarPorTipo(String tipo);

}

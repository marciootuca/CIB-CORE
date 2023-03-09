package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.remessa.HeaderArquivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoHeaderArquivoRepository extends JpaRepository<HeaderArquivo, Long> {

}

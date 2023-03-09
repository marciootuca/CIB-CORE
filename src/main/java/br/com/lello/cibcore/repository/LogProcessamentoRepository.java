package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.LogProcessamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LogProcessamentoRepository extends JpaRepository<LogProcessamento, Long> {

    Optional<LogProcessamento> findDistinctByCodigo(Long codigo);

    @Query("SELECT l FROM LogProcessamento l WHERE l.nomeProcudere = ?1 AND l.dataInicio = (SELECT MAX (l2.dataInicio) FROM LogProcessamento l2 WHERE l.nomeProcudere = l2.nomeProcudere)")
    Optional<LogProcessamento> obterUltimoRegistro(String nomeProcedure);
}

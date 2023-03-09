package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.CndPlano;
import br.com.lello.cibcore.model.Cndhisto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CndPlanoRepository extends JpaRepository<CndPlano, Integer> {

    @Query("Select c From CndPlano c where c.recnum = ?1 ")
    Optional<CndPlano> obterPlanoPeloRecNum(Long recNum);

    @Query("Select c From CndPlano c where c.codReduzido = ?1 ")
    Optional<CndPlano> obterPlanoPeloCodReduzido(Integer recNum);
}
package br.com.lello.cibcore.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.lello.cibcore.model.Parcela;
import br.com.lello.cibcore.model.ParcelaId;

@Repository
public interface ParcelaRepository extends JpaRepository<Parcela, ParcelaId> {
    @Query(value = "SELECT p FROM Parcela p WHERE p.acordo = ?1")
    Optional<Parcela> obterCodigoParcela(Long codigo);

    @Query(value = "SELECT p FROM Parcela p WHERE p.acordo = ?1")
    List<Parcela> obterValorParcela(Long codigo);

    @Query(value = "SELECT p.id.dtvencto FROM Parcela p WHERE p.id.acordo = ?1 AND ROWNUM = 1 ORDER BY p.id.dtvencto")
    LocalDate obterDataPrimeiroVencimentoParcela(Integer codigo);

    @Query(value = "SELECT p FROM Parcela p WHERE p.codigo = ?1")
	List<Parcela> obterParcelasAcordo(Long codigo);
}
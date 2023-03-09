package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.Cndrecib;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CndrecibRepository extends JpaRepository<Cndrecib, Long> {

    @Query("SELECT r FROM Cndrecib r WHERE r.condominio = ?1 AND r.recibo = ?2 ")
    Optional<Cndrecib> buscarRecibosPeloCondominioERecibo(Long condominio, Long recibo);

    @Query("SELECT r FROM Cndrecib r WHERE r.flagSituacao IS NOT NULL AND r.recibo = ?1 ")
    Optional<Cndrecib> buscarRecibIsNotNull(Long recnum);

    @Query("SELECT r FROM Cndrecib r WHERE r.condominio = ?1 AND r.recibo = ?2 ")
    Cndrecib buscarRecibPeloCondominioERecibo(Long condominio, Long recibo);
}
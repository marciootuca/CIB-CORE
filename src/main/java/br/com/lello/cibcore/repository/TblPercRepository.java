package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.TblPerc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TblPercRepository extends JpaRepository<TblPerc, Long> {

    @Query("SELECT p FROM TblPerc p WHERE p.id.acordo = ?1 AND p.id.condominio = ?2 AND p.conta = ?3")
    TblPerc buscarPercPeloAcordoCondominioEconta(Long codAcordo, Long condominio, Long Conta);

}
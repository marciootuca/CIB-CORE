package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.Ocoraux;
import br.com.lello.cibcore.model.OcorauxId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OcorauxRepository extends JpaRepository<Ocoraux, Long> {

    @Query("SELECT o FROM Ocoraux o WHERE o.id.condominio = ?1 AND o.id.recibo = ?2 AND o.id.unidade = ?3")
    Optional<Ocoraux> buscarOcorauxsPeloCondominioReciboEunidade(Long condominio, Long recibo, String  unidade);

    @Query("SELECT o FROM Ocoraux o WHERE o.id.condominio = ?1 AND o.id.recibo = ?2 AND o.id.unidade = ?3")
    Ocoraux buscarOcorauxPeloCondominioReciboEunidade(Long condominio, Long recibo, String  unidade);

}
package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.Dossie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DossieRepository extends JpaRepository<Dossie, Long> {
    @Query("SELECT d FROM Dossie d WHERE d.condominio = ?1 and d.acordo = ?2 ")
    List<Dossie> buscarListagemDossie(Long cod_condominio, Long cod_acordo);
}

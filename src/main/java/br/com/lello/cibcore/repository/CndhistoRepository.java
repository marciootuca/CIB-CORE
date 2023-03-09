package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.Cndhisto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CndhistoRepository extends JpaRepository<Cndhisto, Integer> {
    @Query("SELECT h FROM Cndhisto h WHERE h.condominio = ?1 AND h.emissao = ?2 ")
    Optional<Cndhisto> buscaHistPeloCondominioEmissao(Long condominio, Long emissao);

}
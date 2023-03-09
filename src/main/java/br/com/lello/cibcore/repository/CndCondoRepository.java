package br.com.lello.cibcore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.lello.cibcore.model.CndCondo;

public interface CndCondoRepository extends JpaRepository<CndCondo, Long> {
	@Query(value = "SELECT * FROM CndCondo c", nativeQuery = true)
	List<CndCondo> obterLista();

	@Query(value = "SELECT c FROM CndCondo c WHERE c.codigo = ?1")
	Optional<CndCondo> obterPelaReferencia(Long numReferencia);

	@Query(value = "SELECT c FROM CndCondo c WHERE c.codigo = ?1 AND (c.contaVinculada IS NULL OR c.contaVinculada IN (' ', 'N'))")
	Optional<CndCondo> obterCondominioSemContaVinculada(Long condominio);

	@Query(value = "SELECT c FROM CndCondo c WHERE c.codigo = ?1 AND c.agenciaLello = '30'")
	Optional<CndCondo> obterRegistroAgenciaLelloIgual30(Long condominio);

	@Query(value = "SELECT c FROM CndCondo c WHERE c.codigo = ?1 and c.esccob > 0")
	Optional<CndCondo> obterPelaReferenciaCndEscobMaiorZero(Long numReferencia);
}

package br.com.lello.cibcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.lello.cibcore.model.remessa.Retorno;

public interface RetornoRepository extends JpaRepository<Retorno, Long> {

	@Query("SELECT r FROM Retorno r")
	Retorno obterRetorno();

}

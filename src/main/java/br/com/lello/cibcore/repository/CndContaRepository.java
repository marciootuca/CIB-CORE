package br.com.lello.cibcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.lello.cibcore.model.CndConta;

public interface CndContaRepository extends JpaRepository<CndConta, Long> {
	
	@Query("SELECT c FROM CndConta c WHERE NOT c.codBanco IS NULL AND NOT c.condominio IS NULL ORDER BY c.codBanco, c.condominio")
	List<CndConta> listarContaECondiminoWhereBancoAndCondiminoNotNull();
}
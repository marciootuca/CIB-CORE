package br.com.lello.cibcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lello.cibcore.model.remessa.PagH;

public interface HeaderLoteRepository extends JpaRepository<PagH, Long> {

}

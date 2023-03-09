package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.remessa.HeaderLoteTrib;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoHeaderRepository extends JpaRepository<HeaderLoteTrib, Long> {

}

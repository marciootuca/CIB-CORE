package br.com.lello.cibcore.repository;
import br.com.lello.cibcore.model.remessa.Remessa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RemessaRepository extends JpaRepository<Remessa, Long> {

//    @Query("SELECT r FROM Remessa r")
//    Remessa obterRemessa();

}

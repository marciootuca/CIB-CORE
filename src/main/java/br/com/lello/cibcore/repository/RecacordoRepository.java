package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.Recacordo;
import br.com.lello.cibcore.model.RecacordoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecacordoRepository extends JpaRepository<Recacordo, RecacordoId> {

   //@Query("SELECT r FROM Recacordo r WHERE r.id.acordo = ?1")
  //  List<Recacordo> listaAcordosEmRecAcordo(Long acordo);
    
 //   @Query(value = "SELECT CASE WHEN COUNT(1) = 0 THEN 0 ELSE 1 END FROM Recacordo r WHERE r.acordo = ?1", nativeQuery = true)
//    int possuiAcordosEmRecAcordo(Long acordo);
}
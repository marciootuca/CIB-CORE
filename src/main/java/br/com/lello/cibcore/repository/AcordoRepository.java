package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.Acordo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AcordoRepository extends JpaRepository<Acordo, Integer> {
    @Query("SELECT a FROM Acordo a WHERE a.status = '4' AND a.processado  = ' ' AND a.dtinclusao >= ?1 AND a.tipo <> '3' ")
    List<Acordo> buscarTratativaDeBloqueioRemessas(Date dtInclusao);

    @Query("SELECT a FROM Acordo a WHERE a.status = '1' AND a.dtinclusao >= ?1 AND a.tipo <> '3' ")
    List<Acordo> buscarTratativaDeBloqueioRemessasTeste(Date dtInclusao);

}
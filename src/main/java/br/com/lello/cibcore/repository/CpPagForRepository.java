package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.CpPagFOR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CpPagForRepository extends JpaRepository<CpPagFOR,Long> {
    @Query(value = "SELECT count(*) FROM CONDO.CPPAGFOR c where c.numero_doc = :recNum" ,nativeQuery = true)
   int count(@Param("recNum") Long recNum);

    Optional<CpPagFOR> findByNumeroDoc(Long numeroDoc);
}

package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.CpLancto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface CpLanctoRepository extends JpaRepository<CpLancto, Long> {
    @Query(value = "SELECT c FROM CpLancto c WHERE c.dataVencimento  >= ?1  AND c.cnpj IS NOT NULL AND c.tipo IN('A','R','P','D','T','N') AND c.tipoPE = ?2 AND c.status IN('L','C')")
    List<CpLancto> obterListaPrePocessamento(Date dataVencimento, String tipoE);

    @Query("select c from CpLancto  c where c.tipo = 'T' and c.numeroDoc = ?1 and exists (SELECT lancto FROM CpLibDoc doc, CpLancto lancto WHERE  lancto.numeroDoc = doc.numeroDoc AND doc.envioBanco = 'N' AND doc.liberado = 'S')")
    CpLancto existeRegistroEmCpLibDoc(Long numeroDoc);

    @Procedure(procedureName = "RESIN20.PROC_RESIN")
    void executarLancamentoRemessas(@Param("P_DATA") Date data);

}

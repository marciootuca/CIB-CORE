package br.com.lello.cibcore.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.lello.cibcore.model.TblFicha;
import br.com.lello.cibcore.model.TblFichaId;

public interface TblFichaRepository extends JpaRepository<TblFicha, TblFichaId> {
	@Query(value =
    		"SELECT " +
    		"	F.* " +
            "FROM " +
            "	ACOB.TBLFICHA F, ACOB.TBLRECIB R, ACOB.TBLHISTO H " +
            "WHERE " +
            "	F.TIPO = 1 " +
            "	AND NVL(F.FLAG_REMESSA, ' ') IN (' ', 'V', 'C') " +
            "	AND F.IMPRESSO = '*' " +
            "	AND NVL(F.EMITE, ' ') = 'E' " +
            "	AND NVL(R.VALOR, 0) > 0 " +
            "	AND H.CONDOMINIO = R.CONDOMINIO " +
            "	AND H.ACORDO = F.ACORDO " +
            "	AND R.CONDOMINIO = F.CONDOMINIO " +
            "	AND R.ACORDO = F.ACORDO " +
            "	AND R.RECIBO = F.RECIBO " +
            "	AND SUBSTR(F.NRO_BANCARIO, 1, 3) = :banco " +
            "	AND H.CONTA_BANCARIA = :conta " +
            "	AND R.VENCTO >= :dataVencimento " +
            "ORDER BY " +
            "	F.FLAG_REMESSA, F.NRO_BANCARIO", nativeQuery = true)
    List<TblFicha> obterFichasBancoCarteira(@Param("banco") String banco, @Param("conta") Long conta, @Param("dataVencimento") Date dataVencimento);
}

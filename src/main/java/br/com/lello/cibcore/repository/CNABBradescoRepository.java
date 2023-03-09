package br.com.lello.cibcore.repository;

import br.com.lello.cibcore.model.CNABBradesco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CNABBradescoRepository extends JpaRepository<CNABBradesco, Long> {

    String QUERY = "Select Cplancto.Cnpj as cnpj, " +
            "       Cplancto.Tipo as tipo, " +
            "       Cplancto.Status as status, " +
            "       Cplancto.FL_Envio_Bco as flEnvioBco, " +
            "       Cplancto.Cod_Erro2 as codErro2, " +
            "       Cplancto.Data_Vencimento as dataVencimento, " +
            "       Cplancto.Tipo_P_E as tipoPE, " +
            "       Cplancto.Data_Lancamento as dataLancamento, " +
            "       Cplancto.Banco_Pagto as bancoPagto, " +
            "       Cplancto.Numero_Doc as numeroDoc, " +
            "       Cplibdoc.Envio_Bco as envioBanco, " +
            "       Cplibdoc.Liberado as liberado, " +
            "       Cndcondo.Cta_Vinculada as contaVinculada, " +
            "       Cppagfor.Flag_Iss as flagISS, " +
            "       Cppagfor.Valor as valor, " +
            "       Cpirrf.Valor_Irrf as valorIRRF, " +
            "       Cpiss.Valor_iss as valorISS, " +
            "       Cpinssa.Valor_Inss as valorINSS, " +
            "       Cpcsll.Valor_Csll as valorCSLL, " +
            "       Cpcsll.Valor_Cofins as valorCOFINS, " +
            "       Cpcsll.Valor_Pispasep as valorPISPASEP, " +
            "       Cpsegur.Valor_Seguridad as valorSeguridade " +
            "  From  Condo.Cplancto, " +
            "        Condo.Cppagfor, " +
            "        Condo.Cpsegur, " +
            "        Condo.Cpinssa, " +
            "        Condo.Cpcsll, " +
            "        Condo.Cpirrf, " +
            "        Condo.Cpiss, " +
            "        Condo.Cplancta, " +
            "        Condo.Cpcondo, " +
            "        Condo.Cplibdoc, " +
            "        Condo.Cndcondo, " +
            "  Where Condo.Cplancto.Numero_Doc         = Condo.Cppagfor.Numero_Doc(+) " +
            "    And Condo.Cplibdoc.Numero_Doc         = Condo.Cplancto.Numero_Doc " +
            "    And Condo.Cpsegur.Numero_Doc(+)       = Condo.Cppagfor.Numero_Doc " +
            "    And Condo.Cpinssa.Numero_Doc(+)       = Condo.Cppagfor.Numero_Doc " +
            "    And Condo.Cpcsll.Numero_Doc(+)        = Condo.Cppagfor.Numero_Doc " +
            "    And Condo.Cpirrf.Numero_Doc(+)        = Condo.Cppagfor.Numero_Doc " +
            "    And Condo.Cpiss.Numero_Doc(+)         = Condo.Cppagfor.Numero_Doc " +
            "    And Condo.Cplancta.Numero_Doc(+)      = Condo.Cppagfor.Numero_Doc " +
            "    And Condo.Cpcondo.Codigo(+)           = Condo.Cplancto.Referencia " +
            "    And Condo.Cplancto.Tipo_P_E          In ('I','!') " +
            "    And Condo.Cplancto.Banco_Pagto       <> 341 " +
            "    And Condo.Cndcondo.Cta_Vinculada     <> 'S' " +
            "    And Cplancto.Cnpj                    Is Not Null " +
            "    And Cplancto.Tipo In ('A','D','R','T','P','N','9'); ";

    @Query(value = QUERY, nativeQuery = true)
    List<CNABBradesco> obterRegistros();

}

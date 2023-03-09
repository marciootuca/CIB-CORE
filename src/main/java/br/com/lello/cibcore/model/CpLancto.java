package br.com.lello.cibcore.model;

import br.com.lello.cibcore.enuns.StatusCpLanctoEnum;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CPLANCTO")
public class CpLancto implements Serializable, Comparable<CpLancto>{

    @Id
    @Getter
    @Setter
    @Column(name = "NUMERO_DOC")
    private Long numeroDoc;

    @Getter
    @Setter
    @Column(name = "RECNUM")
    private Long idCpLancto;

    @Getter
    @Setter
    @Column(name = "GRUPO")
    private String grupo;

    @Getter
    @Setter
    @Column(name = "AGENCIA")
    private String agencia;

    @Getter
    @Setter
    @Column(name = "PROP_IMOVEL")
    private String propImovel;

    @Getter
    @Setter
    @Column(name = "REFERENCIA")
    private String referencia;

    @Getter
    @Setter
    @Column(name = "DATA_LANCAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataLancamento;

    @Getter
    @Setter
    @Column(name = "DATA_VENCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;

    @Getter
    @Setter
    @Column(name = "HISTORICO_1")
    private String historico1;

    @Getter
    @Setter
    @Column(name = "HISTORICO_2")
    private String historico2;

    @Getter
    @Setter
    @Column(name = "VALOR")
    private BigDecimal valor;

    @Getter
    @Setter
    @Column(name = "STATUS")
    private String status;

    @Getter
    @Setter
    @Column(name = "STATUS_INVERSE_KEY")
    private String statusInverseKey;

    @Getter
    @Setter
    @Column(name = "DATA_PAGAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    @Getter
    @Setter
    @Column(name = "TIPO")
    private String tipo;

    @Getter
    @Setter
    @Column(name = "COD_TIPO")
    private String codTipo;

    @Getter
    @Setter
    @Column(name = "NUMERO_CHEQUE")
    private Long numeroCheque;

    @Getter
    @Setter
    @Column(name = "CONTA")
    private String conta;

    @Getter
    @Setter
    @Column(name = "MES_REFERENCIA")
    private Long mesReferencia;

    @Getter
    @Setter
    @Column(name = "TIPO_P_E")
    private String tipoPE;

    @Getter
    @Setter
    @Column(name = "ORIGEM")
    private Long origem;

    @Getter
    @Setter
    @Column(name = "HIST_PRINCIPAL")
    private String histPrincipal;

    @Getter
    @Setter
    @Column(name = "DATA_BAIXA")
    @Temporal(TemporalType.DATE)
    private Date dataBaixa;

    @Getter
    @Setter
    @Column(name = "AUTOMATICO")
    private String automatico;

    @Getter
    @Setter
    @Column(name = "GRAVOU_MOVLOC")
    private String gravouMovloc;

    @Getter
    @Setter
    @Column(name = "TIPO_MOEDA")
    private String tipoMoeda;

    @Getter
    @Setter
    @Column(name = "VALOR_BTN_TR")
    private BigDecimal valorBtnTr;

    @Getter
    @Setter
    @Column(name = "USUARIO")
    private String usuario;

    @Getter
    @Setter
    @Column(name = "DATA_SL")
    @Temporal(TemporalType.DATE)
    private Date dataSl;

    @Getter
    @Setter
    @Column(name = "FLAG_AUTONOMO")
    private String flagAutonomo;

    @Getter
    @Setter
    @Column(name = "FLAG_REMESSA")
    private String flagRemessa;

    @Getter
    @Setter
    @Column(name = "FLAG_ISS")
    private String flagIss;

    @Getter
    @Setter
    @Column(name = "FL_LIDO_DIGITA")
    private String flLidoDigita;

    @Getter
    @Setter
    @Column(name = "FL_PGTO")
    private String flPgto;

    @Getter
    @Setter
    @Column(name = "FL_AGEND")
    private String flAgend;

    @Getter
    @Setter
    @Column(name = "FL_ENVIO_BCO")
    private String flEnvioBco;

    @Getter
    @Setter
    @Column(name = "BL_BAIXA")
    private String blBaixa;

    @Getter
    @Setter
    @Column(name = "CNPJ")
    private String cnpj;

    @Getter
    @Setter
    @Column(name = "DATA_AGEN")
    @Temporal(TemporalType.DATE)
    private Date dataAgen;

    @Getter
    @Setter
    @Column(name = "NOSSO_NUMERO")
    private Long nossoNumero;

    @Getter
    @Setter
    @Column(name = "CARTEIRA")
    private Long carteira;

    @Getter
    @Setter
    @Column(name = "ANO_NOSSO_NUM")
    private Long anoNossoNum;

    @Getter
    @Setter
    @Column(name = "BANCO_FORN")
    private String bancoForn;

    @Getter
    @Setter
    @Column(name = "AGENCIA_FORN")
    private String agenciaForn;

    @Getter
    @Setter
    @Column(name = "CONTA_FORN")
    private String contaForn;

    @Getter
    @Setter
    @Column(name = "DIGITO_CONTA")
    private String digitoConta;

    @Getter
    @Setter
    @Column(name = "NUM_REMESSA")
    private Long numRemessa;

    @Getter
    @Setter
    @Column(name = "TIPO_DOC_BCO")
    private Long tipoDocBco;

    @Getter
    @Setter
    @Column(name = "NUM_PAGTO")
    private String numPagto;

    @Getter
    @Setter
    @Column(name = "COD_ERRO1")
    private String codErro1;

    @Getter
    @Setter
    @Column(name = "COD_ERRO2")
    private String codErro2;

    @Getter
    @Setter
    @Column(name = "CONTA_POUP")
    private String contaPoup;

    @Getter
    @Setter
    @Column(name = "DIGITO_AGENCIA")
    private String digitoAgencia;

    @Getter
    @Setter
    @Column(name = "COD_CONTA_DIG")
    private String codContaDig;

    @Getter
    @Setter
    @Column(name = "BANCO_PAGTO")
    private Long bancoPagto;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CpLancto cpLancto = (CpLancto) o;
        return numeroDoc != null && Objects.equals(numeroDoc, cpLancto.numeroDoc);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroDoc == null) ? 0 : numeroDoc.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return numeroDoc + "";
    }

    public String getStatusFormatado() {

        if (this.status != null) {
            return StatusCpLanctoEnum.getByCodigo(this.status).getDescricao();

        }

        return null;
    }

    @Override
    public int compareTo(CpLancto o) {
        if (o == null) {
            return -1;
        }
        if (this.numeroDoc == null) {
            return 1;
        }
        return o.getNumeroDoc().compareTo(this.numeroDoc);
    }
}

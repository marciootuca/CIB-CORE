package br.com.lello.cibcore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "CNDHISTO")
public class Cndhisto {
    @Id
    @Column(name = "RECNUM")
    private Integer recnum;

    @Column(name = "CONDOMINIO")
    private Long condominio;

    @Column(name = "EMISSAO")
    private Long emissao;

    @Column(name = "PRIM_VENCTO")
    private Date primVencto;

    @Column(name = "SEG_VENCTO")
    private Date segVencto;

    @Column(name = "PRIM_MULTA", precision = 4, scale = 2)
    private BigDecimal primMulta;

    @Column(name = "LIMITE_PAGTO")
    private Date limitePagto;

    @Column(name = "SEG_MULTA", precision = 4, scale = 2)
    private BigDecimal segMulta;

    @Column(name = "CONTA_BANCARIA")
    private Integer contaBancaria;

    @Column(name = "CONTA_1")
    private Long conta1;

    @Column(name = "CONTA_2")
    private Long conta2;

    @Column(name = "CONTA_3")
    private Long conta3;

    @Column(name = "CONTA_4")
    private Long conta4;

    @Column(name = "CONTA_5")
    private Long conta5;

    @Column(name = "HISTORICO_1", length = 28)
    private String historico1;

    @Column(name = "HISTORICO_2", length = 28)
    private String historico2;

    @Column(name = "HISTORICO_3", length = 28)
    private String historico3;

    @Column(name = "HISTORICO_4", length = 28)
    private String historico4;

    @Column(name = "HISTORICO_5", length = 28)
    private String historico5;

    @Column(name = "VALOR_RATEIO", precision = 12, scale = 2)
    private BigDecimal valorRateio;

    @Column(name = "DATA_PROCESSO")
    private Date dataProcesso;

    @Column(name = "FLAG_BALANCETE", length = 1)
    private String flagBalancete;

    @Column(name = "AGENCIA_LELLO", length = 2)
    private String agenciaLello;

    @Column(name = "USUARIO", length = 10)
    private String usuario;

    @Column(name = "DTBALI")
    private Date dtbali;

    @Column(name = "DTBALF")
    private Date dtbalf;

    @Column(name = "FLAG_REMESSA", length = 1)
    private String flagRemessa;

    @Column(name = "DATA_INC")
    private Date dataInc;

    @Column(name = "CANCELADO", length = 1)
    private String cancelado;

    @Column(name = "CONTA_6")
    private Long conta6;

    @Column(name = "CONTA_7")
    private Long conta7;

    @Column(name = "HISTORICO_6", length = 28)
    private String historico6;

    @Column(name = "HISTORICO_7", length = 28)
    private String historico7;

    @Column(name = "FL_ARQ_DEVI", length = 1)
    private String flArqDevi;

    @Column(name = "TIPO_BOLETO")
    private Integer tipoBoleto;

    @Column(name = "CONTA_8")
    private Long conta8;

    @Column(name = "CONTA_9")
    private Long conta9;

    @Column(name = "CONTA_10")
    private Long conta10;

    @Column(name = "CONTA_11")
    private Long conta11;

    @Column(name = "CONTA_12")
    private Long conta12;

    @Column(name = "HISTORICO_8", length = 28)
    private String historico8;

    @Column(name = "HISTORICO_9", length = 28)
    private String historico9;

    @Column(name = "HISTORICO_10", length = 28)
    private String historico10;

    @Column(name = "HISTORICO_11", length = 28)
    private String historico11;

    @Column(name = "HISTORICO_12", length = 28)
    private String historico12;

    @Column(name = "GEROU_NRO_BANC", length = 1)
    private String gerouNroBanc;

    @Column(name = "FLAG_538", length = 1)
    private String flag538;

    @Column(name = "FLAG_913", length = 1)
    private String flag913;

    @Column(name = "FLAG_OUTROS", length = 1)
    private String flagOutros;

    @Column(name = "FL_SEGURO")
    private Long flSeguro;

    @Column(name = "IMPRESSAO")
    private Long impressao;



}
package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "TBLHISTO")
public class TblHisto {
    @EmbeddedId
    private TblHistoId id;

    @Column(name = "RECNUM")
    private Long recnum;

    @Temporal(TemporalType.DATE)
    @Column(name = "PRIM_VENCTO")
    private Date primVencto;

    @Temporal(TemporalType.DATE)
    @Column(name = "SEG_VENCTO")
    private Date segVencto;

    @Column(name = "PRIM_MULTA", precision = 4, scale = 2)
    private BigDecimal primMulta;

    @Temporal(TemporalType.DATE)
    @Column(name = "LIMITE_PAGTO")
    private Date limitePagto;

    @Column(name = "SEG_MULTA", precision = 4, scale = 2)
    private BigDecimal segMulta;

    @Column(name = "CONTA_BANCARIA")
    private Long contaBancaria;

    @Column(name = "VALOR_ACORDO", precision = 14, scale = 2)
    private BigDecimal valorAcordo;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PROCESSO")
    private Date dataProcesso;

    @Column(name = "AGENCIA_LELLO", length = 2)
    private String agenciaLello;

    @Column(name = "USUARIO", length = 10)
    private String usuario;

    @Column(name = "FLAG_REMESSA", length = 1)
    private String flagRemessa;

    @Column(name = "CANCELADO", length = 1)
    private String cancelado;


}
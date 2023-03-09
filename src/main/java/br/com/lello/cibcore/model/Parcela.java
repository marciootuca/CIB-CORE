package br.com.lello.cibcore.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Getter
@Setter
@Table(name = "PARCELA")
public class Parcela implements Serializable {
    private static final long serialVersionUID = 5950349722370032158L;

    @EmbeddedId
    private ParcelaId id;

    @MapsId("acordo")
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ACORDO", nullable = false)
    private Acordo acordo;

    @Column(name = "RECNUM", nullable = false)
    private Long recnum;

    @Column(name = "VALOR", precision = 16, scale = 2)
    private BigDecimal valor;

    @Column(name = "TIPO", length = 1)
    private String tipo;

    @Column(name = "STATUS", nullable = false, length = 1)
    private String status;

    @Column(name = "DTPGTO")
    private Date dtpgto;

    @Column(name = "BANCO", length = 4)
    private String banco;

    @Column(name = "AGENCIA", length = 20)
    private String agencia;

    @Column(name = "CHEQUE", length = 20)
    private String cheque;

    @Column(name = "BOLETO", length = 20)
    private String boleto;

    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    @Column(name = "DTRECIBO")
    private Date dtrecibo;

    @Column(name = "MDRECIBO", length = 30)
    private String mdrecibo;

    @Column(name = "CODALT_REC")
    private Long codaltRec;

    @Column(name = "CODAUT")
    private Long codaut;

    @Column(name = "DTBOLETO")
    private Date dtboleto;

    @Column(name = "BANCO_SENIO")
    private Integer bancoSenio;

    @Column(name = "AGENCIA_SENIO", length = 4)
    private String agenciaSenio;

    @Column(name = "DIG_AGENC_SENIO", length = 1)
    private String digAgencSenio;

    @Column(name = "CTA_CORR_SENIO", length = 15)
    private String ctaCorrSenio;

    @Column(name = "DIG_CTA_SENIO", length = 2)
    private String digCtaSenio;

    @Column(name = "DATA_SENIO")
    private Date dataSenio;

    @Column(name = "HISTORICO_SENIO", length = 53)
    private String historicoSenio;

    @Column(name = "NRO_BANCARIO", length = 18)
    private String nroBancario;


}
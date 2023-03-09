package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "CNDRECIB")
public class Cndrecib {

    @Id
    @Column(name = "RECIBO")
    private Long recibo;

    @Column(name = "RECNUM")
    private Long recnum;

    @Column(name = "CONDOMINIO")
    private Long condominio;

    @Column(name = "BLOCO")
    private Long bloco;

    @Column(name = "UNIDADE", length = 6)
    private String unidade;

    @Column(name = "EMISSAO")
    private Long emissao;

    @Column(name = "VALOR_1", precision = 12, scale = 2)
    private BigDecimal valor1;

    @Column(name = "VALOR_2", precision = 12, scale = 2)
    private BigDecimal valor2;

    @Column(name = "VALOR_3", precision = 12, scale = 2)
    private BigDecimal valor3;

    @Column(name = "VALOR_4", precision = 12, scale = 2)
    private BigDecimal valor4;

    @Column(name = "VALOR_5", precision = 12, scale = 2)
    private BigDecimal valor5;

    @Column(name = "DATA_RECBTO")
    private Date dataRecbto;

    @Column(name = "VALOR_RECEBIDO", precision = 12, scale = 2)
    private BigDecimal valorRecebido;

    @Column(name = "FLAG_SITUACAO", length = 1)
    private String flagSituacao;

    @Column(name = "REGISTROEMISSAO")
    private Long registroemissao;

    @Column(name = "VENCTO")
    private Date vencto;

    @Column(name = "CONTRA_PARTIDA")
    private Integer contraPartida;

    @Column(name = "FLAG_REMESSA", length = 1)
    private String flagRemessa;

    @Column(name = "ISENTO", length = 1)
    private String isento;

    @Column(name = "ACORDO")
    private Boolean acordo;

    @Column(name = "VALOR_6", precision = 12, scale = 2)
    private BigDecimal valor6;

    @Column(name = "VALOR_7", precision = 12, scale = 2)
    private BigDecimal valor7;

    @Column(name = "VALOR_BANCO", precision = 12, scale = 2)
    private BigDecimal valorBanco;

    @Column(name = "VALOR_8", precision = 12, scale = 2)
    private BigDecimal valor8;

    @Column(name = "VALOR_9", precision = 12, scale = 2)
    private BigDecimal valor9;

    @Column(name = "VALOR_10", precision = 12, scale = 2)
    private BigDecimal valor10;

    @Column(name = "VALOR_11", precision = 12, scale = 2)
    private BigDecimal valor11;

    @Column(name = "VALOR_12", precision = 12, scale = 2)
    private BigDecimal valor12;

    @Column(name = "FLAG_ASSOCIACAO", length = 1)
    private String flagAssociacao;


}
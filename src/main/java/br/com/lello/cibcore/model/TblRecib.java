package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "TBLRECIB")
public class TblRecib {
    @EmbeddedId
    private TblRecibId id;

    @Column(name = "RECNUM")
    private Integer recnum;

    @Column(name = "PARCELA")
    private Short parcela;

    @Column(name = "UNIDADE", length = 6)
    private String unidade;

    @Column(name = "VALOR", precision = 14, scale = 2)
    private BigDecimal valor;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_RECBTO")
    private Date dataRecbto;

    @Column(name = "VALOR_RECEBIDO", precision = 14, scale = 2)
    private BigDecimal valorRecebido;

    @Column(name = "FLAG_SITUACAO", length = 1)
    private String flagSituacao;

    @Temporal(TemporalType.DATE)
    @Column(name = "VENCTO")
    private Date vencto;

    @Column(name = "CONTRA_PARTIDA")
    private Short contraPartida;

    @Column(name = "FLAG_REMESSA", length = 1)
    private String flagRemessa;

    @Column(name = "TITULO_BANCARIO", length = 1)
    private String tituloBancario;

    @Column(name = "NRO_BANCARIO", length = 18)
    private String nroBancario;

    @Column(name = "LIBERA_EMISSAO", length = 1)
    private String liberaEmissao;

    @Column(name = "COD_PARCELA")
    private Integer codParcela;

    @Column(name = "BANCO_PAGTO", length = 3)
    private String bancoPagto;

    @Column(name = "AGENCIA_PAGTO", length = 4)
    private String agenciaPagto;

}
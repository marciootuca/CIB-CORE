package br.com.lello.cibcore.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "ACORDO")
public class Acordo implements  Serializable, Comparable<Acordo> {
    private static final long serialVersionUID = -7555953093931466438L;
    @Id
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    @Column(name = "RECNUM", nullable = false)
    private Long recnum;

    @Column(name = "CONDOMINIO")
    private Long condominio;

    @Column(name = "UNIDADE", length = 6)
    private String unidade;

    @Column(name = "TIPO", length = 1)
    private String tipo;

    @Column(name = "DTINCLUSAO", nullable = false)
    private Date dtinclusao;

    @Column(name = "DTCALCULO")
    private Date dtcalculo;

    @Column(name = "VLTOTAL", precision = 16, scale = 2)
    private BigDecimal vltotal;

    @Column(name = "VLORIGINAL", precision = 16, scale = 2)
    private BigDecimal vloriginal;

    @Column(name = "VLMULTA", precision = 16, scale = 2)
    private BigDecimal vlmulta;

    @Column(name = "VLJURO", precision = 16, scale = 2)
    private BigDecimal vljuro;

    @Column(name = "VLDESPESA", precision = 16, scale = 2)
    private BigDecimal vldespesa;

    @Column(name = "VLCUSTA", precision = 16, scale = 2)
    private BigDecimal vlcusta;

    @Column(name = "VLOUTRO", precision = 16, scale = 2)
    private BigDecimal vloutro;

    @Column(name = "VLDESCONTO", precision = 16, scale = 2)
    private BigDecimal vldesconto;

    @Column(name = "USERALT", length = 30)
    private String useralt;

    @Column(name = "DTALT")
    private Date dtalt;

    @Column(name = "STATUS", nullable = false, length = 1)
    private String status;

    @Column(name = "PROCESSADO", nullable = false, length = 1)
    private String processado;

    @Column(name = "VLPAGO", precision = 16, scale = 2)
    private BigDecimal vlpago;

    @Column(name = "QTDPAGO")
    private Integer qtdpago;

    @Column(name = "DTTERMO")
    private Date dttermo;

    @Column(name = "JUROPAR")
    private Integer juropar;

    @Column(name = "CODAUT")
    private Long codaut;

    @Column(name = "MDTERMO", length = 30)
    private String mdtermo;

    @Column(name = "NOMTERMO")
    private Integer nomtermo;

    @Column(name = "ESCCOB")
    private Long esccob;

    @OneToMany(mappedBy = "acordo",fetch = FetchType.LAZY)
    private List<Parcela> parcelas ;


    @Override
    public int compareTo(Acordo o) {
        if (o == null) {
            return -1;
        }
        if (this.codigo == null) {
            return 1;
        }
        return o.getCodigo().compareTo(this.codigo);
    }
}
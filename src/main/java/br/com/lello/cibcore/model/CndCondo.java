package br.com.lello.cibcore.model;

import br.com.lello.cibcore.util.Util;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CNDCONDO")
@EqualsAndHashCode(of = { "codigo" })
@ToString
public class CndCondo implements Serializable, Comparable<CndCondo>{
    @Id
    @Getter
    @Setter
    private Long codigo;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    @Column(name = "RECNUM")
    private String recNum;


    @Getter
    @Setter
    @Column(name = "ENDERECO")
    private String endereco;

    @Getter
    @Setter
    @Column(name = "ESTADO")
    private String estado;

    @Getter
    @Setter
    @Column(name = "CIDADE")
    private String cidade;

    @Getter
    @Setter
    @Column(name = "CEP")
    private String cep;

    @Getter
    @Setter
    @Column(name = "SUFIXO_CEP")
    private String sufixoCep;

    @Getter
    @Setter
    @Column(name = "AGENCIA_LELLO")
    private String agenciaLello;

    @Getter
    @Setter
    @Column(name = "CTA_VINCULADA")
    private String contaVinculada;

    @Getter
    @Setter
    @Column(name = "CGC")
    private Long cgc;

    @Getter
    @Setter
    @Column(name = "DATA_FIM_ADM")
    private Date dataFimAdm;

    @Getter
    @Setter
    @Column(name = "ESCCOB")
    private Integer esccob;

    @Getter
    @Setter
    @Transient
    private String codigoIbge;

    @Getter
    @Setter
    @Column(name = "MULTA", precision = 16, scale = 2)
    private BigDecimal multa;

    public String getCepCompleto() {
        return Util.preencherZeroEsquerda(cep, 5) + Util.preencherZeroEsquerda(sufixoCep, 3);
    }

    @Override
    public int compareTo(CndCondo o) {
        if (o == null) {
            return -1;
        }
        if (this.codigo == null) {
            return 1;
        }
        return o.getCodigo().compareTo(this.codigo);
    }
}

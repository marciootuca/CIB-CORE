package br.com.lello.cibcore.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "CPPAGFOR")
@EqualsAndHashCode(of = { "numeroDoc" })
public class CpPagFOR implements Comparable<CpPagFOR> {

    @Getter
    @Setter
    @Id
    @Column(name = "NUMERO_DOC")
    private Long numeroDoc;

    @Getter
    @Setter
    @Column(name = "RECNUM")
    private Long recNum;

    @Getter
    @Setter
    @Column(name = "TIPO_FORNECEDOR")
    private String TipoFornecedor;

    @Getter
    @Setter
    @Column(name = "CNPJ")
    private String cnpj;

    @Getter
    @Setter
    @Column(name = "FLAG_ISS")
    private String flagISS;

    @Getter
    @Setter
    @Column(name = "VALOR")
    private BigDecimal valor;


    @Override
    public int compareTo(CpPagFOR o) {
        if (o == null) {
            return -1;
        }
        if (this.recNum == null) {
            return 1;
        }
        return o.getRecNum().compareTo(this.recNum);
    }
}

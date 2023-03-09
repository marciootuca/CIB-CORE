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
@Table(name = "CPIRRF")
@EqualsAndHashCode(of = { "numeroDoc" })
public class CpIRRF implements Comparable<CpIRRF> {

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
    @Column(name = "VALOR_IRRF")
    private BigDecimal valorIRRF;


    @Override
    public int compareTo(CpIRRF o) {
        if (o == null) {
            return -1;
        }
        if (this.recNum == null) {
            return 1;
        }
        return o.getRecNum().compareTo(this.recNum);
    }
}

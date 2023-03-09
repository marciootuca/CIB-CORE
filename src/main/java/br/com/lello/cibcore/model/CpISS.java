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
@Table(name = "CPISS")
@EqualsAndHashCode(of = { "numeroDoc" })
public class CpISS implements Comparable<CpISS> {

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
    @Column(name = "VALOR_ISS")
    private BigDecimal valorISS;


    @Override
    public int compareTo(CpISS o) {
        if (o == null) {
            return -1;
        }
        if (this.recNum == null) {
            return 1;
        }
        return o.getRecNum().compareTo(this.recNum);
    }
}

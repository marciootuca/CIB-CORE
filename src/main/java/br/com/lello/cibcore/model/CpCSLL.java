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
@Table(name = "CPCSLL")
@EqualsAndHashCode(of = { "numeroDoc" })
public class CpCSLL implements Comparable<CpCSLL> {

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
    @Column(name = "VALOR_CSLL")
    private BigDecimal valorCSLL;

    @Getter
    @Setter
    @Column(name = "VALOR_COFINS")
    private BigDecimal valorCOFINS;

    @Getter
    @Setter
    @Column(name = "VALOR_PISPASEP")
    private BigDecimal valorPISPASEP;


    @Override
    public int compareTo(CpCSLL o) {
        if (o == null) {
            return -1;
        }
        if (this.recNum == null) {
            return 1;
        }
        return o.getRecNum().compareTo(this.recNum);
    }
}

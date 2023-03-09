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
@Table(name = "CPSEGUR")
@EqualsAndHashCode(of = { "numeroDoc" })
public class CpSegur implements Comparable<CpSegur> {

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
    @Column(name = "VALOR_SEGURIDAD")
    private BigDecimal valorSeguridade;


    @Override
    public int compareTo(CpSegur o) {
        if (o == null) {
            return -1;
        }
        if (this.recNum == null) {
            return 1;
        }
        return o.getRecNum().compareTo(this.recNum);
    }
}

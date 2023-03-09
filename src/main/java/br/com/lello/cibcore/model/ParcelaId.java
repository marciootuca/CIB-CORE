package br.com.lello.cibcore.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class ParcelaId implements Serializable {
    private static final long serialVersionUID = 754293688377199732L;
    @Column(name = "ACORDO", nullable = false)
    private Integer acordo;

    @Column(name = "DTVENCTO", nullable = false)
    private LocalDate dtvencto;

    public Integer getAcordo() {
        return acordo;
    }

    public void setAcordo(Integer acordo) {
        this.acordo = acordo;
    }

    public LocalDate getDtvencto() {
        return dtvencto;
    }

    public void setDtvencto(LocalDate dtvencto) {
        this.dtvencto = dtvencto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ParcelaId entity = (ParcelaId) o;
        return Objects.equals(this.dtvencto, entity.dtvencto) &&
                Objects.equals(this.acordo, entity.acordo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtvencto, acordo);
    }

}
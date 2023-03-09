package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class TblRecibId implements Serializable {
    private static final long serialVersionUID = -2768964740762329248L;
    @Column(name = "CONDOMINIO", nullable = false)
    private Integer condominio;

    @Column(name = "ACORDO", nullable = false)
    private Integer acordo;

    @Column(name = "RECIBO", nullable = false)
    private Integer recibo;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TblRecibId entity = (TblRecibId) o;
        return Objects.equals(this.recibo, entity.recibo) &&
                Objects.equals(this.condominio, entity.condominio) &&
                Objects.equals(this.acordo, entity.acordo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recibo, condominio, acordo);
    }

}
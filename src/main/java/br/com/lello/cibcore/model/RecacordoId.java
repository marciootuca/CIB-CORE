package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class RecacordoId implements Serializable {
    private static final long serialVersionUID = 2539840072048985394L;
    @Column(name = "ACORDO", nullable = false)
    private Long acordo;
    @Column(name = "RECIBO", nullable = false)
    private Long recibo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RecacordoId entity = (RecacordoId) o;
        return Objects.equals(this.recibo, entity.recibo) &&
                Objects.equals(this.acordo, entity.acordo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recibo, acordo);
    }

}
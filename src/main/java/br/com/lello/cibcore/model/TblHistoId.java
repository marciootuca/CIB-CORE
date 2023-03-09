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
public class TblHistoId implements Serializable {
    private static final long serialVersionUID = 3578995850286296337L;
    @Column(name = "CONDOMINIO", nullable = false)
    private Long condominio;

    @Column(name = "ACORDO", nullable = false)
    private Long acordo;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TblHistoId entity = (TblHistoId) o;
        return Objects.equals(this.condominio, entity.condominio) &&
                Objects.equals(this.acordo, entity.acordo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condominio, acordo);
    }

}
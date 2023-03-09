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
public class TblFichaId implements Serializable {
    private static final long serialVersionUID = -687959241300747886L;
    @Column(name = "TIPO", nullable = false)
    private Integer tipo;

    @Column(name = "NRO_BANCARIO", nullable = false, length = 18)
    private String nroBancario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TblFichaId entity = (TblFichaId) o;
        return Objects.equals(this.tipo, entity.tipo) &&
                Objects.equals(this.nroBancario, entity.nroBancario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, nroBancario);
    }

}
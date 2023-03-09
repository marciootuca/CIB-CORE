package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Getter
@Setter
@Embeddable
public class OcorauxId implements Serializable {
    private static final long serialVersionUID = -86614970237942018L;
    @Column(name = "\"DATA\"", nullable = false)
    private LocalDate data;

    @Column(name = "TPOCOR", nullable = false)
    private Short tpocor;

    @Column(name = "CONDOMINIO", nullable = false)
    private Integer condominio;

    @Column(name = "UNIDADE", nullable = false, length = 6)
    private String unidade;

    @Column(name = "RECIBO", nullable = false)
    private Integer recibo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OcorauxId entity = (OcorauxId) o;
        return Objects.equals(this.recibo, entity.recibo) &&
                Objects.equals(this.tpocor, entity.tpocor) &&
                Objects.equals(this.data, entity.data) &&
                Objects.equals(this.condominio, entity.condominio) &&
                Objects.equals(this.unidade, entity.unidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recibo, tpocor, data, condominio, unidade);
    }

}
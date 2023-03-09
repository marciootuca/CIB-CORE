package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CPLIBDOC")
public class CpLibDoc {

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
    @Column(name = "REFERENCIA")
    private String referencia;

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_LANCAMENTO")
    private Date dataLancamento;


    @Getter
    @Setter
    @Column(name = "VALOR")
    private Double valor;

    @Getter
    @Setter
    @Column(name = "TIPO")
    private String tipo;

    @Getter
    @Setter
    @Column(name = "USUARIO")
    private String usuario;

    @Getter
    @Setter
    @Column(name = "FORNECEDOR")
    private String fornecedor;

    @Getter
    @Setter
    @Column(name = "ENVIO_BCO")
    private String envioBanco;

    @Getter
    @Setter
    @Column(name = "LIBERADO")
    private String liberado;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CpLibDoc cpLibDoc = (CpLibDoc) o;
        return Objects.equals(numeroDoc, cpLibDoc.numeroDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDoc);
    }
}

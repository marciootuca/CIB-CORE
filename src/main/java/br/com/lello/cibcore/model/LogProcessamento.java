package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(schema = "pagar" , name = "log_processamento")
public class LogProcessamento {
    @Id
    @Getter
    @Setter
    @Column(name = "codigo", nullable = false)
    private Long codigo;

    @Getter
    @Setter
    @Column(name = "NOME_PACKAGE")
    private String nomePackage;

    @Getter
    @Setter
    @Column(name = "NOME_PROCEDURE")
    private String nomeProcudere;

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_INICIO")
    private Date dataInicio;

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_FIM")
    private Date dataFim;

    @Getter
    @Setter
    @Column(name = "TOTAL_ARQ_PROC")
    private Long totalArqProc;

    @Getter
    @Setter
    @Column(name = "TOTAL_ARQ_ERRO")
    private Long totalArqErro;


    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogProcessamento that = (LogProcessamento) o;
        return Objects.equals(codigo, that.codigo);
    }


}

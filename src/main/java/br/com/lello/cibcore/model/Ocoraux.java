package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "OCORAUX")
public class Ocoraux {
    @EmbeddedId
    private OcorauxId id;

    @Column(name = "RECNUM", nullable = false)
    private Long recnum;

    @Column(name = "DIAS")
    private Short dias;

    @Column(name = "ENVIADO", length = 1)
    private String enviado;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "TPOCOR_ANT")
    private Short tpocorAnt;

    @Column(name = "REC_OCOR")
    private Integer recOcor;

    @Column(name = "ALTERADO", length = 1)
    private String alterado;

    @Column(name = "FL_ENVIO_EMAIL", length = 1)
    private String flEnvioEmail;


}
package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "TBLFICHA")
public class TblFicha {
    @EmbeddedId
    private TblFichaId id;

    @Column(name = "RECNUM")
    private Integer recnum;

    @Column(name = "CONDOMINIO")
    private Integer condominio;

    @Column(name = "ACORDO")
    private Integer acordo;

    @Column(name = "RECIBO")
    private Integer recibo;

    @Column(name = "FLAG_REMESSA", length = 1)
    private String flagRemessa;

    @Column(name = "IMPRESSO", length = 1)
    private String impresso;

    @Column(name = "EMITE", length = 1)
    private String emite;

    @Column(name = "NRO_BANCARIO_ANT", length = 18)
    private String nroBancarioAnt;



}
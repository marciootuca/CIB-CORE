package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "TBLPERC")
public class TblPerc {

    @EmbeddedId
    private TblPercId id;

    @Column(name = "RECNUM")
    private Integer recnum;

    @Column(name = "CONTA", nullable = false)
    private Integer conta;

    @Column(name = "VALOR", precision = 14, scale = 2)
    private BigDecimal valor;


}

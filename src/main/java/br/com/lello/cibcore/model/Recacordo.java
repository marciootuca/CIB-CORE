package br.com.lello.cibcore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "RECACORDO")
public class Recacordo {
    @EmbeddedId
    private RecacordoId id;

    @Column(name = "RECNUM", nullable = false)
    private Long recnum;

    @Column(name = "DTRECINC")
    private Date dtrecinc;

    @Column(name = "DTRECSAI")
    private Date dtrecsai;

    public RecacordoId getId() {
        return id;
    }

    public void setId(RecacordoId id) {
        this.id = id;
    }

    public Long getRecnum() {
        return recnum;
    }

    public void setRecnum(Long recnum) {
        this.recnum = recnum;
    }



}
package br.com.lello.cibcore.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Data
@Entity
@Table(name = "CNDCONTA")
public class CndConta implements Serializable, Comparable<CndConta>{
	private static final long serialVersionUID = 1L;
	private static final Long COD_BRADESCO = 237L;
	private static final Long COD_ITAU = 341L;
	
    @Id
    @Column(name = "CODIGO")
    private Long codigo;

    @Column(name = "RECNUM")
    private Long recNum;

    @Column(name = "COD_BANCO")
    private Long codBanco;

    @Column(name = "COD_AGENCIA")
    private String codAgencia;

    @Column(name = "NOME_AGENCIA")
    private String nomeAgencia;

    @Column(name = "CONDOMINIO")
    private Long condominio;

    @Column(name = "DIARIO")
    private String diario;

    @Column(name = "VALIDADE")
    private Long validade;

    @Column(name = "COD_EMPRESA")
    private String codEmpresa;

    @Column(name = "SIGLAARQ")
    private String sigLaarq;

    @Column(name = "FLAGREM")
    private String flaGrem;

    @Column(name = "SEQ_ARQ")
    private Long seqArq;

    @Column(name = "SEQ_ARQ_REM")
    private Long seqArqRem;

    @Column(name = "DATA_ARQ")
    @Temporal(TemporalType.DATE)
    private Date dataArq;

    @Column(name = "DATA_ARQ_REM")
    @Temporal(TemporalType.DATE)
    private Date dataArqRem;

    public Long getCodContaBancaria() {
    	if (COD_BRADESCO.equals(codBanco)) {
			return 12L;
		}
    	
    	if (COD_ITAU.equals(codBanco)) {
			return 14L;
		}
    	
    	return null;
    }

    @Override
    public int compareTo(CndConta o) {
        if (o == null) {
            return -1;
        }
        if (this.codigo == null) {
            return 1;
        }
        return o.getCodigo().compareTo(this.codigo);
    }

}

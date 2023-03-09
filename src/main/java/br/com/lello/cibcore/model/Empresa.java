package br.com.lello.cibcore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CPGLELLO")
public class Empresa {
	
	@Id
	@Column(name = "RECNUM", nullable = false)
	private Long recnum;

	@Column(name = "DS_NOME")
	private String dsNome;

	@Column(name = "NR_CGC")
	private String nrCgc;

	@Column(name = "CD_COMUNICACAO")
	private Long cdComunicacao;

	@Column(name = "NR_REMESSA")
	private Long nrRemessa;

	@Column(name = "NR_OUTRO")
	private Long nrOutro;

	@Column(name = "DATA_PROC")
	private Date dataProc;

	@Column(name = "LABEL_ARQ")
	private Long labelArq;

	@Column(name = "DATA_ULT_PROC")
	private Date dataUltProc;

	@Column(name = "FLAG_ENVIADO")
	private String flagEnviado;

	@Column(name = "FLAG_RETORNO")
	private String flagRetorno;

	@Column(name = "DATA_RETORNO")
	private String dataRetorno;

	@Column(name = "ARQUIVO_RET")
	private String arquivoRet;

	@Column(name = "NR_REMESSA_I")
	private Long nrRemessaI;

	@Column(name = "DATA_PROC_I")
	private Date dataProcI;

	@Column(name = "LABEL_ARQ_I")
	private Long labelArqI;

	@Column(name = "DATA_ULT_PROC_I")
	private Date dataUltProcI;

	@Column(name = "FLAG_ENVIADO_I")
	private String flagEnviadoI;

	@Column(name = "FLAG_RETORNO_I")
	private String flagRetornoI;

	@Column(name = "DATA_RETORNO_I")
	private Date dataRetornoI;

	@Column(name = "NR_LOTE_I")
	private Long nrLoteI;

	@Column(name = "FLAG_RETORNO_B")
	private String flagRetornoB;

	@Column(name = "FLAG_ENVIADO_B")
	private String flagEnvioNB;

	@Column(name = "DATA_PROC_B")
	private Date dataProcB;

	@Column(name = "DATA_ULT_PROC_B")
	private Date dataUltProcB;

	@Column(name = "LABEL_ARQ_B")
	private String labelArqB;

	@Column(name = "DATA_RETORNO_B")
	private Date dataRetornoB;
}

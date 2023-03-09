package br.com.lello.cibcore.model.remessa;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_COB_DET_SEG_5")
public class PagamentoCobrancaDetalheSeg5 implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Sequencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Cód. Segmento do Registro Detalhe

	@Column(name = "G004_CNAB", length = 3, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "X5001_LISTA_DEBITO", length = 9, nullable = false)
	private String x5001ListaDebito; // Número da Lista de Débito

	@Column(name = "X5002_HORARIO_DEBITO", length = 6, nullable = false)
	private String x5002HorarioDebito; // Horário do Débito do Pagamento

	@Column(name = "X5003_COMPL_TP_SERV", length = 5, nullable = false)
	private String x5003ComplTpServ; // Mensagem da Primeira Linha de Extrato

	@Column(name = "X5004_MSG_SEG_EXTR", length = 5, nullable = false)
	private String x5004MsgSegExtr; // Mensagem de Segunda Linha de Extrato

	@Column(name = "X5005_USO_EMP", length = 50, nullable = false)
	private String x5005UsoEmp; // Uso da Empresa

	@Column(name = "X5006_TIPO_DOCUMENTO", length = 3, nullable = false)
	private String x5006TipoDocumento; // Tipo de Documento

	@Column(name = "X5007_NUMERO_DOCUMENTO", length = 15, nullable = false)
	private String x5007NumeroDocumento; // Número do documento

	@Column(name = "X5008_SERIE_DOCUMENTO", length = 2, nullable = false)
	private String x5008SerieDocumento; // Série do documento

	@Column(name = "G004_CNAB2", length = 15, nullable = false)
	private String g004CNAB2; // Uso Exclusivo BRADRESCO/CNAB

	@Column(name = "X5010_DT_EMISS_DOC", length = 8, nullable = false)
	private String x5010DtEmissDoc; // Data de Emissão do Documento

	@Column(name = "G004_CNAB3", length = 95, nullable = false)
	private String g004CNAB3; // Uso Exclusivo BRADRESCO/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@ManyToOne
	@JoinColumn(name = "COD_DETALHE", referencedColumnName = "COD", nullable = true)
	private PagamentoCobrancaDetalheJ detalhe;
}

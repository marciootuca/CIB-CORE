package br.com.lello.cibcore.model.remessa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_DET_SEG_5")
public class PagamentoDetalheSeg5 implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g004CNAB", "x5001ListaDebito", "x5002HorarioDebito", "x5003ComplTpServ", "x5004MsgSegExtr",
			"x5005UsoEmp", "x5006TipoDocumento", "x5007NumeroDocumento", "x5008SerieDocumento", "g004CNAB2",
			"x5010DtEmissDoc", "g004CNAB3", "g059CodOcorrRetRem"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_S5")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_SEG_5", allocationSize = 1, name = "DET_S5")
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

	@Column(name = "X5001_LISTA_DEBITO2", length = 6, nullable = false)
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

	@Column(name = "COD_DETALHE", nullable = false)
	private Long codDetalhe;
}

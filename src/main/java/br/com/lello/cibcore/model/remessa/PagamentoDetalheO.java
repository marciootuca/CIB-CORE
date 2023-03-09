package br.com.lello.cibcore.model.remessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_DET_O")
public class PagamentoDetalheO implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g060TipoMovimento", "g061CodInstrMov", "n001CodBarras", "g013Nome", "g044DataVencimento",
			"p009DtPagamento", "p004VlRealPag", "g064NumDocumento", "g043NumDocumento", "g004CNAB",
			"g059CodOcorrRetRem"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_O")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_O", allocationSize = 1, name = "DET_O")
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

	@Column(name = "G060_TIPO_MOVIMENTO", length = 1, nullable = false)
	private String g060TipoMovimento; // Tipo de Movimento

	@Column(name = "G061_COD_INSTR_MOV", length = 2, nullable = false)
	private String g061CodInstrMov; // Código da Instrução de Movimento

	@Column(name = "N001_COD_BARRAS", length = 44, nullable = false)
	private String n001CodBarras; // Código de Barras

	@Column(name = "G013_NOME", length = 30, nullable = false)
	private String g013Nome; // Nome da Concessionária / Órgão

	@Column(name = "G044_DATA_VENCIMENTO", length = 8, nullable = false)
	private String g044DataVencimento; // Data do Vencimento (Nominal)

	@Column(name = "P009_DT_PAGAMENTO", length = 8, nullable = false)
	private String p009DtPagamento; // Data do Pagamento

	@Column(name = "P004_VL_REAL_PAG", length = 15, nullable = false)
	private String p004VlRealPag; // Valor do Pagamento

	@Column(name = "G064_NUM_DOCUMENTO", length = 20, nullable = false)
	private String g064NumDocumento; // Nº do Docto Atribuído pela Empresa

	@Column(name = "G043_NUM_DOCUMENTO", length = 20, nullable = false)
	private String g043NumDocumento; // Nº do Docto Atribuído pelo Banco

	@Column(name = "G004_CNAB", length = 68, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_LOTE", nullable = false)
	private Long codHeaderLote;

/*	
	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoDetalheSegW> listPagamentoDetalheSegW = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoDetalheSeg5> listPagamentoDetalheSeg5 = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoDetalheSegZ> listPagamentoDetalheSegZ = new ArrayList<>();
*/
}

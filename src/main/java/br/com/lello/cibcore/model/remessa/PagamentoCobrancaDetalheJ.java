package br.com.lello.cibcore.model.remessa;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_COB_DET_J")
public class PagamentoCobrancaDetalheJ implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g060TipoMovimento", "g061CodInstrMov", "g063CodBarras", "g013Nome", "g044DataVencimento",
			"g042ValorDocumento", "l002ValDescAbat", "l003ValMoraMulta", "p009DtPagamento", "p010VlPagamento",
			"g041QtdMoeda", "g064NumDocumento", "g043NumDocumento", "g065CodMoeda", "g004CNAB",
			"g059CodOcorrRetRem"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_J")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_COB_DET_J", allocationSize = 1, name = "DET_J")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código no Banco da Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Seqüencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Código de Segmento no Reg. Detalhe

	@Column(name = "G060_TIPO_MOVIMENTO", length = 1, nullable = false)
	private String g060TipoMovimento; // Tipo de Movimento

	@Column(name = "G061_COD_INSTR_MOV", length = 2, nullable = false)
	private String g061CodInstrMov; // Código da Instrução p/ Movimento

	@Column(name = "G063_COD_BARRAS", length = 44, nullable = false)
	private String g063CodBarras; // Código de Barras

	@Column(name = "G013_NOME", length = 30, nullable = false)
	private String g013Nome; // Nome do Cedente

	@Column(name = "G044_DATA_VENCIMENTO", length = 8, nullable = false)
	private String g044DataVencimento; // Data do Vencimento (Nominal)

	@Column(name = "G042_VALOR_DOCUMENTO", length = 15, nullable = false)
	private String g042ValorDocumento; // Valor do Título (Nominal)

	@Column(name = "L002_VAL_DESC_ABAT", length = 15, nullable = false)
	private String l002ValDescAbat; // Valor do Desconto + Abatimento

	@Column(name = "L003_VAL_MORA_MULTA", length = 15, nullable = false)
	private String l003ValMoraMulta; // Valor da Mora + Multa

	@Column(name = "P009_DT_PAGAMENTO", length = 8, nullable = false)
	private String p009DtPagamento; // Data do Pagamento

	@Column(name = "P010_VL_PAGAMENTO", length = 15, nullable = false)
	private String p010VlPagamento; // Valor do Pagamento

	@Column(name = "G041_QTD_MOEDA", length = 15, nullable = false)
	private String g041QtdMoeda; // Quantidade da Moeda

	@Column(name = "G064_NUM_DOCUMENTO", length = 20, nullable = false)
	private String g064NumDocumento; // Nº do Docto Atribuído pela Empresa

	@Column(name = "G043_NUM_DOCUMENTO", length = 20, nullable = false)
	private String g043NumDocumento; // Nº do Docto Atribuído pelo Banco

	@Column(name = "G065_COD_MOEDA", length = 2, nullable = false)
	private String g065CodMoeda; // Código de Moeda

	@Column(name = "G004_CNAB", length = 6, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@ManyToOne
	@JoinColumn(name = "COD_HEADER_LOTE", referencedColumnName = "COD", nullable = false)
	private PagamentoCobrancaHeader headerLote;
	
	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoCobrancaDetalheJ52> listPagamentoCobrancaDetalheJ52 = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoCobrancaDetalheSeg5> listPagamentoCobrancaDetalheSeg5 = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoCobrancaDetalheAutenticacao> listPagamentoCobrancaDetalheAutenticacao = new ArrayList<>();
}

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
@Table(name = "TB_PAG_DET_A")
public class PagamentoDetalheA implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g060TipoMovimento", "g061CodInstrMov", "p001CodCamCentr", "p002CodBancoFav", "g008AgenciaConta",
			"g009DigitoVerifAg", "g010NumeroCC", "g011DigitoVerifCC", "g012DigitoVerifACC", "g013Nome",
			"g064NumDocumento", "p009DtPagamento", "g040TipoMoeda", "g041QtdMoeda", "p010VlPagamento",
			"g043NumDocumento", "p003DtRealLanc", "p004VlRealPag", "g031Mensagem", "p005ComplTpServ",
			"p011CodFinTED", "p013CodFinCompl", "g004CNAB", "p006AvisoFavorec", "g059CodOcorrRetRem"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_A")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_A", allocationSize = 1, name = "DET_A")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Seqüencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Código de Segmento do Reg. Detalhe

	@Column(name = "G060_TIPO_MOVIMENTO", length = 1, nullable = false)
	private String g060TipoMovimento; // Tipo de Movimento

	@Column(name = "G061_COD_INSTR_MOV", length = 2, nullable = false)
	private String g061CodInstrMov; // Código da Instrução p/ Movimento

	@Column(name = "P001_COD_CAM_CENTR", length = 3, nullable = false)
	private String p001CodCamCentr; // Código da Câmara Centralizadora

	@Column(name = "P002_COD_BANCO_FAV", length = 3, nullable = false)
	private String p002CodBancoFav; // Código do Banco do Favorecido

	@Column(name = "G008_AGENCIA_CONTA", length = 5, nullable = false)
	private String g008AgenciaConta; // Ag. Mantenedora da Cta do Favo

	@Column(name = "G009_DIGITO_VERIF_AG", length = 1, nullable = false)
	private String g009DigitoVerifAg; // Dígito Verificador da Agência

	@Column(name = "G010_NUMERO_CC", length = 12, nullable = false)
	private String g010NumeroCC; // Número da Conta Corrente

	@Column(name = "G011_DIGITO_VERIF_CC", length = 1, nullable = false)
	private String g011DigitoVerifCC; // Dígito Verificador da Conta

	@Column(name = "G012_DIGITO_VERIF_A_CC", length = 1, nullable = false)
	private String g012DigitoVerifACC; // Dígito Verificador da AG/Conta

	@Column(name = "G013_NOME", length = 30, nullable = false)
	private String g013Nome; // Nome do Favorecido

	@Column(name = "G064_NUM_DOCUMENTO", length = 20, nullable = false)
	private String g064NumDocumento; // Nº do Docum. Atribuído p/ Empresa

	@Column(name = "P009_DT_PAGAMENTO", length = 8, nullable = false)
	private String p009DtPagamento; // Data do Pagamento

	@Column(name = "G040_TIPO_MOEDA", length = 3, nullable = false)
	private String g040TipoMoeda; // Tipo da Moeda

	@Column(name = "G041_QTD_MOEDA", length = 15, nullable = false)
	private String g041QtdMoeda; // Quantidade da Moeda

	@Column(name = "P010_VL_PAGAMENTO", length = 15, nullable = false)
	private String p010VlPagamento; // Valor do Pagamento

	@Column(name = "G043_NUM_DOCUMENTO", length = 20, nullable = false)
	private String g043NumDocumento; // Nº do Docum. Atribuído pelo Banco

	@Column(name = "P003_DT_REAL_LANC", length = 8, nullable = false)
	private String p003DtRealLanc; // Data Real da Efetivação Pagto

	@Column(name = "P004_VL_REAL_PAG", length = 15, nullable = false)
	private String p004VlRealPag; // Valor Real da Efetivação do Pagto

	@Column(name = "G031_MENSAGEM", length = 40, nullable = false)
	private String g031Mensagem; // Informação 2

	@Column(name = "P005_COMPL_TP_SERV", length = 2, nullable = false)
	private String p005ComplTpServ; // Código Finalidade Doc

	@Column(name = "P011_COD_FIN_TED", length = 5, nullable = false)
	private String p011CodFinTED; // Codigo finalidade da TED

	@Column(name = "P013_COD_FIN_COMPL", length = 2, nullable = false)
	private String p013CodFinCompl; // Compl. Finalidade de Pagamento

	@Column(name = "G004_CNAB", length = 3, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNA

	@Column(name = "P006_AVISO_FAVOREC", length = 1, nullable = false)
	private String p006AvisoFavorec; // 230-230 Aviso ao Favorecido

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_LOTE", nullable = false)
	private Long codHeaderLote;

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoDetalheB> listPagamentoDetalheB = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoDetalheC> listPagamentoDetalheC = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoDetalhe5> listPagamentoDetalhe5 = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DETALHE", nullable = true)
	private List<PagamentoDetalheZ> listPagamentoDetalheZ = new ArrayList<>();
}

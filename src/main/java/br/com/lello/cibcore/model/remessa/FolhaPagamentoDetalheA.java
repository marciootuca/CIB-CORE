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
@Table(name = "TB_FOL_DET_A")
public class FolhaPagamentoDetalheA implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBanco", "g002LoteServ", "g003TipoRegistro", "g038NumeroReg", "g039CodSegmento",
			"g060TipoMovimento", "g061CodInst", "p001CodigoCamara", "p002CodBanco", "g008Agencia",
			"g009DigitoAgencia", "g010NumeroCC", "g011DigitoCC", "g012DigitoAgenciaCC", "g013Nome",
			"g064NumeroDoc", "p009DataPag", "g040TipoMoeda", "g041QtdMoeda", "p010ValorPag",
			"g043NumDocBanco", "p003DataEfetPag", "p004ValEfetPag", "g031InfoBanc", "p005CodFinDoc",
			"p011CodFinTED", "g004CNAB", "p006AvisoFav", "g059CodOcorr"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOL_DET_A")
	@SequenceGenerator(sequenceName = "SEQ_TB_FOL_DET_A", allocationSize = 1, name = "FOL_DET_A")
	private Long cod;

	@Column(name = "G001_COD_BANCO", length = 3, nullable = false)
	private String g001CodBanco; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERV", length = 4, nullable = false)
	private String g002LoteServ; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUMERO_REG", length = 5, nullable = false)
	private String g038NumeroReg; // Nº Seqüencial do Registro no Lote

	@Column(name = "G039_COD_SEGMENTO", length = 1, nullable = false)
	private String g039CodSegmento; // Código de Segmento do Reg. Detalhe

	@Column(name = "G060_TIPO_MOVIMENTO", length = 1, nullable = false)
	private String g060TipoMovimento; // Tipo de Movimento

	@Column(name = "G061_COD_INST", length = 2, nullable = false)
	private String g061CodInst; // Código da Instrução p/ Movimento

	@Column(name = "P001_CODIGO_CAMARA", length = 3, nullable = false)
	private String p001CodigoCamara; // Código da Câmara Centralizadora

	@Column(name = "P002_COD_BANCO", length = 3, nullable = false)
	private String p002CodBanco; // Código do Banco do Favorecido

	@Column(name = "G008_AGENCIA", length = 5, nullable = false)
	private String g008Agencia; // Ag. Mantenedora da Cta do Favor.

	@Column(name = "G009_DIGITO_AGENCIA", length = 1, nullable = false)
	private String g009DigitoAgencia; // Dígito Verificador da Agência

	@Column(name = "G010_NUMERO_CC", length = 12, nullable = false)
	private String g010NumeroCC; // Número da Conta Corrente

	@Column(name = "G011_DIGITO_CC", length = 1, nullable = false)
	private String g011DigitoCC; // Dígito Verificador da Conta

	@Column(name = "G012_DIGITO_AGENCIA_CC", length = 1, nullable = false)
	private String g012DigitoAgenciaCC; // Dígito Verificador da AG/Conta

	@Column(name = "G013_NOME", length = 30, nullable = false)
	private String g013Nome; // Nome do Favorecido

	@Column(name = "G064_NUMERO_DOC", length = 20, nullable = false)
	private String g064NumeroDoc; // Nº do Docum. Atribuído p/ Empresa

	@Column(name = "P009_DATA_PAG", length = 8, nullable = false)
	private String p009DataPag; // Data do Pagamento

	@Column(name = "G040_TIPO_MOEDA", length = 3, nullable = false)
	private String g040TipoMoeda; // Tipo da Moeda

	@Column(name = "G041_QTD_MOEDA", length = 15, nullable = false)
	private String g041QtdMoeda; // Quantidade da Moeda

	@Column(name = "P010_VALOR_PAG", length = 15, nullable = false)
	private String p010ValorPag; // Valor do Pagamento

	@Column(name = "G043_NUM_DOC_BANCO", length = 20, nullable = false)
	private String g043NumDocBanco; // Nº do Docum. Atribuído pelo Banco

	@Column(name = "P003_DATA_EFET_PAG", length = 8, nullable = false)
	private String p003DataEfetPag; // Data Real da Efetivação Pagto

	@Column(name = "P004_VAL_EFET_PAG", length = 15, nullable = false)
	private String p004ValEfetPag; // Valor Real da Efetivação do Pagto

	@Column(name = "G031_INFO_BANC", length = 40, nullable = false)
	private String g031InfoBanc; // Outras Informações – Vide formatação em G031

	@Column(name = "P005_COD_FIN_DOC", length = 2, nullable = false)
	private String p005CodFinDoc; // Compl. Tipo Serviço

	@Column(name = "P011_COD_FIN_TED", length = 5, nullable = false)
	private String p011CodFinTED; // Codigo finalidade da TED

	@Column(name = "G004_CNAB", length = 5, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "P006_AVISO_FAV", length = 1, nullable = false)
	private String p006AvisoFav; // Aviso ao Favorecido

	@Column(name = "G059_COD_OCORR", length = 10, nullable = false)
	private String g059CodOcorr; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_LOTE", nullable = false)
	private Long codHeaderLote;

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DET", nullable = true)
	private List<FolhaPagamentoDetalheB> listFolhaPagamentoDetalheB = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DET", nullable = true)
	private List<FolhaPagamentoDetalheC> listFolhaPagamentoDetalheC = new ArrayList<>();
}

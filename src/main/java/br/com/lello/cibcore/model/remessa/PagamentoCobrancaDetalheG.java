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
@Table(name = "TB_PAG_COB_DET_G")
public class PagamentoCobrancaDetalheG implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g004CNAB", "c004CodMovRem", "g063CodBarras", "g005TipoInscEmp", "g006NumInscEmp", "g013Nome",
			"c012DataVencimento", "g070ValTitulo", "g041QtdMoeda", "g065CodMoeda", "c011NumDocCobranca",
			"c014AgenciaCobranca", "g009DigitoVerifAg", "b001PracaCobranca", "c006CodCarteira", "c015EspecieTitulo",
			"g071DtEmissTitulo", "c020JurosMora", "c021CodDesconto", "c022Desconto", "c023ValPercDesc",
			"c026CodProtesto", "c027DiasProtesto", "c075DtLimitePag", "g004CNAB2"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_G")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_COB_DET_G", allocationSize = 1, name = "DET_G")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código no Banco na compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Sequencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Cód. Segmento do Registro Detalhe

	@Column(name = "G004_CNAB", length = 1, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "C004_COD_MOV_REM", length = 2, nullable = false)
	private String c004CodMovRem; // Código de Movimento Remessa

	@Column(name = "G063_COD_BARRAS", length = 44, nullable = false)
	private String g063CodBarras; // Código de Barras

	@Column(name = "G005_TIPO_INSC_EMP", length = 1, nullable = false)
	private String g005TipoInscEmp; // Tipo de Inscrição do Cedente

	@Column(name = "G006_NUM_INSC_EMP", length = 15, nullable = false)
	private String g006NumInscEmp; // Número de Inscrição do Cedente

	@Column(name = "G013_NOME", length = 30, nullable = false)
	private String g013Nome; // Nome do Cedente

	@Column(name = "C012_DATA_VENCIMENTO", length = 8, nullable = false)
	private String c012DataVencimento; // Data de Vencimento do Título

	@Column(name = "G070_VAL_TITULO", length = 15, nullable = false)
	private String g070ValTitulo; // Valor Nominal do Título

	@Column(name = "G041_QTD_MOEDA", length = 15, nullable = false)
	private String g041QtdMoeda; // Quantidade da Moeda

	@Column(name = "G065_COD_MOEDA", length = 2, nullable = false)
	private String g065CodMoeda; // Código da Moeda

	@Column(name = "C011_NUM_DOC_COBRANCA", length = 15, nullable = false)
	private String c011NumDocCobranca; // Número do Documento de Cobrança

	@Column(name = "C014_AGENCIA_COBRANCA", length = 5, nullable = false)
	private String c014AgenciaCobranca; // Agência Encarregada da Cobrança

	@Column(name = "G009_DIGITO_VERIF_AG", length = 1, nullable = false)
	private String g009DigitoVerifAg; // Dígito Verificador da Agência

	@Column(name = "B001_PRACA_COBRADORA", length = 10, nullable = false)
	private String b001PracaCobranca; // Praça Cobradora

	@Column(name = "C006_COD_CARTEIRA", length = 1, nullable = false)
	private String c006CodCarteira; // Código da Carteira

	@Column(name = "C015_ESPECIE_TITULO", length = 2, nullable = false)
	private String c015EspecieTitulo; // Espécie do Título

	@Column(name = "G071_DT_EMISS_TITULO", length = 8, nullable = false)
	private String g071DtEmissTitulo; // Data da Emissão do Título

	@Column(name = "C020_JUROS_MORA", length = 15, nullable = false)
	private String c020JurosMora; // Juros de Mora por Dia

	@Column(name = "C021_COD_DESCONTO", length = 1, nullable = false)
	private String c021CodDesconto; // Código do Desconto 1

	@Column(name = "C022_DESCONTO", length = 8, nullable = false)
	private String c022Desconto; // Data do Desconto 1

	@Column(name = "C023_VAL_PERC_DESC", length = 15, nullable = false)
	private String c023ValPercDesc; // Valor / Percentual a ser Concedido

	@Column(name = "C026_COD_PROTESTO", length = 1, nullable = false)
	private String c026CodProtesto; // Código para Protesto

	@Column(name = "C027_DIAS_PROTESTO", length = 2, nullable = false)
	private String c027DiasProtesto; // Número de Dias para Protesto

	@Column(name = "C075_DT_LIMITE_PAG", length = 8, nullable = false)
	private String c075DtLimitePag; // Data Limite para Pagamento do Título

	@Column(name = "G004_CNAB2", length = 1, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_LOTE", nullable = false)
	private Long codHeaderLote;
}

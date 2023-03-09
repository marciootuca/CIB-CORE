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
@Table(name = "TB_PAG_COB_DET_H")
public class PagamentoCobrancaDetalheH implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g004CNAB", "c004CodMovRem", "g005TipoInscEmp", "g006NumInscEmp", "g013Nome", "c021CodDesconto",
			"c022Desconto", "c023ValPercDesc", "c021CodDesconto2", "c022Desconto2", "c023ValPercDesc2", "g073CodMulta",
			"g074DataMulta", "g075ValPercApl", "g045ValorAbatimento", "g043NumDocumento", "g004CNAB2", "c073Mensagem"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_H")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_COB_DET_H", allocationSize = 1, name = "DET_H")
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

	@Column(name = "G005_TIPO_INSC_EMP", length = 1, nullable = false)
	private String g005TipoInscEmp; // Tipo de Inscrição do Cedente

	@Column(name = "G006_NUM_INSC_EMP", length = 15, nullable = false)
	private String g006NumInscEmp; // Número de Inscrição do Cedente

	@Column(name = "G013_NOME", length = 30, nullable = false)
	private String g013Nome; // Nome do Cedente

	@Column(name = "C021_COD_DESCONTO", length = 1, nullable = false)
	private String c021CodDesconto; // Código do Desconto 1

	@Column(name = "C022_DESCONTO", length = 8, nullable = false)
	private String c022Desconto; // Data do Desconto 1

	@Column(name = "C023_VAL_PERC_DESC", length = 15, nullable = false)
	private String c023ValPercDesc; // Valor / Percentual a ser Concedido

	@Column(name = "C021_COD_DESCONTO2", length = 1, nullable = false)
	private String c021CodDesconto2; // Código do Desconto 2

	@Column(name = "C022_DESCONTO2", length = 8, nullable = false)
	private String c022Desconto2; // Data do Desconto 2

	@Column(name = "C023_VAL_PERC_DESC2", length = 15, nullable = false)
	private String c023ValPercDesc2; // Valor / Percentual a ser Concedido

	@Column(name = "G073_COD_MULTA", length = 1, nullable = false)
	private String g073CodMulta; // Código da Multa

	@Column(name = "G074_DATA_MULTA", length = 8, nullable = false)
	private String g074DataMulta; // Data da Multa

	@Column(name = "G075_VAL_PERC_APL", length = 15, nullable = false)
	private String g075ValPercApl; // Valor/Percentual a Ser Concedido

	@Column(name = "G045_VALOR_ABATIMENTO", length = 15, nullable = false)
	private String g045ValorAbatimento; // Valor do Abatimento

	@Column(name = "G043_NUM_DOCUMENTO", length = 20, nullable = false)
	private String g043NumDocumento; // Número do Documento atribuído pelo Banco

	@Column(name = "G004_CNAB2", length = 20, nullable = false)
	private String g004CNAB2; // Uso Exclusivo Bradesco

	@Column(name = "C073_MENSAGEM", length = 40, nullable = false)
	private String c073Mensagem; // Mensagem

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_LOTE", nullable = false)
	private Long codHeaderLote;
}

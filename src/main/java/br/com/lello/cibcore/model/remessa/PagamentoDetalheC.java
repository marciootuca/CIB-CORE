package br.com.lello.cibcore.model.remessa;

import java.util.Arrays;
import java.util.LinkedHashSet;

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

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_DET_C")
public class PagamentoDetalheC implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g004CNAB", "g050ValIRRF", "g051ValImpServico", "g052ValImpOprFin", "g053ValOutrosDed", "g054ValOutrosAcr",
			"g008AgenciaConta", "g009DigitoVerifAg", "g010NumeroCC", "g011DigitoVerifCC", "g012DigitoVerifACC", "g055ValINSS",
			"g004CNAB2"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_C")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_C", allocationSize = 1, name = "DET_C")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Seqüencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Código de Segmento do Reg. Detalhe

	@Column(name = "G004_CNAB", length = 3, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G050_VAL_IRRF", length = 15, nullable = false)
	private String g050ValIRRF; // Valor do IRRF

	@Column(name = "G051_VAL_IMP_SERVICO", length = 15, nullable = false)
	private String g051ValImpServico; // Valor do ISS

	@Column(name = "G052_VAL_IMP_OPR_FIN", length = 15, nullable = false)
	private String g052ValImpOprFin; // Valor do IOF

	@Column(name = "G053_VAL_OUTROS_DED", length = 15, nullable = false)
	private String g053ValOutrosDed; // Valor Outras Deduções

	@Column(name = "G054_VAL_OUTROS_ACR", length = 15, nullable = false)
	private String g054ValOutrosAcr; // Valor Outros Acréscimos

	@Column(name = "G008_AGENCIA_CONTA", length = 5, nullable = false)
	private String g008AgenciaConta; // Agência do Favorecido

	@Column(name = "G009_DIGITO_VERIF_AG", length = 1, nullable = false)
	private String g009DigitoVerifAg; // Dígito Verificador da Agência

	@Column(name = "G010_NUMERO_CC", length = 12, nullable = false)
	private String g010NumeroCC; // Número Conta Corrente

	@Column(name = "G011_DIGITO_VERIF_CC", length = 1, nullable = false)
	private String g011DigitoVerifCC; // Dígito Verificador da Conta

	@Column(name = "G012_DIGITO_VERIF_A_CC", length = 1, nullable = false)
	private String g012DigitoVerifACC; // Dígito Verificador Agência/Conta

	@Column(name = "G055_VAL_INSS", length = 15, nullable = false)
	private String g055ValINSS; // Valor do INSS

	@Column(name = "G004_CNAB2", length = 113, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_DETALHE", nullable = true)
	private Long codDetalhe;
}

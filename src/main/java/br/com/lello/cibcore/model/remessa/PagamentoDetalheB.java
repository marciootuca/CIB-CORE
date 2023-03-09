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
@Table(name = "TB_PAG_DET_B")
public class PagamentoDetalheB implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g004CNAB", "g005TipoInscEmp", "g006NumInscEmp", "g032Endereco", "g032Numero", "g032Complemento",
			"g032Bairro", "g033Cidade", "g034CEP", "g035SufixoCEP", "g036UF", "g044DataVencimento",
			"g042ValorDocumento", "g045ValorAbatimento", "g046ValorDesconto", "g047ValorMora", "g048ValorMulta",
			"p008DOCFavoRec", "p006AvisoFavoRec", "p012CodUG", "p015CodISPBFin"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_B")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_B", allocationSize = 1, name = "DET_B")
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

	@Column(name = "G005_TIPO_INSC_EMP", length = 1, nullable = false)
	private String g005TipoInscEmp; // Tipo de Inscrição do Favorecido

	@Column(name = "G006_NUM_INSC_EMP", length = 14, nullable = false)
	private String g006NumInscEmp; // Nº de Inscrição do Favorecido

	@Column(name = "G032E_ENDERECO", length = 30, nullable = false)
	private String g032Endereco; // Logradouro - Nome da Rua, Av, Pça, Etc

	@Column(name = "G032N_NUMERO", length = 5, nullable = false)
	private String g032Numero; // Número

	@Column(name = "G032C_COMPLEMENTO", length = 15, nullable = false)
	private String g032Complemento; // Complemento

	@Column(name = "G032B_BAIRRO", length = 15, nullable = false)
	private String g032Bairro; // Bairro

	@Column(name = "G033_CIDADE", length = 20, nullable = false)
	private String g033Cidade; // Cidade

	@Column(name = "G034_CEP", length = 5, nullable = false)
	private String g034CEP; // CEP

	@Column(name = "G035_SUFIXO_CEP", length = 3, nullable = false)
	private String g035SufixoCEP; // Complemento do CEP

	@Column(name = "G036_UF", length = 2, nullable = false)
	private String g036UF; // Estado

	@Column(name = "G044_DATA_VENCIMENTO", length = 8, nullable = false)
	private String g044DataVencimento; // Data do Vencimento (Nominal)

	@Column(name = "G042_VALOR_DOCUMENTO", length = 15, nullable = false)
	private String g042ValorDocumento; // Valor do Documento (Nominal)

	@Column(name = "G045_VALOR_ABATIMENTO", length = 15, nullable = false)
	private String g045ValorAbatimento; // Valor do Abatimento

	@Column(name = "G046_VALOR_DESCONTO", length = 15, nullable = false)
	private String g046ValorDesconto; // Valor do Desconto

	@Column(name = "G047_VALOR_MORA", length = 15, nullable = false)
	private String g047ValorMora; // Valor da Mora

	@Column(name = "G048_VALOR_MULTA", length = 15, nullable = false)
	private String g048ValorMulta; // Valor da Multa

	@Column(name = "P008_DOC_FAVOREC", length = 15, nullable = false)
	private String p008DOCFavoRec; // Código/Documento do Favorecido

	@Column(name = "P006_AVISO_FAVOREC", length = 1, nullable = false)
	private String p006AvisoFavoRec; // Aviso ao Favorecido

	@Column(name = "P012_COD_UG", length = 6, nullable = false)
	private String p012CodUG; // Uso Exclusivo para o SIAPE

	@Column(name = "P015_COD_ISPB_FIN", length = 8, nullable = false)
	private String p015CodISPBFin; // Código ISPB

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_DETALHE", nullable = true)
	private Long codDetalhe;
}

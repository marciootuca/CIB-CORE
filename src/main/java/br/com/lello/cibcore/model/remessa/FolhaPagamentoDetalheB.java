package br.com.lello.cibcore.model.remessa;

import lombok.*;

import javax.persistence.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_FOL_DET_B")
public class FolhaPagamentoDetalheB implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancComp", "g002LoteServico", "g003TipoReg", "g038NumSeqLote", "g039CodSegRegLote",
			"g004CNAB1", "g005TipoInscFav", "g006NumInscFav", "g032Endereco", "g032EnderecoNumero",
			"g032EnderecoComp", "g032EnderecoBairro", "g033Cidade", "g034CEP", "g035ComplementoCEP",
			"g036UF", "g044DataVencimento", "g042ValorDocumento", "g045ValorAbatimento", "g046ValorDesconto",
			"g047ValorMora", "g048ValorMulta", "p008CodFavorecido", "g004CNAB2"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOL_DET_B")
	@SequenceGenerator(sequenceName = "SEQ_TB_FOL_DET_B", allocationSize = 1, name = "FOL_DET_B")
	private Long cod;

	@Column(name = "G001_COD_BANC_COMP", length = 3, nullable = false)
	private String g001CodBancComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REG", length = 1, nullable = false)
	private String g003TipoReg; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Seqüencial do Registro no Lote

	@Column(name = "G039_COD_SEG_REG_LOTE", length = 1, nullable = false)
	private String g039CodSegRegLote; // Código de Segmento do Reg. Detalhe

	@Column(name = "G004_CNAB1", length = 3, nullable = false)
	private String g004CNAB1; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G005_TIPO_INSC_FAV", length = 1, nullable = false)
	private String g005TipoInscFav; // Tipo de Inscrição do Favorecido

	@Column(name = "G006_NUM_INSC_FAV", length = 14, nullable = false)
	private String g006NumInscFav; // Nº de Inscrição do Favorecido

	@Column(name = "G032_ENDERECO", length = 30, nullable = false)
	private String g032Endereco; // Logradouro - Nome da Rua, Av, Pça, Etc

	@Column(name = "G032_ENDERECO_NUMERO", length = 5, nullable = false)
	private String g032EnderecoNumero; // Número

	@Column(name = "G032_ENDERECO_COMP", length = 15, nullable = false)
	private String g032EnderecoComp; // Complemento

	@Column(name = "G032_ENDERECO_BAIRRO", length = 15, nullable = false)
	private String g032EnderecoBairro; // Bairro

	@Column(name = "G033_CIDADE", length = 20, nullable = false)
	private String g033Cidade; // Cidade

	@Column(name = "G034_CEP", length = 5, nullable = false)
	private String g034CEP; // CEP

	@Column(name = "G035_COMPLEMENTO_CEP", length = 3, nullable = false)
	private String g035ComplementoCEP; // Complemento do CEP

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

	@Column(name = "P008_COD_FAVORECIDO", length = 15, nullable = false)
	private String p008CodFavorecido; // Código/Documento do Favorecido

	@Column(name = "G004_CNAB2", length = 15, nullable = false)
	private String g004CNAB2; // Aviso ao Favorecido

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_DET", referencedColumnName = "COD", nullable = false)
	private FolhaPagamentoDetalheA codDet;
}

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
@Table(name = "TB_FOL_DET_C")
public class FolhaPagamentoDetalheC implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancComp", "g002LoteServ", "g003TipoReg", "g038NumSeqLote", "g039CodSegDet",
			"g004CNAB1", "g050ValorIR", "g051ValorISS", "g052ValorIOF", "g053OutrasDed",
			"g054OutrosAcre", "g008AgenciaFav", "g009DigitoAg", "g010NumCC", "g011DigitoCC",
			"g012DigitoAgCC", "g055ValorINSS", "g004CNAB2"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOL_DET_C")
	@SequenceGenerator(sequenceName = "SEQ_TB_FOL_DET_C", allocationSize = 1, name = "FOL_DET_C")
	private Long cod;

	@Column(name = "G001_COD_BANC_COMP", length = 3, nullable = false)
	private String g001CodBancComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERV", length = 4, nullable = false)
	private String g002LoteServ; // Lote de Serviço

	@Column(name = "G003_TIPO_REG", length = 1, nullable = false)
	private String g003TipoReg; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Seqüencial do Registro no Lote

	@Column(name = "G039_COD_SEG_DET", length = 1, nullable = false)
	private String g039CodSegDet; // Código de Segmento do Reg. Detalhe

	@Column(name = "G004_CNAB1", length = 3, nullable = false)
	private String g004CNAB1; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G050_VALOR_IR", length = 15, nullable = false)
	private String g050ValorIR; // Valor do IRRF

	@Column(name = "G051_VALOR_ISS", length = 15, nullable = false)
	private String g051ValorISS; // Valor do ISS

	@Column(name = "G052_VALOR_IOF", length = 15, nullable = false)
	private String g052ValorIOF; // Valor do IOF

	@Column(name = "G053_OUTRAS_DED", length = 15, nullable = false)
	private String g053OutrasDed; // Valor Outras Deduções

	@Column(name = "G054_OUTROS_ACRE", length = 15, nullable = false)
	private String g054OutrosAcre; // Valor Outros Acréscimos

	@Column(name = "G008_AGENCIA_FAV", length = 5, nullable = false)
	private String g008AgenciaFav; // Agência do Favorecido

	@Column(name = "G009_DIGITO_AG", length = 1, nullable = false)
	private String g009DigitoAg; // Dígito Verificador da Agência

	@Column(name = "G010_NUM_CC", length = 12, nullable = false)
	private String g010NumCC; // Número Conta Corrente

	@Column(name = "G011_DIGITO_CC", length = 1, nullable = false)
	private String g011DigitoCC; // Dígito Verificador da Conta

	@Column(name = "G012_DIGITO_AG_CC", length = 1, nullable = false)
	private String g012DigitoAgCC; // Dígito Verificador Agência/Conta

	@Column(name = "G055_VALOR_INSS", length = 15, nullable = false)
	private String g055ValorINSS; // Valor do INSS

	@Column(name = "G004_CNAB2", length = 113, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_DET", referencedColumnName = "COD", nullable = false)
	private FolhaPagamentoDetalheA codDet;
}

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
@Table(name = "TB_PAG_COB_DET_J52")
public class PagamentoCobrancaDetalheJ52 implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"g004CNAB", "c004CodMovRem", "g067IdRegistroOpc", "g005TipoInscEmp", "g006NumInscEmp", "g013Nome",
			"g005TipoInscEmp2", "g006NumInscEmp2", "g013Nome2", "g005TipoInscEmp3", "g006NumInscEmp3",
			"g013Nome3", "g004CNAB2"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_J52")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_COB_DET_J52", allocationSize = 1, name = "DET_J52")
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

	@Column(name = "G004_CNAB", length = 1, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "C004_COD_MOV_REM", length = 2, nullable = false)
	private String c004CodMovRem; // Código de Movimento Remessa

	@Column(name = "G067_ID_REGISTRO_OPC", length = 2, nullable = false)
	private String g067IdRegistroOpc; // Identificação Registro Opcional

	@Column(name = "G005_TIPO_INSC_EMP", length = 1, nullable = false)
	private String g005TipoInscEmp; // Tipo de Inscrição

	@Column(name = "G006_NUM_INSC_EMP", length = 15, nullable = false)
	private String g006NumInscEmp; // Número de Inscrição

	@Column(name = "G013_NOME", length = 40, nullable = false)
	private String g013Nome; // Nome

	@Column(name = "G005_TIPO_INSC_EMP2", length = 1, nullable = false)
	private String g005TipoInscEmp2; // Tipo de Inscrição

	@Column(name = "G006_NUM_INSC_EMP2", length = 15, nullable = false)
	private String g006NumInscEmp2; // Número de Inscrição

	@Column(name = "G013_NOME2", length = 40, nullable = false)
	private String g013Nome2; // Nome

	@Column(name = "G005_TIPO_INSC_EMP3", length = 1, nullable = false)
	private String g005TipoInscEmp3; // Tipo de Inscrição

	@Column(name = "G006_NUM_INSC_EMP3", length = 15, nullable = false)
	private String g006NumInscEmp3; // Número de Inscrição

	@Column(name = "G013_NOME3", length = 40, nullable = false)
	private String g013Nome3; // Nome

	@Column(name = "G004_CNAB2", length = 53, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@ManyToOne
	@JoinColumn(name = "COD_DETALHE", referencedColumnName = "COD", nullable = true)
	private PagamentoCobrancaDetalheJ detalhe;
}

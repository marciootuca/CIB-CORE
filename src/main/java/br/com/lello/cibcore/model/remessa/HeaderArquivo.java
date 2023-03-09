package br.com.lello.cibcore.model.remessa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Arrays;
import java.util.LinkedHashSet;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_HEADER_ARQUIVO")
public class HeaderArquivo implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g004CNAB", "g005TipoInscEmp", "g006NumInscEmp",
			"g007CodConvBanc", "g008AgenciaConta", "g009DigitoVerifAg", "g010NumeroCC", "g011DigitoVerifCC",
			"g012DigitoVerifACC", "g013Nome", "g014NomeBanco", "g004CNAB2", "g015CodRemessaRet", "g016DataArquivo",
			"g017HoraArquivo", "g018NumSeqArq", "g019VersaoArquivo", "g020DensidadeArq", "g021UsoBanco",
			"g022UsoLello", "g004CNAB3"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARQ_SEQ")
	@SequenceGenerator(sequenceName = "SEQ_TB_HEADER_ARQUIVO", allocationSize = 1, name = "ARQ_SEQ")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G004_CNAB", length = 9, nullable = false)
	private String g004CNAB; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "G005_TIPO_INSC_EMP", length = 1, nullable = false)
	private String g005TipoInscEmp; // Tipo de Inscrição da Empresa

	@Column(name = "G006_NUM_INSC_EMP", length = 14, nullable = false)
	private String g006NumInscEmp; // Número de Inscrição da Empresa

	@Column(name = "G007_COD_CONV_BANC", length = 20, nullable = false)
	private String g007CodConvBanc; // Código do Convênio no Banco

	@Column(name = "G008_AGENCIA_CONTA", length = 5, nullable = false)
	private String g008AgenciaConta; // Agência Mantenedora da Conta

	@Column(name = "G009_DIGITO_VERIF_AG", length = 1, nullable = false)
	private String g009DigitoVerifAg; // Dígito Verificador da Agência

	@Column(name = "G010_NUMERO_CC", length = 12, nullable = false)
	private String g010NumeroCC; // Número da Conta Corrente

	@Column(name = "G011_DIGITO_VERIF_CC", length = 1, nullable = false)
	private String g011DigitoVerifCC; // Dígito Verificador da Conta

	@Column(name = "G012_DIGITO_VERIF_A_CC", length = 1, nullable = false)
	private String g012DigitoVerifACC; // Dígito Verificador da Ag/Conta

	@Column(name = "G013_NOME", length = 30, nullable = false)
	private String g013Nome; // Nome da Empresa

	@Column(name = "G014_NOME_BANCO", length = 30, nullable = false)
	private String g014NomeBanco; // Nome do Banco

	@Column(name = "G004_CNAB2", length = 10, nullable = false)
	private String g004CNAB2; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "G015_COD_REMESSA_RET", length = 1, nullable = false)
	private String g015CodRemessaRet; // Código Remessa / Retorno

	@Column(name = "G016_DATA_ARQUIVO", length = 8, nullable = false)
	private String g016DataArquivo; // Data de Geração do Arquivo

	@Column(name = "G017_HORA_ARQUIVO", length = 6, nullable = false)
	private String g017HoraArquivo; // Hora de Geração do Arquivo

	@Column(name = "G018_NUM_SEQ_ARQ", length = 6, nullable = false)
	private String g018NumSeqArq; // Número Seqüencial do Arquivo

	@Column(name = "G019_VERSAO_ARQUIVO", length = 3, nullable = false)
	private String g019VersaoArquivo; // N o da Versão do Layout do Arquivo

	@Column(name = "G020_DENSIDADE_ARQ", length = 5, nullable = false)
	private String g020DensidadeArq; // Densidade de Gravação do Arquivo

	@Column(name = "G021_USO_BANCO", length = 20, nullable = false)
	private String g021UsoBanco; // Para Uso Reservado do Banco

	@Column(name = "G022_USO_LELLO", length = 20, nullable = false)
	private String g022UsoLello; // Para Uso Reservado da Empresa

	@Column(name = "G004_CNAB3", length = 29, nullable = false)
	private String g004CNAB3; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "TIPO_ENDPOINT", length = 30, nullable = false)
	private String tipoEndpoint; // NOME ARQUIVO APENAS RETORNO

}

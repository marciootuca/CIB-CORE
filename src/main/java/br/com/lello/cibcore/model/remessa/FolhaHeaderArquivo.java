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
@Table(name = "TB_FOL_HEADER_ARQ")
public class FolhaHeaderArquivo implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServ", "g003TipoReg", "g004CNAB1", "g005TpInscEmp", "g006NumInscEmp",
			"g007CodConvBanco", "g008AgenciaCC", "g009DigitoAgencia", "g010NumCC", "g011DigitoCC",
			"g012DigitoAgenciaCC", "g013NomeEmp", "g014NomeBanco", "g004CNAB2", "g015CodRemRet", "g016DataGeracaoArq",
			"g017HoraGeracaoArq", "g018NumSeqArq", "g019NumLayout", "g020Densidade", "g021ReservadoBanco",
			"g022ReservadoEmp", "g004CNAB3"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOL_ARQ_SEQ")
	@SequenceGenerator(sequenceName = "SEQ_TB_FOL_HEADER_ARQ", allocationSize = 1, name = "FOL_ARQ_SEQ")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERV", length = 4, nullable = false)
	private String g002LoteServ; // Lote de Serviço

	@Column(name = "G003_TIPO_REG", length = 1, nullable = false)
	private String g003TipoReg; // Tipo de Registro

	@Column(name = "G004_CNAB1", length = 9, nullable = false)
	private String g004CNAB1; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "G005_TP_INSC_EMP", length = 1, nullable = false)
	private String g005TpInscEmp; // Tipo de Inscrição da Empresa

	@Column(name = "G006_NUM_INSC_EMP", length = 14, nullable = false)
	private String g006NumInscEmp; // Número de Inscrição da Empresa

	@Column(name = "G007_COD_CONV_BANCO", length = 20, nullable = false)
	private String g007CodConvBanco; // Código do Convênio no Banco

	@Column(name = "G008_AGENCIA_CC", length = 5, nullable = false)
	private String g008AgenciaCC; // Agência Mantenedora da Conta

	@Column(name = "G009_DIGITO_AGENCIA", length = 1, nullable = false)
	private String g009DigitoAgencia; // Dígito Verificador da Agência

	@Column(name = "G010_NUM_CC", length = 12, nullable = false)
	private String g010NumCC; // Número da Conta Corrente

	@Column(name = "G011_DIGITO_CC", length = 1, nullable = false)
	private String g011DigitoCC; // Dígito Verificador da Conta

	@Column(name = "G012_DIGITO_AGENCIA_CC", length = 1, nullable = false)
	private String g012DigitoAgenciaCC; // Dígito Verificador da Ag/Conta

	@Column(name = "G013_NOME_EMP", length = 30, nullable = false)
	private String g013NomeEmp; // Nome da Empresa

	@Column(name = "G014_NOME_BANCO", length = 30, nullable = false)
	private String g014NomeBanco; // Nome do Banco

	@Column(name = "G004_CNAB2", length = 10, nullable = false)
	private String g004CNAB2; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "G015_COD_REM_RET", length = 1, nullable = false)
	private String g015CodRemRet; // Código Remessa / Retorno

	@Column(name = "G016_DATA_GERACAO_ARQ", length = 8, nullable = false)
	private String g016DataGeracaoArq; // Data de Geração do Arquivo

	@Column(name = "G017_HORA_GERACAO_ARQ", length = 6, nullable = false)
	private String g017HoraGeracaoArq; // Hora de Geração do Arquivo

	@Column(name = "G018_NUM_SEQ_ARQ", length = 6, nullable = false)
	private String g018NumSeqArq; // Número Seqüencial do Arquivo

	@Column(name = "G019_NUM_LAYOUT", length = 3, nullable = false)
	private String g019NumLayout; // N o da Versão do Layout do Arquivo

	@Column(name = "G020_DENSIDADE", length = 5, nullable = false)
	private String g020Densidade; // Densidade de Gravação do Arquivo

	@Column(name = "G021_RESERVADO_BANCO", length = 20, nullable = false)
	private String g021ReservadoBanco; // Para Uso Reservado do Banco

	@Column(name = "G022_RESERVADO_EMP", length = 20, nullable = false)
	private String g022ReservadoEmp; // Para Uso Reservado da Empresa

	@Column(name = "G004_CNAB3", length = 29, nullable = false)
	private String g004CNAB3; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "TIPO_ENDPOINT", length = 50, nullable = false)
	private String tipoEndpoint; // NOME ARQUIVO APENAS RETORNO

}

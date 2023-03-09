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
@Table(name = "TB_FOL_HEADER_LOTE")
public class FolhaHeaderLote implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancComp", "g002LoteServ", "g003TipoRegistro", "g028TipoOperacao", "g025TipoServico",
			"g029FormaLanc", "g030NumeroLayout", "g004CNAB1", "g005TipoInscEmp", "g006NumInscEmp",
			"g007CodConvBanc", "g008AgenciaCC", "g009DigitoAgencia", "g010NumCC",
			"g011DigitoCC", "g012DigitoAgenciaCC", "g013NomeEmpresa", "g031Mensagem", "g032Endereco",
			"g032NumeroEnd", "g032ComplementoEnd", "g033Cidade", "g034CEP", "g035ComplementoCEP", "g036UF",
			"g004CNAB2", "g059OcorrenciaRet"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOL_LOT_SEQ")
	@SequenceGenerator(sequenceName = "SEQ_TB_FOL_HEADER_LOTE", allocationSize = 1, name = "FOL_LOT_SEQ")
	private Long cod;

	@Column(name = "G001_COD_BANC_COMP", length = 3, nullable = false)
	private String g001CodBancComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERV", length = 4, nullable = false)
	private String g002LoteServ; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G028_TIPO_OPERACAO", length = 1, nullable = false)
	private String g028TipoOperacao; // Tipo da Operação

	@Column(name = "G025_TIPO_SERVICO", length = 2, nullable = false)
	private String g025TipoServico; // Tipo do Serviço

	@Column(name = "G029_FORMA_LANC", length = 2, nullable = false)
	private String g029FormaLanc; // Forma de Lançamento

	@Column(name = "G030_NUMERO_LAYOUT", length = 3, nullable = false)
	private String g030NumeroLayout; // Nº da Versão do Layout do Lote

	@Column(name = "G004_CNAB1", length = 1, nullable = false)
	private String g004CNAB1; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "G005_TIPO_INSC_EMP", length = 1, nullable = false)
	private String g005TipoInscEmp; // Tipo de Inscrição da Empresa

	@Column(name = "G006_NUM_INSC_EMP", length = 14, nullable = false)
	private String g006NumInscEmp; // Número de Inscrição da Empresa

	@Column(name = "G007_COD_CONV_BANC", length = 20, nullable = false)
	private String g007CodConvBanc; // Código do Convênio no Banco

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

	@Column(name = "G013_NOME_EMPRESA", length = 30, nullable = false)
	private String g013NomeEmpresa; // Nome da Empresa

	@Column(name = "G031_MENSAGEM", length = 40, nullable = false)
	private String g031Mensagem; // Mensagem

	@Column(name = "G032_ENDERECO", length = 30, nullable = false)
	private String g032Endereco; // Logradouro - Nome da Rua, Av, Pça, Etc

	@Column(name = "G032_NUMERO_END", length = 5, nullable = false)
	private String g032NumeroEnd; // Número

	@Column(name = "G032_COMPLEMENTO_END", length = 15, nullable = false)
	private String g032ComplementoEnd; // Complemento

	@Column(name = "G033_CIDADE", length = 20, nullable = false)
	private String g033Cidade; // Cidade

	@Column(name = "G034_CEP", length = 5, nullable = false)
	private String g034CEP; // CEP

	@Column(name = "G035_COMPLEMENTO_CEP", length = 3, nullable = false)
	private String g035ComplementoCEP; // Complemento CEP

	@Column(name = "G036_UF", length = 2, nullable = false)
	private String g036UF; // Estado

	@Column(name = "G004_CNAB2", length = 8, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G059_OCORRENCIA_RET", length = 10, nullable = false)
	private String g059OcorrenciaRet; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_ARQ", nullable = false)
	private Long codHeaderArq;
}

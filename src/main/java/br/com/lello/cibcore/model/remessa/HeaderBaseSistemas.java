package br.com.lello.cibcore.model.remessa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "TB_HEADER_BASE_SISTEMAS")
public class HeaderBaseSistemas implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G028_TIPO_OPERACAO", length = 1, nullable = false)
	private String g028TipoOperacao; // Tipo da Operação

	@Column(name = "G025_TIPO_SERVICO", length = 2, nullable = false)
	private String g025TipoServico; // Tipo do Serviço

	@Column(name = "G029_FORMA_LANCAMENTO", length = 2, nullable = false)
	private String g029FormaLancamento; // Forma de Lançamento

	@Column(name = "G030_VERSAO_LAYOUT_LOTE", length = 3, nullable = false)
	private String g030VersaoLayoutLote; // Nº da Versão do Layout do Lote

	@Column(name = "G004_CNAB", length = 1, nullable = false)
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

	@Column(name = "G031_MENSAGEM", length = 40, nullable = false)
	private String g031Mensagem; // Mensagem

	@Column(name = "G033_CIDADE", length = 20, nullable = false)
	private String g033Cidade; // Cidade

	@Column(name = "G034_CEP", length = 5, nullable = false)
	private String g034CEP; // CEP

	@Column(name = "G035_SUFIXO_CEP", length = 3, nullable = false)
	private String g035SufixoCEP; // Complemento CEP

	@Column(name = "G036_UF", length = 2, nullable = false)
	private String g036UF; // Estado

	@Column(name = "P014_IND_FORMA_PAG", length = 2, nullable = false)
	private String p014IndFormaPag; // Indicativo de Forma de Pagamento

	@Column(name = "G004_CNAB2", length = 6, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_ARQ", nullable = false)
	private Long codHeaderArq;

	@Column(name = "COD_HEADER_LOTE", nullable = false)
	private Long codHeaderLote;
}

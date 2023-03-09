package br.com.lello.cibcore.model.remessa;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_COB_H")
public class PagamentoCobrancaHeader implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g028_tipo_operacao", "g025TipoServico",
			"g029FormaLancamento", "g030VersaoLayoutLote", "g004CNAB", "g005TipoInscEmp", "g006NumInscEmp",
			"g007CodConvBanc", "g008AgenciaConta", "g009DigitoVerifAg", "g010NumeroCC", "g011DigitoVerifCC",
			"g012DigitoVerifACC", "g013Nome", "g031Mensagem", "g032Endereco", "g032Numero", "g032Complemento",
			"g033Cidade", "g034CEP", "g035SufixoCEP", "g036UF", "g004CNAB2", "g059CodOcorrRetRem"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAG_C_H")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_COB_H", allocationSize = 1, name = "PAG_C_H")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G028_TIPO_OPERACAO", length = 1, nullable = false)
	private String g028_tipo_operacao; // Tipo de Operação

	@Column(name = "G025_TIPO_SERVICO", length = 2, nullable = false)
	private String g025TipoServico; // Tipo de Serviço

	@Column(name = "G029_FORMA_LANCAMENTO", length = 2, nullable = false)
	private String g029FormaLancamento; // Uso Exclusivo da FEBRABAN/CNAB

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

	@Column(name = "G032E_ENDERECO", length = 30, nullable = false)
	private String g032Endereco; // Logradouro - Nome da Rua, Av, Pça, Etc

	@Column(name = "G032N_NUMERO", length = 5, nullable = false)
	private String g032Numero; // Número

	@Column(name = "G032C_COMPLEMENTO", length = 15, nullable = false)
	private String g032Complemento; // Complemento

	@Column(name = "G033_CIDADE", length = 20, nullable = false)
	private String g033Cidade; // Cidade

	@Column(name = "G034_CEP", length = 5, nullable = false)
	private String g034CEP; // CEP

	@Column(name = "G035_SUFIXO_CEP", length = 3, nullable = false)
	private String g035SufixoCEP; // Complemento CEP

	@Column(name = "G036_UF", length = 2, nullable = false)
	private String g036UF; // Estado

	@Column(name = "G004_CNAB2", length = 8, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_ARQ")
	private Long codHeaderArq;
	
	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_HEADER_LOTE", referencedColumnName = "COD", nullable = true)
	private List<PagamentoCobrancaDetalheJ> listPagamentoCobrancaDetalheJ = new ArrayList<>();
	
}

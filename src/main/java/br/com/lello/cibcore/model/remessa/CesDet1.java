package br.com.lello.cibcore.model.remessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.*;

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
@Table(name = "TB_CES_DET_1")
public class CesDet1 implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"idRegistro", "agenciaDebito", "digAgenciaDebito", "razaoContaCorrente", "contaCorrente", 
			"digContaCorrente", "idEmpresaBenef", "nroControle", "codBancoDebito", "campoMulta", 
			"percentualMulta", "idTituloBanco", "digAutoconf", "descontoBonific", "condicaoEmissao", 
			"idEmiteBoletoDia", "idOperacaoBanco", "idRateioCredito", "endAvisoConta", "qtdPagamentos", 
			"idOcorrencia", "nroDocumento", "dataVencTitulo", "valorTitulo", "bcoEncarregado", 
			"agenciaDepositaria", "especieTitulo", "identificacao", "dataEmissaoTitulo", "instrucao1", 
			"instrucao2", "valorDiaAtraso", "dataLimiteDesconto", "valorDesconto", "valorIOF", 
			"valorAbatCancelado", "idTipoPagador", "nroInscricaoPagador", "nomePagador", "enderecoCompleto", 
			"mensagem1", "cep", "sufixoCep", "benefFinalMsg", "seqResgitro"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CES_DET_1")
	@SequenceGenerator(sequenceName = "Seq_Tb_Ces_Det_1", allocationSize = 1, name = "CES_DET_1")
	private Long cod;

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro; // Identificacao do Registro

	@Column(name = "AGENCIA_DEBITO", length = 5, nullable = false)
	private String agenciaDebito; // Agencia de Debito (opcional)

	@Column(name = "DIG_AGENCIA_DEBITO", length = 1, nullable = false)
	private String digAgenciaDebito; // Digito da Agencia de Debito (opcional)

	@Column(name = "RAZAO_CONTA_CORRENTE", length = 5, nullable = false)
	private String razaoContaCorrente; // Razao da Conta-Corrente (opcional)

	@Column(name = "CONTA_CORRENTE", length = 7, nullable = false)
	private String contaCorrente; // Conta-Corrente (opcional)

	@Column(name = "DIG_CONTA_CORRENTE", length = 1, nullable = false)
	private String digContaCorrente; // Digito da Conta-Corrente (opcional)

	@Column(name = "ID_EMPRESA_BENEF_BANCO", length = 17, nullable = false)
	private String idEmpresaBenef; // Identificacao da Empresa Beneficiaria no Banco

	@Column(name = "NRO_CONTROLE_PARTICIP", length = 25, nullable = false)
	private String nroControle; // No Controle do Participante

	@Column(name = "COD_BANCO_DEBIT_CAMARA", length = 3, nullable = false)
	private String codBancoDebito; // Codigo do Banco a ser debitado na Camara de Compensacao

	@Column(name = "CAMPO_MULTA", length = 1, nullable = false)
	private String campoMulta; // Campo de Multa

	@Column(name = "PERCENTUAL_MULTA", length = 4, nullable = false)
	private String percentualMulta; // Percentual de Multa

	@Column(name = "ID_TITULO_BANCO", length = 11, nullable = false)
	private String idTituloBanco; // Identificacao do Título no Banco

	@Column(name = "DIG_AUTOCONF_NRO_BANCARIO", length = 1, nullable = false)
	private String digAutoconf; // Digito de Autoconferencia do Numero Bancario

	@Column(name = "DESCONTO_BONIFIC_DIA", length = 10, nullable = false)
	private String descontoBonific; // Desconto Bonificacao por dia

	@Column(name = "CONDICAO_EMISSAO_PAPEL_COB", length = 1, nullable = false)
	private String condicaoEmissao; // Condicao para Emissao da Papeleta de Cobranca

	@Column(name = "ID_EMITE_BOLETO_DA", length = 1, nullable = false)
	private String idEmiteBoletoDia; // Ident. se emite Boleto para Debito Automático

	@Column(name = "ID_OPERACAO_BANCO", length = 10, nullable = false)
	private String idOperacaoBanco; // Identificacao da Operacao do Banco

	@Column(name = "ID_RATEIO_CREDITO", length = 1, nullable = false)
	private String idRateioCredito; // Indicador Rateio Credito (opcional)

	@Column(name = "END_AVISO_DA_CONTA_CORRENTE", length = 1, nullable = false)
	private String endAvisoConta; // Enderecamento para Aviso do Debito Automatico em Conta-Corrente (opcional)

	@Column(name = "QTD_PAGAMENTOS", length = 2, nullable = false)
	private String qtdPagamentos; // Quantidade de Pagamentos

	@Column(name = "TD_OCORRENCIA", length = 2, nullable = false)
	private String idOcorrencia; // Identificacao da Ocorrencia

	@Column(name = "NRO_DOCUMENTO", length = 10, nullable = false)
	private String nroDocumento; // No do Documento

	@Column(name = "DATA_VENCTO_TITULO", length = 6, nullable = false)
	private String dataVencTitulo; // Data do Vencimento do Titulo

	@Column(name = "VALOR_TITULO", length = 13, nullable = false)
	private String valorTitulo; // Valor do Titulo

	@Column(name = "BCO_ENCARREGADO_COBRANCA", length = 3, nullable = false)
	private String bcoEncarregado; // Banco Encarregado da Cobranca

	@Column(name = "AGENDA_DEPOSITARIA", length = 5, nullable = false)
	private String agenciaDepositaria; // Agencia Depositaria 

	@Column(name = "ESPECIE_TITULO", length = 2, nullable = false)
	private String especieTitulo; // Especie de Titulo

	@Column(name = "IDENTIFICACAO", length = 1, nullable = false)
	private String identificacao; // Identificacao

	@Column(name = "DATA_EMISSAO_TITULO", length = 6, nullable = false)
	private String dataEmissaoTitulo; // Data da Emissao do Titulo

	@Column(name = "INSTRUCAO1", length = 2, nullable = false)
	private String instrucao1; // instrucao 1

	@Column(name = "INSTRUCAO2", length = 2, nullable = false)
	private String instrucao2; // instrucao 2

	@Column(name = "VALOR_COBRADO_DIA_ATRASO", length = 13, nullable = false)
	private String valorDiaAtraso; // Valor a ser Cobrado por Dia de Atraso

	@Column(name = "DATA_LIMITE_CONCES_DESCONTO", length = 6, nullable = false)
	private String dataLimiteDesconto; // Data Limite P/Concessao de Desconto

	@Column(name = "VALOR_DESCONTO", length = 13, nullable = false)
	private String valorDesconto; // Valor do Desconto

	@Column(name = "VALOR_IOF", length = 13, nullable = false)
	private String valorIOF; // Valor do IOF

	@Column(name = "VALOR_ABAT_CONCED_CANCELADO", length = 13, nullable = false)
	private String valorAbatCancelado; // Valor do Abatimento a ser Concedido ou Cancelado

	@Column(name = "ID_TIPO_INSCRICAO_PAGADOR", length = 2, nullable = false)
	private String idTipoPagador; // Identificação do Tipo de Inscricao do Pagador

	@Column(name = "NRO_INSCRICAO_PAGADOR", length = 14, nullable = false)
	private String nroInscricaoPagador; // No Inscricao do Pagador

	@Column(name = "NOME_PAGADOR", length = 40, nullable = false)
	private String nomePagador; // Nome do Pagador

	@Column(name = "ENDERECO_COMPLETO", length = 40, nullable = false)
	private String enderecoCompleto; // Endereco Completo

	@Column(name = "MENSAGEM1", length = 12, nullable = false)
	private String mensagem1; // mensagem 1

	@Column(name = "CEP", length = 5, nullable = false)
	private String cep; // Cep

	@Column(name = "SUFIXO_CEP", length = 3, nullable = false)
	private String sufixoCep; // Valor do Título

	@Column(name = "BENEF_FINAL_MENSAGEM2", length = 60, nullable = false)
	private String benefFinalMsg; // Beneficiário Final ou 2a Mensagem

	@Column(name = "SEQ_REGISTRO", length = 60, nullable = false)
	private String seqResgitro; // Nº Sequencial do Registro

	@Column(name = "COD_HEADER_ARQ", nullable = false)
	private Long codHeaderArq;


	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DET", nullable = true)
	private List<CesDet2> listCesDet2 = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DET", nullable = true)
	private List<CesDet3> listCesDet3 = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DET", nullable = true)
	private List<CesDet6> listCesDet6 = new ArrayList<>();

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DET", nullable = true)
	private List<CesDet7> listCesDet7 = new ArrayList<>();

}

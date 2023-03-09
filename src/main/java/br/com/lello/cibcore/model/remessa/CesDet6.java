package br.com.lello.cibcore.model.remessa;

import java.util.Arrays;
import java.util.LinkedHashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TB_CES_DET_6")
public class CesDet6 implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"idRegistro", "carteira", "agencia", "contaCorrente", "nossoNumero", 
			"digNossoNumero", "tipoOperacao", "utilChequeEspecial", "consultaSaldoApos", 
			"nroCodIdent", "prazoValidade", "brancos", "seqRegistro"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro; // Identificacao do Registro

	@Column(name = "CARTEIRA", length = 3, nullable = false)
	private String carteira; // Carteira

	@Column(name = "AGENCIA", length = 5, nullable = false)
	private String agencia; // Agencia

	@Column(name = "CONTA_CORRENTE", length = 7, nullable = false)
	private String contaCorrente; // Conta-Corrente

	@Column(name = "NOSSO_NUMERO", length = 11, nullable = false)
	private String nossoNumero; // Nosso Numero

	@Column(name = "DIG_NOSSO_NUMERO", length = 1, nullable = false)
	private String digNossoNumero; // Digito do Nosso Número

	@Column(name = "TIPO_OPERACAO", length = 1, nullable = false)
	private String tipoOperacao; // Tipo de Operação

	@Column(name = "UTILIZACAO_CHEQUE_ESPECIAL", length = 1, nullable = false)
	private String utilChequeEspecial; // Utilização do Cheque Especial

	@Column(name = "CONSULTA_SALDO_APOS_VENCTO", length = 1, nullable = false)
	private String consultaSaldoApos; // Consulta Saldo Apos o Vencimento

	@Column(name = "NRO_COD_ID_CONTRATO", length = 25, nullable = false)
	private String nroCodIdent; // Número Cód.Identificacao/Contrato

	@Column(name = "PRAZO_VALIDADE_CONTR_AUTORIZ", length = 8, nullable = false)
	private String prazoValidade; // Prazo de Validade do Contrato /Autorizacao

	@Column(name = "BRANCOS", length = 330, nullable = false)
	private String brancos; // Brancos

	@Column(name = "SEQ_REGISTRO", length = 6, nullable = false)
	private String seqRegistro; // Numero Sequencial do Registro

	@Column(name = "COD_DET", nullable = false)
	private Long codDetalhe;
	
}

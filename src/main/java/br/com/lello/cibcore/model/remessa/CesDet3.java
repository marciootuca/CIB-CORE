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
@Table(name = "TB_CES_DET_3")
public class CesDet3 implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"idRegistro", "idEmpresaBanco", "idTituloBanco", "codCalculoRateio", "tipoValorInformado", 
			"filler1", "codBancoCred1", "codAgenciaCred1", "digCodAgenciaCred1", "contaCorrenteCred1", 
			"digContaCorrenteCred1", "valorPercRat1", "nomeBenef1", "filler2", "parcela1", "floatBenef1", 
			"codBancoCred2", "codAgenciaCred2", "digCodAgenciaCred2", "contaCorrenteCred2", "digContaCorrenteCred2", 
			"valorPercRat2", "nomeBenef2", "filler3", "parcela2", "floatBenef2", "codBancoCred3", "codAgenciaCred3", 
			"digCodAgenciaCred3", "contaCorrenteCred3", "digContaCorrenteCred3", "valorPercRat3", "nomeBenef3", 
			"filler4", "parcela3", "floatBenef3", "seqRegistro"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro; // Identificacao do Registro

	@Column(name = "ID_EMPRESA_BANCO", length = 16, nullable = false)
	private String idEmpresaBanco; // Identificacao da Empresa no Banco

	@Column(name = "ID_TITULO_BANCO", length = 12, nullable = false)
	private String idTituloBanco; // Identificacao Titulo no Banco
	
	@Column(name = "COD_CALCULO_RATEIO", length = 1, nullable = false)
	private String codCalculoRateio; // Codigo Para Calculo do Rateio

	@Column(name = "TIPO_VALOR_INFORMADO", length = 1, nullable = false)
	private String tipoValorInformado; // Tipo de Valor Informado

	@Column(name = "FILLER1", length = 12, nullable = false)
	private String filler1; // FILLER1

	@Column(name = "COD_BANCO_CRED_BENEF1", length = 3, nullable = false)
	private String codBancoCred1; // Codigo do Banco para Credito do 1o Beneficiario

	@Column(name = "COD_AGENCIA_CRED_BENEF1", length = 5, nullable = false)
	private String codAgenciaCred1; // Codigo da Agencia para Credito do 1o Beneficiário

	@Column(name = "DIG_AGENCIA_CRED_BENEF1", length = 1, nullable = false)
	private String digCodAgenciaCred1; // Digito da Agencia para Credito do 1o Beneficiário

	@Column(name = "NRO_CONTA_CORRENTE_CRED_BENEF1", length = 12, nullable = false)
	private String contaCorrenteCred1; // Número da Conta-Corrente para Crédito do 1º Beneficiario

	@Column(name = "DIG_CONTA_CORRENTE_CRED_BENEF1", length = 1, nullable = false)
	private String digContaCorrenteCred1; // Digito da Conta-Corrente para Credito do 1o Beneficiario

	@Column(name = "VALOR_OU_PERCENT_RATEIO1", length = 15, nullable = false)
	private String valorPercRat1; // Valor, ou Percentual para Rateio

	@Column(name = "NOME_BENEF1", length = 40, nullable = false)
	private String nomeBenef1; // Nome do 1o Beneficiario

	@Column(name = "FILLER2", length = 31, nullable = false)
	private String filler2; // FILLER2

	@Column(name = "PARCELA1", length = 6, nullable = false)
	private String parcela1; // Parcela

	@Column(name = "FLOATING_BENEF1", length = 3, nullable = false)
	private String floatBenef1; // Floating para o 1o Beneficiario

	@Column(name = "COD_BANCO_CRED_BENEF2", length = 3, nullable = false)
	private String codBancoCred2; // Codigo do Banco para Credito do 2o Beneficiario

	@Column(name = "COD_AGENCIA_CRED_BENEF2", length = 5, nullable = false)
	private String codAgenciaCred2; // Codigo da Agencia para Credito do 2o Beneficiário

	@Column(name = "DIG_AGENCIA_CRED_BENEF2", length = 1, nullable = false)
	private String digCodAgenciaCred2; // Digito da Agencia para Credito do 2o Beneficiário

	@Column(name = "NRO_CONTA_CORRENTE_CRED_BENEF2", length = 12, nullable = false)
	private String contaCorrenteCred2; // Número da Conta-Corrente para Crédito do 2º Beneficiario

	@Column(name = "DIG_CONTA_CORRENTE_CRED_BENEF2", length = 1, nullable = false)
	private String digContaCorrenteCred2; // Digito da Conta-Corrente para Credito do 2o Beneficiario

	@Column(name = "VALOR_OU_PERCENT_RATEIO2", length = 15, nullable = false)
	private String valorPercRat2; // Valor, ou Percentual para Rateio

	@Column(name = "NOME_BENEF2", length = 40, nullable = false)
	private String nomeBenef2; // Nome do 2o Beneficiario

	@Column(name = "FILLER3", length = 31, nullable = false)
	private String filler3; // FILLER3

	@Column(name = "PARCELA2", length = 6, nullable = false)
	private String parcela2; // Parcela

	@Column(name = "FLOATING_BENEF2", length = 3, nullable = false)
	private String floatBenef2; // Floating para o 2o Beneficiario

	@Column(name = "COD_BANCO_CRED_BENEF3", length = 3, nullable = false)
	private String codBancoCred3; // Codigo do Banco para Credito do 3o Beneficiario

	@Column(name = "COD_AGENCIA_CRED_BENEF3", length = 5, nullable = false)
	private String codAgenciaCred3; // Codigo da Agencia para Credito do 3o Beneficiário

	@Column(name = "DIG_AGENCIA_CRED_BENEF3", length = 1, nullable = false)
	private String digCodAgenciaCred3; // Digito da Agencia para Credito do 3o Beneficiário

	@Column(name = "NRO_CONTA_CORRENTE_CRED_BENEF3", length = 12, nullable = false)
	private String contaCorrenteCred3; // Numero da Conta-Corrente para Credito do 3o Beneficiario

	@Column(name = "DIG_CONTA_CORRENTE_CRED_BENEF3", length = 1, nullable = false)
	private String digContaCorrenteCred3; // Digito da Conta-Corrente para Credito do 2o Beneficiario

	@Column(name = "VALOR_OU_PERCENT_RATEIO3", length = 15, nullable = false)
	private String valorPercRat3; // Valor, ou Percentual para Rateio

	@Column(name = "NOME_BENEF3", length = 40, nullable = false)
	private String nomeBenef3; // Nome do 2o Beneficiario

	@Column(name = "FILLER4", length = 31, nullable = false)
	private String filler4; // FILLER4

	@Column(name = "PARCELA3", length = 6, nullable = false)
	private String parcela3; // Parcela

	@Column(name = "FLOATING_BENEF3", length = 3, nullable = false)
	private String floatBenef3; // Floating para o 2o Beneficiario

	@Column(name = "SEQ_REGISTRO", length = 6, nullable = false)
	private String seqRegistro; // Numero Sequencial do Registro

	@Column(name = "COD_DET", nullable = false)
	private Long codDetalhe;

}

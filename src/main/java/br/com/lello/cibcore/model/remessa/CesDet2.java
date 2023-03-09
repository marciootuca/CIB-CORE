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
@Table(name = "TB_CES_DET_2")
public class CesDet2 implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"tipoRegistro", "mensagem1", "mensagem2", "mensagem3", "mensagem4", 
			"dataLimiteDesconto2", "valorDesconto2", "dataLimiteDesconto3", "valorDesconto3", 
			"reserva", "carteira", "agencia", "contaCorrente", "digContaCorrente", "nossoNumero", 
			"dacNossoNumero", "seqRegistro"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "TIPO_REGISTRO", length = 1, nullable = false)
	private String tipoRegistro; // Tipo Registro

	@Column(name = "MENSAGEM1", length = 80, nullable = false)
	private String mensagem1; // mensagem 1

	@Column(name = "MENSAGEM2", length = 80, nullable = false)
	private String mensagem2; // mensagem 2

	@Column(name = "MENSAGEM3", length = 80, nullable = false)
	private String mensagem3; // mensagem 3

	@Column(name = "MENSAGEM4", length = 80, nullable = false)
	private String mensagem4; // mensagem 4

	@Column(name = "DATA_LIMITE_CONCES_DESC2", length = 6, nullable = false)
	private String dataLimiteDesconto2; // Data-Limite para Concessao de Desconto 2

	@Column(name = "VALOR_DESCONTO2", length = 13, nullable = false)
	private String valorDesconto2; // Valor do Desconto 2

	@Column(name = "DATA_LIMITE_CONCES_DESC3", length = 6, nullable = false)
	private String dataLimiteDesconto3; // Data-Limite para Concessao de Desconto 3

	@Column(name = "VALOR_DESCONTO3", length = 13, nullable = false)
	private String valorDesconto3; // Valor do Desconto 3

	@Column(name = "RESERVA", length = 7, nullable = false)
	private String reserva; // Reserva

	@Column(name = "CARTEIRA", length = 3, nullable = false)
	private String carteira; // Carteira

	@Column(name = "AGENCIA", length = 5, nullable = false)
	private String agencia; // Agencia

	@Column(name = "CONTA_CORRENTE", length = 7, nullable = false)
	private String contaCorrente; // Conta-Corrente

	@Column(name = "DIGITO_CONTA_CORRENTE", length = 1, nullable = false)
	private String digContaCorrente; // Digito Conta-Corrente

	@Column(name = "NOSSO_NUMERO", length = 11, nullable = false)
	private String nossoNumero; // Nosso Numero

	@Column(name = "DAC_NOSSO_NUMERO", length = 1, nullable = false)
	private String dacNossoNumero; // DAC Nosso Numero

	@Column(name = "SEQ_REGISTRO", length = 1, nullable = false)
	private String seqRegistro; // No Sequencial de Registro

	@Column(name = "COD_DET", nullable = false)
	private Long codDetalhe;

}

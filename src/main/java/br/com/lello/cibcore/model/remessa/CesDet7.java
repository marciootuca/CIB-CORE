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
@Table(name = "TB_CES_DET_7")
public class CesDet7 implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"tipoRegistro", "enderecoBenef", "cep", "sufixoCep", "cidade", 
			"uf", "reserva", "carteira", "agencia", "contaCorrente", 
			"digContaCorrente", "nossoNumero", "digNossoNumero", "seqRegistro"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "TIPO_REGISTRO", length = 1, nullable = false)
	private String tipoRegistro; // Tipo Registro

	@Column(name = "ENDERECO_BENEF_FINAL", length = 45, nullable = false)
	private String enderecoBenef; // Endereco Beneficiario Final

	@Column(name = "CEP", length = 5, nullable = false)
	private String cep; // CEP

	@Column(name = "SUFIXO_CEP", length = 5, nullable = false)
	private String sufixoCep; // SUFIXO CEP

	@Column(name = "CIDADE", length = 20, nullable = false)
	private String cidade; // Cidade

	@Column(name = "UF", length = 2, nullable = false)
	private String uf; // UF

	@Column(name = "RESERVA", length = 290, nullable = false)
	private String reserva; // Tipo Registro

	@Column(name = "CARTEIRA", length = 3, nullable = false)
	private String carteira; // Carteira

	@Column(name = "AGENCIA", length = 5, nullable = false)
	private String agencia; // Agencia

	@Column(name = "CONTA_CORRENTE", length = 7, nullable = false)
	private String contaCorrente; // Conta-Corrente

	@Column(name = "DIG_CONTA_CORRENTE", length = 1, nullable = false)
	private String digContaCorrente; // Digito Conta-Corrente

	@Column(name = "NOSSO_NUMERO", length = 11, nullable = false)
	private String nossoNumero; // Nosso Numero

	@Column(name = "DAC_NOSSO_NUMERO", length = 1, nullable = false)
	private String digNossoNumero; // Digito do Nosso N??mero

	@Column(name = "SEQ_REGISTRO", length = 6, nullable = false)
	private String seqRegistro; // Numero Sequencial do Registro

	@Column(name = "COD_DET", nullable = false)
	private Long codDetalhe;
	
}

package br.com.lello.cibcore.model.retorno;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.lello.cibcore.model.remessa.AbstractRemessa;
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
@Table(name = "TB_CES_DET_4_RET")
public class CesDet4ret implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CES_RET_4")
	@SequenceGenerator(sequenceName = "SEQ_TB_CES_DET_4_RET", allocationSize = 1, name = "CES_RET_4")
	private Long cod; // 1

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro; // 2

	@Column(name = "CARTEIRA", length = 3, nullable = false)
	private String carteira; // 3

	@Column(name = "AGENCIA", length = 5, nullable = false)
	private String agencia; // 4

	@Column(name = "CONTA_CORRENTE", length = 7, nullable = false)
	private String contaCorrente; // 5

	@Column(name = "NOSSO_NUMERO", length = 11, nullable = false)
	private String nossoNumero; // 6 

	@Column(name = "DIG_NOSSO_NUMERO", length = 1, nullable = false)
	private String digNossoNumero; // 7

	@Column(name = "CHAVE_PIX_URL", length = 77, nullable = false)
	private String chavePixUrl; // 8

	@Column(name = "TXID", length = 35, nullable = false)
	private String txid; // 9

	@Column(name = "BRANCOS", length = 254, nullable = false)
	private String brancos; // 10

	@Column(name = "SEQ_REGISTRO", length = 6, nullable = false)
	private String seqRegistro; // 11

	@Column(name = "COD_DET", nullable = false)
	private Long codDetalhe; // 12
	
	@Column(name = "DATA_CREATED")
	private LocalDate dataCriacao; // 13

	@Column(name = "DATA_UPDATED")
	private LocalDate dataAltera; // 14

	@Column(name = "REGISTRO_ATIVO")
	private Integer regAtivo; // 15	
	
}

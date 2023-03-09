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
@Table(name = "TB_CES_DET_3_RET")
public class CesDet3ret implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CES_RET_3")
	@SequenceGenerator(sequenceName = "SEQ_TB_CES_DET_3_RET", allocationSize = 1, name = "CES_RET_3")
	private Long cod; // 1

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro; // 2

	@Column(name = "ID_EMPRESA_BANCO", length = 16, nullable = false)
	private String idEmpresaBanco; // 3

	@Column(name = "ID_TITULO_BANCO", length = 12, nullable = false)
	private String idTituloBanco; // 4
	
	@Column(name = "COD_CALCULO_RATEIO", length = 1, nullable = false)
	private String codCalculoRateio; // 5

	@Column(name = "TIPO_VALOR_INFORMADO", length = 1, nullable = false)
	private String tipoValorInformado; // 6

	@Column(name = "FILLER1", length = 12, nullable = false)
	private String filler1; // 7

	@Column(name = "COD_BANCO_CRED_BENEF1", length = 3, nullable = false)
	private String codBancoCred1; // 8

	@Column(name = "COD_AGENCIA_CRED_BENEF1", length = 5, nullable = false)
	private String codAgenciaCred1; // 9

	@Column(name = "DIG_AGENCIA_CRED_BENEF1", length = 1, nullable = false)
	private String digCodAgenciaCred1; // 10

	@Column(name = "NRO_CONTA_CORRENTE_CRED_BENEF1", length = 12, nullable = false)
	private String contaCorrenteCred1; // 11

	@Column(name = "DIG_CONTA_CORRENTE_CRED_BENEF1", length = 1, nullable = false)
	private String digContaCorrenteCred1; // 12

	@Column(name = "VALOR_EFETIVO_RATEIO_QDO_PGTO1", length = 15, nullable = false)
	private String valorEfetivoRat1; // 13

	@Column(name = "NOME_BENEF1", length = 40, nullable = false)
	private String nomeBenef1; // 14

	@Column(name = "FILLER2", length = 21, nullable = false)
	private String filler2; // 15

	@Column(name = "PARCELA1", length = 6, nullable = false)
	private String parcela1; // 16

	@Column(name = "FLOATING_BENEF1", length = 3, nullable = false)
	private String floatBenef1; // 17

	@Column(name = "DATA_CREDITO_BENEF1", length = 8, nullable = false)
	private String dataCreditoBenef1; // 18

	@Column(name = "STATUS_MOTIVO_OCOR_RATEIO1", length = 2, nullable = false)
	private String statusMotivoRateio1; // 19

	@Column(name = "COD_BANCO_CRED_BENEF2", length = 3, nullable = false)
	private String codBancoCred2; // 20

	@Column(name = "COD_AGENCIA_CRED_BENEF2", length = 5, nullable = false)
	private String codAgenciaCred2; // 21

	@Column(name = "DIG_AGENCIA_CRED_BENEF2", length = 1, nullable = false)
	private String digCodAgenciaCred2; // 22

	@Column(name = "NRO_CONTA_CORRENTE_CRED_BENEF2", length = 12, nullable = false)
	private String contaCorrenteCred2; // 23

	@Column(name = "DIG_CONTA_CORRENTE_CRED_BENEF2", length = 1, nullable = false)
	private String digContaCorrenteCred2; // 24

	@Column(name = "VALOR_EFETIVO_RATEIO_QDO_PGTO2", length = 15, nullable = false)
	private String valorEfetivoRat2; // 25

	@Column(name = "NOME_BENEF2", length = 40, nullable = false)
	private String nomeBenef2; // 26

	@Column(name = "FILLER3", length = 21, nullable = false)
	private String filler3; // 27

	@Column(name = "PARCELA2", length = 6, nullable = false)
	private String parcela2; // 28

	@Column(name = "FLOATING_BENEF2", length = 3, nullable = false)
	private String floatBenef2; // 29

	@Column(name = "DATA_CREDITO_BENEF2", length = 8, nullable = false)
	private String dataCreditoBenef2; // 30

	@Column(name = "STATUS_MOTIVO_OCOR_RATEIO2", length = 2, nullable = false)
	private String statusMotivoRateio2; // 31

	@Column(name = "COD_BANCO_CRED_BENEF3", length = 3, nullable = false)
	private String codBancoCred3; // 32

	@Column(name = "COD_AGENCIA_CRED_BENEF3", length = 5, nullable = false)
	private String codAgenciaCred3; // 33

	@Column(name = "DIG_AGENCIA_CRED_BENEF3", length = 1, nullable = false)
	private String digCodAgenciaCred3; // 34

	@Column(name = "NRO_CONTA_CORRENTE_CRED_BENEF3", length = 12, nullable = false)
	private String contaCorrenteCred3; // 35

	@Column(name = "DIG_CONTA_CORRENTE_CRED_BENEF3", length = 1, nullable = false)
	private String digContaCorrenteCred3; // 36

	@Column(name = "VALOR_EFETIVO_RATEIO_QDO_PGTO3", length = 15, nullable = false)
	private String valorEfetivoRat3; // 37

	@Column(name = "NOME_BENEF3", length = 40, nullable = false)
	private String nomeBenef3; // 38

	@Column(name = "FILLER4", length = 21, nullable = false)
	private String filler4; // 39

	@Column(name = "PARCELA3", length = 6, nullable = false)
	private String parcela3; // 40

	@Column(name = "FLOATING_BENEF3", length = 3, nullable = false)
	private String floatBenef3; // 41

	@Column(name = "DATA_CREDITO_BENEF3", length = 8, nullable = false)
	private String dataCreditoBenef3; // 42

	@Column(name = "STATUS_MOTIVO_OCOR_RATEIO3", length = 2, nullable = false)
	private String statusMotivoRateio3; // 43

	@Column(name = "SEQ_REGISTRO", length = 6, nullable = false)
	private String seqRegistro; // 44

	@Column(name = "COD_DET", nullable = false)
	private Long codDetalhe; // 45

	@Column(name = "DATA_CREATED")
	private LocalDate dataCriacao; // 46

	@Column(name = "DATA_UPDATED")
	private LocalDate dataAltera; // 47

	@Column(name = "REGISTRO_ATIVO")
	private Integer regAtivo; // 48
	
}

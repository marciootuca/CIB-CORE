package br.com.lello.cibcore.model.retorno;

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
@Table(name = "TB_CES_DET_1_RET")
public class CesDet1ret implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CES_RET_1")
	@SequenceGenerator(sequenceName = "SEQ_TB_CES_DET_1_RET", allocationSize = 1, name = "CES_RET_1")
	private Long cod; // 1

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro;  // 2

	@Column(name = "TIPO_INSCRICAO_EMPRESA", length = 2, nullable = false)
	private String tipoInscricaoEmpresa; // 3

	@Column(name = "NRO_INSCRICAO_EMPRESA", length = 14, nullable = false)
	private String numeroInscricao; // 4

	@Column(name = "ZEROS1", length = 3, nullable = false)
	private String zeros1; // 5

	@Column(name = "ID_EMPRESA_BENEF_BANCO", length = 17, nullable = false)
	private String idEmpresaBenef; // 6

	@Column(name = "NRO_CONTROLE_PARTICIPANTE", length = 25, nullable = false)
	private String nroControleParticipante; // 7

	@Column(name = "ZEROS2", length = 8, nullable = false)
	private String zeros2; // 8

	@Column(name = "ID_TITULO_BANCO1", length = 12, nullable = false)
	private String idTituloBanco1; // 9

	@Column(name = "USO_BANCO1", length = 10, nullable = false)
	private String usoBanco1; // 10

	@Column(name = "USO_BANCO2", length = 12, nullable = false)
	private String usoBanco2; // 11

	@Column(name = "INDICADOR_RATEIO_CREDITO", length = 1, nullable = false)
	private String indRateioCredito; // 12

	@Column(name = "PAGAMENTO_PARCIAL", length = 2, nullable = false)
	private String pagamentoParcial; // 13

	@Column(name = "CARTEIRA", length = 1, nullable = false)
	private String carteira; // 14

	@Column(name = "ID_OCORRENCIA", length = 2, nullable = false)
	private String idOcorrencia; // 15

	@Column(name = "DATA_OCORRENCIA_BANCO", length = 6, nullable = false)
	private String dataOcorrencia; // 16

	@Column(name = "NRO_DOCUMENTO", length = 10, nullable = false)
	private String numeroDocumento; // 17

	@Column(name = "ID_TITULO_BANCO2", length = 20, nullable = false)
	private String idTituloBanco2; // 18

	@Column(name = "DATA_VENCTO_TITULO", length = 6, nullable = false)
	private String dataVencimentoTitulo; // 19

	@Column(name = "VALOR_TITULO", length = 13, nullable = false)
	private String valorTitulo; // 20

	@Column(name = "BANCO_COBRADOR", length = 3, nullable = false)
	private String bancoCobrador; // 21

	@Column(name = "AGENCIA_COBRADORA", length = 5, nullable = false)
	private String agenciaCobradora; // 22

	@Column(name = "ESPECIE_TITULO", length = 2, nullable = false)
	private String especieTitulo; // 23

	@Column(name = "OCORRENCIA", length = 13, nullable = false)
	private String ocorrencia; // 24

	@Column(name = "OUTRAS_DESPESAS_CUSTA_PROTESTO", length = 13, nullable = false)
	private String outrasDespesasCusta; // 25

	@Column(name = "JUROS_OPERACAO_ATRASO", length = 13, nullable = false)
	private String jurosOperacaoAtraso; // 26

	@Column(name = "IOF_DEVIDO", length = 13, nullable = false)
	private String iofDevido; // 27

	@Column(name = "ABATIMENTO_CONCEDIDO_TITULO", length = 13, nullable = false)
	private String abatimentoConcedido; // 28

	@Column(name = "DESCONTO_CONCEDIDO", length = 13, nullable = false)
	private String descontoConcedido; // 29

	@Column(name = "VALOR_PAGO", length = 13, nullable = false)
	private String valorPago; // 30

	@Column(name = "JUROS_MORA", length = 13, nullable = false)
	private String jurosMora; // 31

	@Column(name = "OUTROS_CREDITOS", length = 13, nullable = false)
	private String outrosCreditos; // 32

	@Column(name = "BRANCOS1", length = 2, nullable = false)
	private String brancos1; // 33

	@Column(name = "MOTIVO_COD_OCORRENCIA", length = 1, nullable = false)
	private String motivoCodOcorrencia; // 34

	@Column(name = "DATA_CREDITO", length = 6, nullable = false)
	private String dataCredito; // 35

	@Column(name = "ORIGEM_PAGAMENTO", length = 3, nullable = false)
	private String origemPagamento; // 36

	@Column(name = "BRANCOS2", length = 10, nullable = false)
	private String brancos2; // 37

	@Column(name = "QDO_CHEQUE_BRADESCO_INFORME", length = 4, nullable = false)
	private String qdoChequeBradesco; // 38

	@Column(name = "MOTIVOS_REJEICOES_OCORRENCIAS", length = 10, nullable = false)
	private String motivosRejeicoes; // 39

	@Column(name = "BRANCOS3", length = 40, nullable = false)
	private String brancos3; // 40

	@Column(name = "NUMERO_CARTORIO", length = 2, nullable = false)
	private String numeroCartorio; // 41

	@Column(name = "NUMERO_PROTOCOLO", length = 10, nullable = false)
	private String numeroProtocolo; // 42

	@Column(name = "BRANCOS4", length = 14, nullable = false)
	private String brancos4; // 43

	@Column(name = "SEQ_REGISTRO", length = 6, nullable = false)
	private String seqResgitro; // 44

	@Column(name = "COD_HEADER_ARQ", nullable = false)
	private Long codHeaderArq; // 45

}

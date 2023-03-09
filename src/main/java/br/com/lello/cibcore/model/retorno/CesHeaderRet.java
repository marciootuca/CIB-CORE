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
@Table(name = "TB_CES_HEARDER_ARQ_RET")
public class CesHeaderRet implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CES_RET_H")
	@SequenceGenerator(sequenceName = "SEQ_TB_CES_HEARDER_ARQ_RET", allocationSize = 1, name = "CES_RET_H")
	private Long cod;

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro; // Identificação do Registro

	@Column(name = "ID_ARQUIVO_RETORNO", length = 1, nullable = false)
	private String idArquivoRemessa; // Identificação do Arquivo-Remessa

	@Column(name = "LITERAL_RETORNO", length = 7, nullable = false)
	private String literalRemessa; // Literal Remessa

	@Column(name = "COD_SERVICO", length = 2, nullable = false)
	private String codServico; // Código de Serviço

	@Column(name = "LITERAL_SERVICO", length = 15, nullable = false)
	private String literalServico; // Literal Serviço

	@Column(name = "COD_EMPRESA", length = 20, nullable = false)
	private String codEmpresa; // Código da Empresa

	@Column(name = "NOME_EMPRESA_EXTENSO", length = 30, nullable = false)
	private String nomeEmpresa; // Nome da Empresa

	@Column(name = "NRO_BRADESCO_CAMARA_COMPENS", length = 3, nullable = false)
	private String nroBradCamara; // Número do Bradesco na Câmara de Compensação

	@Column(name = "NOME_BANCO_EXTENSO", length = 15, nullable = false)
	private String nomeBanco; // Nome do Banco por Extenso

	@Column(name = "DATA_GRAVACAO_ARQUIVO", length = 6, nullable = false)
	private String dataGravacaoArquivo; // Data da Gravação do Arquivo

	@Column(name = "DENSIDADE_GRAVACAO", length = 8, nullable = false)
	private String densidade; // Densidade de Gravação

	@Column(name = "NRO_AVISO_BANCARIO", length = 5, nullable = false)
	private String numAvisoBancario; // Nº Aviso Bancário

	@Column(name = "BRANCO1", length = 266, nullable = false)
	private String branco1; // BRANCO2

	@Column(name = "DATA_CREDITO", length = 6, nullable = false)
	private String dataCredito; // Nº Sequencial de Remessa

	@Column(name = "BRANCO2", length = 9, nullable = false)
	private String branco2; // BRANCO2

	@Column(name = "SEQ_REGISTRO", length = 6, nullable = false)
	private String seqRegistro; // Nº Sequencial do Registro
}

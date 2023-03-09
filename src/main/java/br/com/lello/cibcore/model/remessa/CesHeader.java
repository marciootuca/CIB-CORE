package br.com.lello.cibcore.model.remessa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "TB_CES_HEARDER_ARQ")
public class CesHeader implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "ID_REGISTRO", length = 1, nullable = false)
	private String idRegistro; // Identificação do Registro

	@Column(name = "ID_ARQUIVO_REMESSA", length = 1, nullable = false)
	private String idArquivoRemessa; // Identificação do Arquivo-Remessa

	@Column(name = "LITERAL_REMESSA", length = 7, nullable = false)
	private String literalRemessa; // Literal Remessa

	@Column(name = "COD_SERVICO", length = 2, nullable = false)
	private String codServico; // Código de Serviço

	@Column(name = "LITERAL_SERVICO", length = 15, nullable = false)
	private String literalServico; // Literal Serviço

	@Column(name = "COD_EMPRESA", length = 20, nullable = false)
	private String codEmpresa; // Código da Empresa

	@Column(name = "NOME_EMPRESA", length = 30, nullable = false)
	private String nomeEmpresa; // Nome da Empresa

	@Column(name = "NRO_BRADESCO_CAMARA_COMPENSA", length = 3, nullable = false)
	private String nroBradCamara; // Número do Bradesco na Câmara de Compensação

	@Column(name = "NOME_BANCO_EXTENSO", length = 15, nullable = false)
	private String nomeBanco; // Nome do Banco por Extenso

	@Column(name = "DATA_GRAVACAO_ARQUIVO", length = 6, nullable = false)
	private String dataGravacaoArquivo; // Data da Gravação do Arquivo

	@Column(name = "BRANCO1", length = 8, nullable = false)
	private String branco1; // BRANCO1

	@Column(name = "ID_SISTEMA", length = 2, nullable = false)
	private String idSistema; // Identificação do Sistema

	@Column(name = "SEQ_REMESSA", length = 7, nullable = false)
	private String seqRemessa; // Nº Sequencial de Remessa

	@Column(name = "BRANCO2", length = 277, nullable = false)
	private String branco2; // BRANCO2

	@Column(name = "SEQ_REG_UM_EM_UM", length = 6, nullable = false)
	private String seqReg1de1; // Nº Sequencial do Registro de Um em Um

}

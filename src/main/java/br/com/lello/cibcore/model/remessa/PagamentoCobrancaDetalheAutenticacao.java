package br.com.lello.cibcore.model.remessa;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_COB_DET_AUTENT")
public class PagamentoCobrancaDetalheAutenticacao implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código do Banco na Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Sequencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Cód. Segmento do Registro Detalhe

	@Column(name = "Z001_AUT_ATENDER_LEG", length = 64, nullable = false)
	private String z001AutAtenderLeg; // Autenticação para atender Legislação

	@Column(name = "Z002_AUT_BANCARIA_PROT", length = 25, nullable = false)
	private String z002AutBancariaProt; // Autenticação Bancária / Protocolo

	@Column(name = "G004_CNAB", length = 127, nullable = false)
	private String g004CNAB; // Uso CNAB/FEBRABAN

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@ManyToOne
	@JoinColumn(name = "COD_DETALHE", referencedColumnName = "COD", nullable = true)
	private PagamentoCobrancaDetalheJ detalhe;
}

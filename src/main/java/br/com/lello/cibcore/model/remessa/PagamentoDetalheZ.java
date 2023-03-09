package br.com.lello.cibcore.model.remessa;

import java.util.Arrays;
import java.util.LinkedHashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
@Table(name = "TB_PAG_DET_Z")
public class PagamentoDetalheZ implements AbstractRemessa {

	@Transient
	@Builder.Default
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp", "g002LoteServico", "g003TipoRegistro", "g038NumSeqLote", "g039CodSeqDetalhe",
			"z001AutAtenderLeg", "z002AutBancariaProt", "g004CNAB", "z002AutBancariaProt"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_Z")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_Z", allocationSize = 1, name = "DET_Z")
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
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_DETALHE", nullable = true)
	private Long codDetalhe;
}

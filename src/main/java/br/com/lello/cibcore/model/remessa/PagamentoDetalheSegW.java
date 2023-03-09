package br.com.lello.cibcore.model.remessa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "TB_PAG_DET_SEG_W")
public class PagamentoDetalheSegW implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código no Banco da Compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Registro Detalhe de Lote

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Seqüencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Código de Segmento no Reg. Detalhe

	@Column(name = "N023_NUM_SEQ_REG_COMPL", length = 1, nullable = false)
	private String n023NumSeqRegCompl; // Número Seq. Registro Complementar

	@Column(name = "N024_TIPO_INFORMACAO", length = 1, nullable = false)
	private String n024TipoInformacao; // Identifica o Uso das informações 1 e 2

	@Column(name = "N025_INFO_COMP", length = 80, nullable = false)
	private String n025InfoComp; // nformação Complementar 1

	@Column(name = "N025_INFO_COMP2", length = 80, nullable = false)
	private String n025InfoComp2; // Informação Complementar 2

	@Column(name = "N027_ID_TRIBUTO", length = 2, nullable = false)
	private String n027IdTributo; // Identificador de Tributo

	@Column(name = "N026_INFO_COMP_TRIB", length = 2, nullable = false)
	private String n026InfoCompTrib; // Informação Complementar Tributo

	@Column(name = "G004_CNAB", length = 2, nullable = false)
	private String g004CNAB; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_DETALHE", nullable = false)
	private Long codDetalhe;

	@Builder.Default
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COD_DET", nullable = true)
	private List<PagamentoDetalheSegW1FGTS> listPagamentoDetalheSegW1FGTS = new ArrayList<>();
}

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
@Table(name = "TB_PAG_COB_DET_Y")
public class PagamentoCobrancaDetalheY implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"g001CodBancoComp","g002LoteServico","g003TipoRegistro","g038NumSeqLote","g039CodSeqDetalhe",
			"g004CNAB","g061CodInstrMov","g067IdRegistroOpc","g063CodBarras","g062CodPadrao",
			"a001CodFEBRABAM","a002CompOcorrencia","g004CNAB2","g059CodOcorrRetRem"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_Y")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_COB_DET_Y", allocationSize = 1, name = "DET_Y")
	private Long cod;

	@Column(name = "G001_COD_BANCO_COMP", length = 3, nullable = false)
	private String g001CodBancoComp; // Código no Banco na compensação

	@Column(name = "G002_LOTE_SERVICO", length = 4, nullable = false)
	private String g002LoteServico; // Lote de Serviço

	@Column(name = "G003_TIPO_REGISTRO", length = 1, nullable = false)
	private String g003TipoRegistro; // Tipo de Registro

	@Column(name = "G038_NUM_SEQ_LOTE", length = 5, nullable = false)
	private String g038NumSeqLote; // Nº Sequencial do Registro no Lote

	@Column(name = "G039_COD_SEQ_DETALHE", length = 1, nullable = false)
	private String g039CodSeqDetalhe; // Cód. Segmento do Registro Detalhe

	@Column(name = "G004_CNAB", length = 1, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G061_COD_INSTR_MOV", length = 2, nullable = false)
	private String g061CodInstrMov; // Código de Movimento Remessa

	@Column(name = "G067_ID_REGISTRO_OPC", length = 2, nullable = false)
	private String g067IdRegistroOpc; // Identificação Registro Opcional

	@Column(name = "G063_COD_BARRAS", length = 44, nullable = false)
	private String g063CodBarras; // Código de Barras

	@Column(name = "G062_COD_PADRAO", length = 2, nullable = false)
	private String g062CodPadrao; // Código Padrão

	@Column(name = "A001_COD_FEBRABAM", length = 4, nullable = false)
	private String a001CodFEBRABAM; // Código de Ocorrência

	@Column(name = "A002_COMP_OCORRENCIA", length = 150, nullable = false)
	private String a002CompOcorrencia; // Complemento de Ocorrência

	@Column(name = "G004_CNAB2", length = 11, nullable = false)
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "G059_COD_OCORR_RET_REM", length = 10, nullable = false)
	private String g059CodOcorrRetRem; // Código de Ocorrência Retorno

	@Column(name = "TIPO_ARQUIVO_RMRT", length = 2, nullable = false)
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO

	@Column(name = "NOME_ARQUIVO", length = 30, nullable = false)
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	@Column(name = "COD_HEADER_LOTE", nullable = false)
	private Long codHeaderLote;
}

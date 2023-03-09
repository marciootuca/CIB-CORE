package br.com.lello.cibcore.model.remessa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAG_DET_GARE_SP")
public class PagamentoDetalheGareSP implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"n002CodReceitaTrib", "n003TpIdContribuinte", "n004IdContribuinte", "n005CodIdTributo", "g044DataVencimento",
			"n012InsMunDec", "n013DividaEtiqueta", "n006PerRefComp", "n014ParcNotific", "g042ValorDocumento",
			"g047ValorMora", "g048ValorMulta", "g004CNAB"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_GARE")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_GARE_SP", allocationSize = 1, name = "DET_GARE")
	private Long cod;

	@Column(name = "N002_COD_RECEITA_TRIB", length = 6, nullable = false)
	private String n002CodReceitaTrib; // Código da Receita do Tributo

	@Column(name = "N003_TP_ID_CONTRIBUINTE", length = 2, nullable = false)
	private String n003TpIdContribuinte; // Tipo de Identificação do Contribuinte

	@Column(name = "N004_ID_CONTRIBUINTE", length = 14, nullable = false)
	private String n004IdContribuinte; // Identificação do Contribuinte

	@Column(name = "N005_COD_ID_TRIBUTO", length = 2, nullable = false)
	private String n005CodIdTributo; // Código de Identificação do Tributo

	@Column(name = "G044_DATA_VENCIMENTO", length = 8, nullable = false)
	private String g044DataVencimento; // Data de Vencimento

	@Column(name = "N012_INS_MUN_DEC", length = 12, nullable = false)
	private String n012InsMunDec; // Inscrição Estadual / Código do Município / Número da Declaração

	@Column(name = "N013_DIVIDA_ETIQUETA", length = 13, nullable = false)
	private String n013DividaEtiqueta; // Dívida Ativa / N. Etiqueta

	@Column(name = "N006_PER_REF_COMP", length = 6, nullable = false)
	private String n006PerRefComp; // Período de Referência

	@Column(name = "N014_PARC_NOTIFIC", length = 13, nullable = false)
	private String n014ParcNotific; // Número da Parcela / Notificação

	@Column(name = "G042_VALOR_DOCUMENTO", length = 15, nullable = false)
	private String g042ValorDocumento; // Valor da Receita

	@Column(name = "G047_VALOR_MORA", length = 14, nullable = false)
	private String g047ValorMora; // Valor dos Juros / Encargos

	@Column(name = "G048_VALOR_MULTA", length = 14, nullable = false)
	private String g048ValorMulta; // Valor da Multa

	@Column(name = "G004_CNAB", length = 1, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "COD_DET", nullable = false)
	private Long codDet;
}

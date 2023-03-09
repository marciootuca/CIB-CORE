package br.com.lello.cibcore.model.remessa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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
@Table(name = "TB_PAG_DET_DARF")
public class PagamentoDetalheDarf implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"n002CodReceitaTrib", "n003TpIdContribuinte", "n004IdContribuinte", "n005CodIdTributo", "n008PeriodoApr",
			"n009NumeroReferencia", "g042ValorDocumento", "g048ValorMulta", "g047ValorMora", "g044DataVencimento",
			"g004CNAB"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_DARF")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_DARF", allocationSize = 1, name = "DET_DARF")
	private Long cod;

	@Column(name = "N002_COD_RECEITA_TRIB", length = 6, nullable = false)
	private String n002CodReceitaTrib; // Código da Receita do Tributo

	@Column(name = "N003_TP_ID_CONTRIBUINTE", length = 2, nullable = false)
	private String n003TpIdContribuinte; // Tipo de Identificação do Contribuinte

	@Column(name = "N004_ID_CONTRIBUINTE", length = 14, nullable = false)
	private String n004IdContribuinte; // Identificação do Contribuinte

	@Column(name = "N005_COD_ID_TRIBUTO", length = 2, nullable = false)
	private String n005CodIdTributo; // Código de Identificação do Tributo

	@Column(name = "N008_PERIODO_APR", length = 8, nullable = false)
	private String n008PeriodoApr; // Período de Apuração

	@Column(name = "N009_NUMERO_REFERENCIA", length = 17, nullable = false)
	private String n009NumeroReferencia; // Número de Referência

	@Column(name = "G042_VALOR_DOCUMENTO", length = 15, nullable = false)
	private String g042ValorDocumento; // Valor Principal

	@Column(name = "G048_VALOR_MULTA", length = 15, nullable = false)
	private String g048ValorMulta; // Valor da Multa

	@Column(name = "G047_VALOR_MORA", length = 15, nullable = false)
	private String g047ValorMora; // Valor dos Juros / Encargos

	@Column(name = "G044_DATA_VENCIMENTO", length = 8, nullable = false)
	private String g044DataVencimento; // Data de Vencimento

	@Column(name = "G004_CNAB", length = 18, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "COD_DET", nullable = false)
	private Long codDet;
}

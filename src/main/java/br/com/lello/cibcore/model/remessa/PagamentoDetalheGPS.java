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
@Table(name = "TB_PAG_DET_GPS")
public class PagamentoDetalheGPS implements AbstractRemessa {

	@Transient
	private LinkedHashSet<String> campos = new LinkedHashSet<>(Arrays.asList(
			"n002CodReceitaTrib", "n003TpIdContribuinte", "n004IdContribuinte", "n005CodIdTributo", "n006PerRefComp",
			"g055ValInss", "g054ValOutrosAcr", "n007ValAtualizacaoMon", "g004CNAB"
	));

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DET_GPS")
	@SequenceGenerator(sequenceName = "SEQ_TB_PAG_DET_GPS", allocationSize = 1, name = "DET_GPS")
	private Long cod;

	@Column(name = "N002_COD_RECEITA_TRIB", length = 6, nullable = false)
	private String n002CodReceitaTrib; // Código da Receita do Tributo

	@Column(name = "N003_TP_ID_CONTRIBUINTE", length = 2, nullable = false)
	private String n003TpIdContribuinte; // Tipo de Identificação do Contribuinte

	@Column(name = "N004_ID_CONTRIBUINTE", length = 14, nullable = false)
	private String n004IdContribuinte; // Identificação do Contribuinte

	@Column(name = "N005_COD_ID_TRIBUTO", length = 2, nullable = false)
	private String n005CodIdTributo; // Código de Identificação do Tributo

	@Column(name = "N006_PER_REF_COMP", length = 6, nullable = false)
	private String n006PerRefComp; // Mês e ano de competência

	@Column(name = "G055_VAL_INSS", length = 15, nullable = false)
	private String g055ValInss; // Valor previsto do pagamento do INSS

	@Column(name = "G054_VAL_OUTROS_ACR", length = 15, nullable = false)
	private String g054ValOutrosAcr; // Valor de Outras Entidades

	@Column(name = "N007_VAL_ATUALIZACAO_MON", length = 15, nullable = false)
	private String n007ValAtualizacaoMon; // Atualização Monetária

	@Column(name = "G004_CNAB", length = 45, nullable = false)
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB

	@Column(name = "COD_DET", nullable = false)
	private Long codDet;
}

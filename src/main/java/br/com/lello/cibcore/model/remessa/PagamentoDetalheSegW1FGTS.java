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
@Table(name = "TB_PAG_DET_SEG_W1_FGTS")
public class PagamentoDetalheSegW1FGTS implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD", nullable = false)
	private Long cod;

	@Column(name = "N027_ID_TRIBUTO", length = 2, nullable = false)
	private String n027IdTributo; // Identificador de Tributo VARCHAR2(2 BYTE)

	@Column(name = "N002_COD_RECEITA_TRIB", length = 6, nullable = false)
	private String n002CodReceitaTrib; // Código da Receita do Tributo VARCHAR2(6 BYTE)

	@Column(name = "N003_TP_ID_CONTRIBUINTE", length = 2, nullable = false)
	private String n003TpIdContribuinte; // Tipo de Identificação do Contribuinte VARCHAR2(2 BYTE)

	@Column(name = "N004_ID_CONTRIBUINTE", length = 14, nullable = false)
	private String n004IdContribuinte; // Identificação do Contribuinte VARCHAR2(14 BYTE)

	@Column(name = "N021_IDENTIFICADOR", length = 16, nullable = false)
	private String n021Identificador; // Campo Identificador do FGTS VARCHAR2(16 BYTE)

	@Column(name = "N028_LACRE_CONEC_SOCIAL", length = 9, nullable = false)
	private String n028LacreConecSocial; // Lacre do Conectividade Social VARCHAR2(9 BYTE)

	@Column(name = "N029_DIG_LACRE_CONEC", length = 2, nullable = false)
	private String n029DigLacreConec; // Dígito do Lacre do Conectividade VARCHAR2(2 BYTE)

	@Column(name = "G004_CNAB", length = 1, nullable = false)
	private String g004CNAB; // Uso Exclusivo da FEBRABAN/CNAB

	@Column(name = "COD_DET", nullable = false)
	private Long codDet;
}

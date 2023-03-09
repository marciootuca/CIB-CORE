package br.com.lello.cibcore.model.remessa;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
@Table(name = "TB_REMESSA_CIB")
public class Remessa implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_REMESSA_CIB", sequenceName = "SEQ_REMESSA_CIB", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_REMESSA_CIB")
	@Column(name = "REM_IN_ID", nullable = false)
	private Long remInId; // CAMPO CHAVE IDENTIFICADOR

	@Column(name = "REM_ST_ROTINA", length = 200, nullable = false)
	private String remStRotina; // NOME DA ROTINA PROCESSADA

	@Column(name = "REM_DT_GERACAO", nullable = false)
	private LocalDateTime remDtGeracao; // DATA DE GERAÇÃO DO ARQUIVO

	@Column(name = "REM_CL_ARQUIVO", nullable = false)
	private String remClArquivo; // ARQUIVO TEXTO ENVIADO PARA O BANCO - OU JSON DE CHAMADA API

	@Column(name = "REM_ST_NOME_ARQUIVO", length = 30, nullable = false)
	@Builder.Default
	private String remStNomeArquivo = "API"; // NOME DO ARQUIVO ENVIADO PARA O BANCO
}

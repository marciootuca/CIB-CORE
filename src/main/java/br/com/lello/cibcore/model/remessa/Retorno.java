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
@Table(name = "TB_RETORNO_CIB")
public class Retorno implements AbstractRemessa {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RET_IN_ID", nullable = false)
	@SequenceGenerator(name = "SEQ_RETORNO_CIB", sequenceName = "SEQ_RETORNO_CIB", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RETORNO_CIB")
	private Long retInId; // CAMPO CHAVE IDENTIFICADOR

	@Column(name = "RET_ST_ROTINA", length = 200, nullable = false)
	private String retStRotina; // NOME DA ROTINA PROCESSADA

	@Column(name = "RET_DT_IMPORTACAO", nullable = false)
	private LocalDateTime retDtImportacao; // DATA DE GERAÇÃO DO ARQUIVO

	@Column(name = "RET_CL_ARQUIVO", nullable = false)
	private String retClArquivo; // ARQUIVO TEXTO ENVIADO PARA O BANCO - OU JSON DE CHAMADA API

	@Column(name = "RET_ST_NOME_ARQUIVO", length = 30, nullable = false)
	@Builder.Default
	private String retStNomeArquivo = "API"; // NOME DO ARQUIVO ENVIADO PARA O BANCO
}

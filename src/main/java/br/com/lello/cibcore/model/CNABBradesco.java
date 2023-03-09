package br.com.lello.cibcore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class CNABBradesco {
    @Column
    private String cnpj;
    @Column
    private String tipo;
    @Column
    private String status;
    @Column
    private String flEnvioBco;
    @Column
    private String codErro2;
    @Column
    private Date dataVencimento;
    @Column
    private String tipoPE;
    @Column
    private Date dataLancamento;
    @Column
    private Long bancoPagto;
    @Id
    private Long numeroDoc;
    private String envioBanco;
    @Column
    private String liberado;
    @Column
    private String contaVinculada;
    @Column
    private String flagISS;
    @Column
    private BigDecimal valor;
    @Column
    private BigDecimal valorIRRF;
    @Column
    private BigDecimal valorISS;
    @Column
    private BigDecimal valorINSS;
    @Column
    private BigDecimal valorCSLL;
    @Column
    private BigDecimal valorCOFINS;
    @Column
    private BigDecimal valorPISPASEP;
    @Column
    private BigDecimal valorSeguridade;
}

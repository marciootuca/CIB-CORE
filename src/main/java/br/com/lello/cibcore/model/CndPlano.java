package br.com.lello.cibcore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "CNDPLANO")
public class CndPlano {
    @Id
    @Column(name = "CONTA", nullable = false)
    private Integer conta;

    @Column(name = "RECNUM")
    private Long recnum;

    @Column(name = "NOME", length = 30)
    private String nome;

    @Column(name = "TIPO", length = 1)
    private String tipo;

    @Column(name = "CONTA_DISPLAY", length = 11)
    private String contaDisplay;

    @Column(name = "GRAU")
    private Short grau;

    @Column(name = "ANTIGO")
    private Short antigo;

    @Column(name = "COD_REDUZIDO")
    private Integer codReduzido;

    @Column(name = "TIPO_CONTA", length = 1)
    private String tipoConta;

    @Column(name = "PERCMES1", precision = 6, scale = 2)
    private BigDecimal percmes1;

    @Column(name = "PERCMES2", precision = 6, scale = 2)
    private BigDecimal percmes2;

    @Column(name = "PERCMES3", precision = 6, scale = 2)
    private BigDecimal percmes3;

    @Column(name = "PERCMES4", precision = 6, scale = 2)
    private BigDecimal percmes4;

    @Column(name = "PERCMES5", precision = 6, scale = 2)
    private BigDecimal percmes5;

    @Column(name = "PERCMES6", precision = 6, scale = 2)
    private BigDecimal percmes6;

    @Column(name = "PERCMES7", precision = 6, scale = 2)
    private BigDecimal percmes7;

    @Column(name = "PERCMES8", precision = 6, scale = 2)
    private BigDecimal percmes8;

    @Column(name = "PERCMES9", precision = 6, scale = 2)
    private BigDecimal percmes9;

    @Column(name = "PERCMES10", precision = 6, scale = 2)
    private BigDecimal percmes10;

    @Column(name = "PERCMES11", precision = 6, scale = 2)
    private BigDecimal percmes11;

    @Column(name = "PERCMES12", precision = 6, scale = 2)
    private BigDecimal percmes12;

    @Column(name = "PERCPREV1", precision = 6, scale = 2)
    private BigDecimal percprev1;

    @Column(name = "PERCPREV2", precision = 6, scale = 2)
    private BigDecimal percprev2;

    @Column(name = "PERCPREV3", precision = 6, scale = 2)
    private BigDecimal percprev3;

    @Column(name = "PERCPREV4", precision = 6, scale = 2)
    private BigDecimal percprev4;

    @Column(name = "PERCPREV5", precision = 6, scale = 2)
    private BigDecimal percprev5;

    @Column(name = "PERCPREV6", precision = 6, scale = 2)
    private BigDecimal percprev6;

    @Column(name = "PERCPREV7", precision = 6, scale = 2)
    private BigDecimal percprev7;

    @Column(name = "PERCPREV8", precision = 6, scale = 2)
    private BigDecimal percprev8;

    @Column(name = "PERCPREV9", precision = 6, scale = 2)
    private BigDecimal percprev9;

    @Column(name = "PERCPREV10", precision = 6, scale = 2)
    private BigDecimal percprev10;

    @Column(name = "PERCPREV11", precision = 6, scale = 2)
    private BigDecimal percprev11;

    @Column(name = "PERCPREV12", precision = 6, scale = 2)
    private BigDecimal percprev12;

    @Column(name = "TIPO_PROJ")
    private Short tipoProj;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "TCON", length = 1)
    private String tcon;

    @Column(name = "EXCLUSIVO", length = 1)
    private String exclusivo;

    @Column(name = "CONTA_ACORDO")
    private Integer contaAcordo;

    @Column(name = "INVEST", length = 1)
    private String invest;

    @Column(name = "CONTA_MAE")
    private Integer contaMae;

    @Column(name = "CONTA_MAE2")
    private Integer contaMae2;

    @Column(name = "CONTA_MAE3")
    private Integer contaMae3;

    @Column(name = "NOMEASSOC", length = 30)
    private String nomeassoc;

    @Column(name = "EXIGE_CONTRATO", length = 1)
    private String exigeContrato;

    @Column(name = "EXIGE_APROVACAO", length = 1)
    private String exigeAprovacao;

    @Column(name = "CONTA_CLIENTE", length = 1)
    private String contaCliente;



}
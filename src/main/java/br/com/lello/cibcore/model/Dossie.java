package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "DOSSIE")
public class Dossie implements Serializable {
    private static final long serialVersionUID = 8057547655694452686L;
    @Id
    @Column(name = "CODIGO", nullable = false)
    private Integer id;

    @Column(name = "RECNUM")
    private Long recnum;

    @Column(name = "CONDOMINIO")
    private Long condominio;

    @Column(name = "UNIDADE", length = 6)
    private String unidade;

    @Column(name = "DIVIDA", precision = 16, scale = 2)
    private BigDecimal divida;

    @Column(name = "AUTORIZADO")
    private LocalDate autorizado;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "INICIO")
    private LocalDate inicio;

    @Column(name = "FIM")
    private LocalDate fim;

    @Column(name = "PROCURACAO", length = 1)
    private String procuracao;

    @Column(name = "SOLPROCURA")
    private LocalDate solprocura;

    @Column(name = "RECPROCURA")
    private LocalDate recprocura;

    @Column(name = "CERTIDAO", length = 1)
    private String certidao;

    @Column(name = "SOLCERTIDAO")
    private LocalDate solcertidao;

    @Column(name = "AGUCERTIDAO")
    private LocalDate agucertidao;

    @Column(name = "RECCERTIDAO")
    private LocalDate reccertidao;

    @Column(name = "ATA", length = 1)
    private String ata;

    @Column(name = "SOLATA")
    private LocalDate solata;

    @Column(name = "AGCATA")
    private LocalDate agcata;

    @Column(name = "AGAATA")
    private LocalDate agaata;

    @Column(name = "REPATA")
    private LocalDate repata;

    @Column(name = "RECATA")
    private LocalDate recata;

    @Column(name = "CONVENCAO", length = 1)
    private String convencao;

    @Column(name = "SOLCONVENCAO")
    private LocalDate solconvencao;

    @Column(name = "AGCCONVENCAO")
    private LocalDate agcconvencao;

    @Column(name = "AGACONVENCAO")
    private LocalDate agaconvencao;

    @Column(name = "RECCONVENCAO")
    private LocalDate recconvencao;

    @Column(name = "BALANCETE", length = 1)
    private String balancete;

    @Column(name = "SOLBALANCETE")
    private LocalDate solbalancete;

    @Column(name = "RECBALANCETE")
    private LocalDate recbalancete;

    @Column(name = "INSTCV", length = 1)
    private String instcv;

    @Column(name = "SOLINSTCV")
    private LocalDate solinstcv;

    @Column(name = "RECINSTCV")
    private LocalDate recinstcv;

    @Column(name = "ENTCHAVE", length = 1)
    private String entchave;

    @Column(name = "SOLENTCHAVE")
    private LocalDate solentchave;

    @Column(name = "RECENTCHAVE")
    private LocalDate recentchave;

    @Column(name = "DTINCLUSAO")
    private LocalDate dtinclusao;

    @Column(name = "NECINSTCV")
    private LocalDate necinstcv;

    @Column(name = "NECENTCHAVE")
    private LocalDate necentchave;

    @Column(name = "NECBALANCETE")
    private LocalDate necbalancete;

    @Column(name = "NUMPROC", length = 20)
    private String numproc;

    @Column(name = "OBS", length = 80)
    private String obs;

    @Column(name = "ENCJUR", length = 1)
    private String encjur;

    @Column(name = "DOSENC")
    private LocalDate dosenc;

    @Column(name = "DOSPRO")
    private LocalDate dospro;

    @Column(name = "ACORDO")
    private Long acordo;

    @Column(name = "TIPO_ACAO", length = 1)
    private String tipoAcao;

    @Column(name = "EMAIL_COORD", length = 1)
    private String emailCoord;

    @Column(name = "ESCCOB")
    private Integer esccob;

    @Column(name = "NOME", length = 35)
    private String nome;

    @Column(name = "ENDERECO", length = 35)
    private String endereco;

    @Column(name = "CIDADE", length = 20)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "CEP")
    private Integer cep;

    @Column(name = "SUFIXO_CEP")
    private Short sufixoCep;

    @Column(name = "DTMONTAGEM")
    private LocalDate dtmontagem;

    @Column(name = "DTENCAMINH")
    private LocalDate dtencaminh;

    @Column(name = "VARA", length = 20)
    private String vara;

    @Column(name = "FORUM", length = 20)
    private String forum;

    @Column(name = "CNPJ_CPF2", length = 18)
    private String cnpjCpf2;

    @Column(name = "EMAIL", length = 50)
    private String email;


}
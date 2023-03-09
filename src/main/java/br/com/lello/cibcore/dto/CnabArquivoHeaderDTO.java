package br.com.lello.cibcore.dto;

import br.com.lello.cibcore.model.remessa.HeaderArquivo;
import lombok.Data;

@Data
public class CnabArquivoHeaderDTO {

	private Long cod;
	private String g001CodBancoComp; // Código do Banco na Compensação
	private String g002LoteServico; // Lote de Serviço
	private String g003TipoRegistro; // Tipo de Registro
	private String g004CNAB; // Uso Exclusivo da FEBRABAN/CNAB
	private String g005TipoInscEmp; // Tipo de Inscrição da Empresa
	private String g006NumInscEmp; // Número de Inscrição da Empresa
	private String g007CodConvBanc; // Código do Convênio no Banco
	private String g008AgenciaConta; // Agência Mantenedora da Conta
	private String g009DigitoVerifAg; // Dígito Verificador da Agência
	private String g010NumeroCC; // Número da Conta Corrente
	private String g011DigitoVerifCC; // Dígito Verificador da Conta
	private String g012DigitoVerifACC; // Dígito Verificador da Ag/Conta
	private String g013Nome; // Nome da Empresa
	private String g014NomeBanco; // Nome do Banco
	private String g004CNAB2; // Uso Exclusivo da FEBRABAN/CNAB
	private String g015CodRemessaRet; // Código Remessa / Retorno
	private String g016DataArquivo; // Data de Geração do Arquivo
	private String g017HoraArquivo; // Hora de Geração do Arquivo
	private String g018NumSeqArq; // Número Seqüencial do Arquivo
	private String g019VersaoArquivo; // N o da Versão do Layout do Arquivo
	private String g020DensidadeArq; // Densidade de Gravação do Arquivo
	private String g021UsoBanco; // Para Uso Reservado do Banco
	private String g022UsoLello; // Para Uso Reservado da Empresa
	private String g004CNAB3; // Uso Exclusivo da FEBRABAN/CNAB
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO

	private String tipoEndpoint;  // Tipo Endpoint

	public CnabArquivoHeaderDTO() {

	}

	public CnabArquivoHeaderDTO(HeaderArquivo pag) {
		if(null != pag) {
			cod = pag.getCod();
			g001CodBancoComp = pag.getG001CodBancoComp();
			g002LoteServico = pag.getG002LoteServico();
			g003TipoRegistro = pag.getG003TipoRegistro();
			g004CNAB = pag.getG004CNAB();
			g005TipoInscEmp = pag.getG005TipoInscEmp();
			g006NumInscEmp = pag.getG006NumInscEmp();
			g007CodConvBanc = pag.getG007CodConvBanc();
			g008AgenciaConta = pag.getG008AgenciaConta();
			g009DigitoVerifAg = pag.getG009DigitoVerifAg();
			g010NumeroCC = pag.getG010NumeroCC();
			g011DigitoVerifCC = pag.getG011DigitoVerifCC();
			g012DigitoVerifACC = pag.getG012DigitoVerifACC();
			g013Nome = pag.getG013Nome();
			g014NomeBanco = pag.getG014NomeBanco();
			g004CNAB2 = pag.getG004CNAB2();
			g015CodRemessaRet = pag.getG015CodRemessaRet();
			g016DataArquivo = pag.getG016DataArquivo();
			g017HoraArquivo = pag.getG017HoraArquivo();
			g018NumSeqArq = pag.getG018NumSeqArq();
			g019VersaoArquivo = pag.getG019VersaoArquivo();
			g020DensidadeArq = pag.getG020DensidadeArq();
			g021UsoBanco = pag.getG021UsoBanco();
			g022UsoLello = pag.getG022UsoLello();
			g004CNAB3 = pag.getG004CNAB3();
			tipoArquivoRmRt = pag.getTipoArquivoRmRt();
			nomeArquivo = pag.getNomeArquivo();
			tipoEndpoint = pag.getTipoEndpoint();

		}
	}

	public HeaderArquivo gerarEntidade() {
		HeaderArquivo pag = new HeaderArquivo();

			pag.setCod(cod);
			pag.setG001CodBancoComp(g001CodBancoComp);
			pag.setG002LoteServico(g002LoteServico);
			pag.setG003TipoRegistro(g003TipoRegistro);
			pag.setG004CNAB(g004CNAB);
			pag.setG005TipoInscEmp(g005TipoInscEmp);
			pag.setG006NumInscEmp(g006NumInscEmp);
			pag.setG007CodConvBanc(g007CodConvBanc);
			pag.setG008AgenciaConta(g008AgenciaConta);
			pag.setG009DigitoVerifAg(g009DigitoVerifAg);
			pag.setG010NumeroCC(g010NumeroCC);
			pag.setG011DigitoVerifCC(g011DigitoVerifCC);
			pag.setG012DigitoVerifACC(g012DigitoVerifACC);
			pag.setG013Nome(g013Nome);
			pag.setG014NomeBanco(g014NomeBanco);
			pag.setG004CNAB2(g004CNAB2);
			pag.setG015CodRemessaRet(g015CodRemessaRet);
			pag.setG016DataArquivo(g016DataArquivo);
			pag.setG017HoraArquivo(g017HoraArquivo);
			pag.setG018NumSeqArq(g018NumSeqArq);
			pag.setG019VersaoArquivo(g019VersaoArquivo);
			pag.setG020DensidadeArq(g020DensidadeArq);
			pag.setG021UsoBanco(g021UsoBanco);
			pag.setG022UsoLello(g022UsoLello);
			pag.setG004CNAB3(g004CNAB3);
			pag.setTipoArquivoRmRt(tipoArquivoRmRt);
			pag.setNomeArquivo(nomeArquivo);
			pag.setTipoEndpoint(tipoEndpoint);


		return pag;
		}

	public String geraLinha() {
        String builder = g001CodBancoComp +
                g002LoteServico +
                g003TipoRegistro +
                g004CNAB +
                g005TipoInscEmp +
                g006NumInscEmp +
                g007CodConvBanc +
                g008AgenciaConta +
                g009DigitoVerifAg +
                g010NumeroCC +
                g011DigitoVerifCC +
                g012DigitoVerifACC +
                g013Nome +
                g014NomeBanco +
                g004CNAB2 +
                g015CodRemessaRet +
                g016DataArquivo +
                g017HoraArquivo +
                g018NumSeqArq +
                g019VersaoArquivo +
                g020DensidadeArq +
                g021UsoBanco +
                g022UsoLello +
                g004CNAB3;
		return builder;
	}

}

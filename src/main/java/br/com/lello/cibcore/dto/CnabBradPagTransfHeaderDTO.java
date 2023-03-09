package br.com.lello.cibcore.dto;

import br.com.lello.cibcore.model.remessa.PagH;
import lombok.Data;

import java.util.List;

@Data
public class CnabBradPagTransfHeaderDTO {

	private Long cod;
	private String g001CodBancoComp; // Código do Banco na Compensação
	private String g002LoteServico; // Lote de Serviço
	private String g003TipoRegistro; // Tipo de Registro
	private String g028TipoOperacao; // Tipo da Operação
	private String g025TipoServico; // Tipo do Serviço
	private String g029FormaLancamento; // Forma de Lançamento
	private String g030VersaoLayoutLote; // Nº da Versão do Layout do Lote
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
	private String g031Mensagem; // Mensagem
	private String g032Endereco; // Logradouro- Nome da Rua, Av, Pça, Etc
	private String g032Numero; // Número
	private String g032Complemento; // Complemento
	private String g033Cidade; // Cidade
	private String g034CEP; // CEP
	private String g035SufixoCEP; // Complemento CEP
	private String g036UF; // Estado
	private String p014IndFormaPag; // Indicativo de Forma de Pagamento
	private String g004CNAB2; // Uso Exclusivo FEBRABAN/CNAB
	private String xCodigoOcorrencias; // Códigos das Ocorrências p/ Retorno
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO
	private Long codHeaderArq;

	private List<CnabBradPagTransfDetalheADTO> listaDetA;
	private List<CnabBradPagTransfDetalheBDTO> listaDetB;

	public CnabBradPagTransfHeaderDTO() {

	}

	public CnabBradPagTransfHeaderDTO(PagH pag) {
		if(null != pag) {
			cod = pag.getCod();
			g001CodBancoComp = pag.getG001CodBancoComp();
			g002LoteServico = pag.getG002LoteServico();
			g003TipoRegistro = pag.getG003TipoRegistro();
			g028TipoOperacao = pag.getG028TipoOperacao();
			g025TipoServico = pag.getG025TipoServico();
			g029FormaLancamento = pag.getG029FormaLancamento();
			g030VersaoLayoutLote = pag.getG030VersaoLayoutLote();
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
			g031Mensagem = pag.getG031Mensagem();
			g032Endereco = pag.getG032Endereco();
			g032Numero = pag.getG032Numero();
			g032Complemento = pag.getG032Complemento();
			g033Cidade = pag.getG033Cidade();
			g034CEP = pag.getG034CEP();
			g035SufixoCEP = pag.getG035SufixoCEP();
			g036UF = pag.getG036UF();
			p014IndFormaPag = pag.getP014IndFormaPag();
			g004CNAB2 = pag.getG004CNAB2();
			xCodigoOcorrencias = pag.getXCodigoOcorrencias();
			tipoArquivoRmRt = pag.getTipoArquivoRmRt();
			nomeArquivo = pag.getNomeArquivo();
			codHeaderArq = pag.getCodHeaderArq();
		}
	}

	public PagH gerarEntidade( ) {

		PagH pag = new PagH();

			pag.setCod(cod);
			pag.setG001CodBancoComp(g001CodBancoComp);
			pag.setG002LoteServico(g002LoteServico);
			pag.setG003TipoRegistro(g003TipoRegistro);
			pag.setG028TipoOperacao(g028TipoOperacao);
			pag.setG025TipoServico(g025TipoServico);
			pag.setG029FormaLancamento(g029FormaLancamento);
			pag.setG030VersaoLayoutLote(g030VersaoLayoutLote);
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
			pag.setG031Mensagem(g031Mensagem);
			pag.setG032Endereco(g032Endereco);
			pag.setG032Numero(g032Numero);
			pag.setG032Complemento(g032Complemento);
			pag.setG033Cidade(g033Cidade);
			pag.setG034CEP(g034CEP);
			pag.setG035SufixoCEP(g035SufixoCEP);
			pag.setG036UF(g036UF);
			pag.setP014IndFormaPag(p014IndFormaPag);
			pag.setG004CNAB2(g004CNAB2);
			pag.setXCodigoOcorrencias(xCodigoOcorrencias);
			pag.setTipoArquivoRmRt(tipoArquivoRmRt);
			pag.setNomeArquivo(nomeArquivo);
			pag.setCodHeaderArq(codHeaderArq);

			return pag;

	}

	public String geraLinha() {
        String builder = g001CodBancoComp +
                g002LoteServico +
                g003TipoRegistro +
                g028TipoOperacao +
                g025TipoServico +
                g029FormaLancamento +
                g030VersaoLayoutLote +
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
                g031Mensagem +
                g032Endereco +
                g032Numero +
                g032Complemento +
                g033Cidade +
                g034CEP +
                g035SufixoCEP +
                g036UF +
                p014IndFormaPag +
                g004CNAB2 +
                xCodigoOcorrencias;
		return builder;
	}

}

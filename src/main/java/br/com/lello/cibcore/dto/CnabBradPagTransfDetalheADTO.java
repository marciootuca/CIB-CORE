package br.com.lello.cibcore.dto;

import br.com.lello.cibcore.model.remessa.PagamentoDetalheA;
import lombok.Data;

@Data
public class CnabBradPagTransfDetalheADTO {

	private Long cod;
	private String g001CodBancoComp; // Código do Banco na Compensação
	private String g002LoteServico; // Lote de Serviço
	private String g003TipoRegistro; // Tipo de Registro
	private String g038NumSeqLote; // Seqüencial do Registro no Lote
	private String g039CodSeqDetalhe; // Código de Segmento do Reg. Detalhe
	private String g060TipoMovimento; // Tipo de Movimento
	private String g061CodInstrMov; // Código da Instrução p/ Movimento
	private String p001CodCamCentr; // Código da Câmara Centralizadora
	private String p002CodBancoFav; // Código do Banco do Favorecido
	private String g008AgenciaConta; // Ag. Mantenedora da Cta do Favo
	private String g009DigitoVerifAg; // Dígito Verificador da Agência
	private String g010NumeroCC; // Número da Conta Corrente
	private String g011DigitoVerifCC; // Dígito Verificador da Conta
	private String g012DigitoVerifACC; // Dígito Verificador da AG/Conta
	private String g013Nome; // Nome do Favorecido
	private String g064NumDocumento; // Nº do Docum. Atribuído p/ Empresa
	private String p009DtPagamento; // Data do Pagamento
	private String g040TipoMoeda; // Tipo da Moeda
	private String g041QtdMoeda; // Quantidade da Moeda
	private String p010VlPagamento; // Valor do Pagamento
	private String g043NumDocumento; // Nº do Docum. Atribuído pelo Banco
	private String p003DtRealLanc; // Data Real da Efetivação Pagto
	private String p004VlRealPag; // Valor Real da Efetivação do Pagto
	private String g031Mensagem; // Informação 2
	private String p005ComplTpServ; // Código Finalidade Doc
	private String p011CodFinTED; // Codigo finalidade da TED
	private String p013CodFinCompl; // Compl. Finalidade de Pagamento
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNA
	private String p006AvisoFavorec; // 230-230 Aviso ao Favorecido
	private String g059CodOcorrRetRem; // Códigos das Ocorrências p/ Retorno
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO
	private Long codHeaderLote;

	public CnabBradPagTransfDetalheADTO() {

	}

	public CnabBradPagTransfDetalheADTO(PagamentoDetalheA pag) {
		if (null != pag) {
			cod = pag.getCod();
			g001CodBancoComp = pag.getG001CodBancoComp();
			g002LoteServico = pag.getG002LoteServico();
			g003TipoRegistro = pag.getG003TipoRegistro();
			g038NumSeqLote = pag.getG038NumSeqLote();
			g039CodSeqDetalhe = pag.getG039CodSeqDetalhe();
			g060TipoMovimento = pag.getG060TipoMovimento();
			g061CodInstrMov = pag.getG061CodInstrMov();
			p001CodCamCentr = pag.getP001CodCamCentr();
			p002CodBancoFav = pag.getP002CodBancoFav();
			g008AgenciaConta = pag.getG008AgenciaConta();
			g009DigitoVerifAg = pag.getG009DigitoVerifAg();
			g010NumeroCC = pag.getG010NumeroCC();
			g011DigitoVerifCC = pag.getG011DigitoVerifCC();
			g012DigitoVerifACC = pag.getG012DigitoVerifACC();
			g013Nome = pag.getG013Nome();
			g064NumDocumento = pag.getG064NumDocumento();
			p009DtPagamento = pag.getP009DtPagamento();
			g040TipoMoeda = pag.getG040TipoMoeda();
			g041QtdMoeda = pag.getG041QtdMoeda();
			p010VlPagamento = pag.getP010VlPagamento();
			g043NumDocumento = pag.getG043NumDocumento();
			p003DtRealLanc = pag.getP003DtRealLanc();
			p004VlRealPag = pag.getP004VlRealPag();
			g031Mensagem = pag.getG031Mensagem();
			p005ComplTpServ = pag.getP005ComplTpServ();
			p011CodFinTED = pag.getP011CodFinTED();
			p013CodFinCompl = pag.getP013CodFinCompl();
			g004CNAB = pag.getG004CNAB();
			p006AvisoFavorec = pag.getP006AvisoFavorec();
			g059CodOcorrRetRem = pag.getG059CodOcorrRetRem();
			tipoArquivoRmRt = pag.getTipoArquivoRmRt();
			nomeArquivo = pag.getNomeArquivo();
			codHeaderLote = pag.getCodHeaderLote();
		}
	}

	public PagamentoDetalheA gerarEntidade () {
		PagamentoDetalheA pag = new PagamentoDetalheA();

			pag.setCod(cod);
			pag.setG001CodBancoComp(g001CodBancoComp);
			pag.setG002LoteServico(g002LoteServico);
			pag.setG003TipoRegistro(g003TipoRegistro);
			pag.setG038NumSeqLote(g038NumSeqLote);
			pag.setG039CodSeqDetalhe(g039CodSeqDetalhe);
			pag.setG060TipoMovimento(g060TipoMovimento);
			pag.setG061CodInstrMov(g061CodInstrMov);
			pag.setP001CodCamCentr(p001CodCamCentr);
			pag.setP002CodBancoFav(p002CodBancoFav);
			pag.setG008AgenciaConta(g008AgenciaConta);
			pag.setG009DigitoVerifAg(g009DigitoVerifAg);
			pag.setG010NumeroCC(g010NumeroCC);
			pag.setG011DigitoVerifCC(g011DigitoVerifCC);
			pag.setG012DigitoVerifACC(g012DigitoVerifACC);
			pag.setG013Nome(g013Nome);
			pag.setG064NumDocumento(g064NumDocumento);
			pag.setP009DtPagamento(p009DtPagamento);
			pag.setG040TipoMoeda(g040TipoMoeda);
			pag.setG041QtdMoeda(g041QtdMoeda);
			pag.setP010VlPagamento(p010VlPagamento);
			pag.setG043NumDocumento(g043NumDocumento);
			pag.setP003DtRealLanc(p003DtRealLanc);
			pag.setP004VlRealPag(p004VlRealPag);
			pag.setG031Mensagem(g031Mensagem);
			pag.setP005ComplTpServ(p005ComplTpServ);
			pag.setP011CodFinTED(p011CodFinTED);
			pag.setP013CodFinCompl(p013CodFinCompl);
			pag.setG004CNAB(g004CNAB);
			pag.setP006AvisoFavorec(p006AvisoFavorec);
			pag.setG059CodOcorrRetRem(g059CodOcorrRetRem);
			pag.setTipoArquivoRmRt(tipoArquivoRmRt);
			pag.setNomeArquivo(nomeArquivo);
			pag.setCodHeaderLote(codHeaderLote);

			return pag;
	}

	public String geraLinha() {
        String builder = g001CodBancoComp +
                g002LoteServico +
                g003TipoRegistro +
                g038NumSeqLote +
                g039CodSeqDetalhe +
                g060TipoMovimento +
                g061CodInstrMov +
                p001CodCamCentr +
                p002CodBancoFav +
                g008AgenciaConta +
                g009DigitoVerifAg +
                g010NumeroCC +
                g011DigitoVerifCC +
                g012DigitoVerifACC +
                g013Nome +
                g064NumDocumento +
                p009DtPagamento +
                g040TipoMoeda +
                g041QtdMoeda +
                p010VlPagamento +
                g043NumDocumento +
                p003DtRealLanc +
                p004VlRealPag +
                g031Mensagem +
                p005ComplTpServ +
                p011CodFinTED +
                p013CodFinCompl +
                g004CNAB +
                p006AvisoFavorec +
                g059CodOcorrRetRem;

		return builder;
	}

}

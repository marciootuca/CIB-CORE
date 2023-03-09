package br.com.lello.cibcore.dto;

import br.com.lello.cibcore.model.remessa.PagamentoDetalheB;
import lombok.Data;

@Data
public class CnabBradPagTransfDetalheBDTO {

	private Long cod;
	private String g001CodBancoComp; // Código do Banco na Compensação
	private String g002LoteServico; // Lote de Serviço
	private String g003TipoRegistro; // Tipo de Registro
	private String g038NumSeqLote; // Nº Seqüencial do Registro no Lote
	private String g039CodSeqDetalhe; // Código de Segmento do Reg. Detalhe
	private String g004CNAB; // Uso Exclusivo FEBRABAN/CNAB
	private String g005TipoInscEmp; // Tipo de Inscrição do Favorecido
	private String g006NumInscEmp; // Nº de Inscrição do Favorecido
	private String g032Endereco; // Logradouro - Nome da Rua, Av, Pça, Etc
	private String g032Numero; // Número
	private String g032Complemento; // Complemento
	private String g032Bairro; // Bairro
	private String g033Cidade; // Cidade
	private String g034CEP; // CEP
	private String g035SufixoCEP; // Complemento do CEP
	private String g036UF; // Estado
	private String g044DataVencimento; // Data do Vencimento (Nominal)
	private String g042ValorDocumento; // Valor do Documento (Nominal)
	private String g045ValorAbatimento; // Valor do Abatimento
	private String g046ValorDesconto; // Valor do Desconto
	private String g047ValorMora; // Valor da Mora
	private String g048ValorMulta; // Valor da Multa
	private String p008DOCFavoRec; // Código/Documento do Favorecido
	private String p006AvisoFavoRec; // Aviso ao Favorecido
	private String p012CodUG; // Uso Exclusivo para o SIAPE
	private String p015CodISPBFin; // Código ISPB
	private String tipoArquivoRmRt; // RM - REMESSA/ RT - RETORNO
	private String nomeArquivo; // NOME ARQUIVO APENAS RETORNO
	private Long codDetalhe;

	public CnabBradPagTransfDetalheBDTO() {

	}

	public CnabBradPagTransfDetalheBDTO(PagamentoDetalheB pag) {
		if(null != pag) {
			cod = pag.getCod();
			g001CodBancoComp = pag.getG001CodBancoComp();
			g002LoteServico = pag.getG002LoteServico();
			g003TipoRegistro = pag.getG003TipoRegistro();
			g038NumSeqLote = pag.getG038NumSeqLote();
			g039CodSeqDetalhe = pag.getG039CodSeqDetalhe();
			g004CNAB = pag.getG004CNAB();
			g005TipoInscEmp = pag.getG005TipoInscEmp();
			g006NumInscEmp = pag.getG006NumInscEmp();
			g032Endereco = pag.getG032Endereco();
			g032Numero = pag.getG032Numero();
			g032Complemento = pag.getG032Complemento();
			g032Bairro = pag.getG032Bairro();
			g033Cidade = pag.getG033Cidade();
			g034CEP = pag.getG034CEP();
			g035SufixoCEP = pag.getG035SufixoCEP();
			g036UF = pag.getG036UF();
			g044DataVencimento = pag.getG044DataVencimento();
			g042ValorDocumento = pag.getG042ValorDocumento();
			g045ValorAbatimento = pag.getG045ValorAbatimento();
			g046ValorDesconto = pag.getG046ValorDesconto();
			g047ValorMora = pag.getG047ValorMora();
			g048ValorMulta = pag.getG048ValorMulta();
			p008DOCFavoRec = pag.getP008DOCFavoRec();
			p006AvisoFavoRec = pag.getP006AvisoFavoRec();
			p012CodUG = pag.getP012CodUG();
			p015CodISPBFin = pag.getP015CodISPBFin();
			tipoArquivoRmRt = pag.getTipoArquivoRmRt();
			nomeArquivo = pag.getNomeArquivo();
			codDetalhe = pag.getCodDetalhe();
		}
	}

	public PagamentoDetalheB gerarEntidade() {

		PagamentoDetalheB pag = new PagamentoDetalheB();

			pag.setCod(cod);
			pag.setG001CodBancoComp(g001CodBancoComp);
			pag.setG002LoteServico(g002LoteServico);
			pag.setG003TipoRegistro(g003TipoRegistro);
			pag.setG038NumSeqLote(g038NumSeqLote);
			pag.setG039CodSeqDetalhe(g039CodSeqDetalhe);
			pag.setG004CNAB(g004CNAB);
			pag.setG005TipoInscEmp(g005TipoInscEmp);
			pag.setG006NumInscEmp(g006NumInscEmp);
			pag.setG032Endereco(g032Endereco);
			pag.setG032Numero(g032Numero);
			pag.setG032Complemento(g032Complemento);
			pag.setG032Bairro(g032Bairro);
			pag.setG033Cidade(g033Cidade);
			pag.setG034CEP(g034CEP);
			pag.setG035SufixoCEP(g035SufixoCEP);
			pag.setG036UF(g036UF);
			pag.setG044DataVencimento(g044DataVencimento);
			pag.setG042ValorDocumento(g042ValorDocumento);
			pag.setG045ValorAbatimento(g045ValorAbatimento);
			pag.setG046ValorDesconto(g046ValorDesconto);
			pag.setG047ValorMora(g047ValorMora);
			pag.setG048ValorMulta(g048ValorMulta);
			pag.setP008DOCFavoRec(p008DOCFavoRec);
			pag.setP006AvisoFavoRec(p006AvisoFavoRec);
			pag.setP012CodUG(p012CodUG);
			pag.setP015CodISPBFin(p015CodISPBFin);
			pag.setTipoArquivoRmRt(tipoArquivoRmRt);
			pag.setNomeArquivo(nomeArquivo);
			pag.setCodDetalhe(codDetalhe);

			return pag;

	}

	public String geraLinha() {
        String builder = g001CodBancoComp +
                g002LoteServico +
                g003TipoRegistro +
                g038NumSeqLote +
                g039CodSeqDetalhe +
                g004CNAB +
                g005TipoInscEmp +
                g006NumInscEmp +
                g032Endereco +
                g032Numero +
                g032Complemento +
                g032Bairro +
                g033Cidade +
                g034CEP +
                g035SufixoCEP +
                g036UF +
                g044DataVencimento +
                g042ValorDocumento +
                g045ValorAbatimento +
                g046ValorDesconto +
                g047ValorMora +
                g048ValorMulta +
                p008DOCFavoRec +
                p006AvisoFavoRec +
                p012CodUG +
                p015CodISPBFin;
		return builder;
	}

}

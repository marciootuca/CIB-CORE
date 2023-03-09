package br.com.lello.cibcore.dto;

import lombok.Data;

import java.util.List;

@Data
public class TransferenciaBradescoDTO {

    private CnabArquivoHeaderDTO cnabArquivoHeaderDTO;
    private CnabBradPagTransfHeaderDTO cnabBradPagTransfHeaderDTO;
    private List<CnabBradPagTransfDetalheADTO> cnabBradPagTransfDetalheADTO;

    private List<CnabBradPagTransfDetalheBDTO> cnabBradPagTransfDetalheBDTO;

}

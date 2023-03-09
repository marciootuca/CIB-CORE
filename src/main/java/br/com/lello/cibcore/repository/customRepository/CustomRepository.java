package br.com.lello.cibcore.repository.customRepository;

import br.com.lello.cibcore.model.Cndhisto;

import java.util.List;

public interface CustomRepository {

    List<Cndhisto> obterListPelaContaNCodReduzido(String campo, String valor);
}

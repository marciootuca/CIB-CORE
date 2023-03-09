package br.com.lello.cibcore.repository.customRepository;

import br.com.lello.cibcore.model.Cndhisto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomRepositoryImpl implements CustomRepository{

    @Autowired
    protected EntityManager manager;

    public CustomRepositoryImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Cndhisto> obterListPelaContaNCodReduzido(String campo, String valor){
        String query = "SELECT * FROM condo.CNDHISTO h WHERE h." + campo + " = " + valor + " and h." + campo + " > 0 ";
        return  manager.createNativeQuery(query, Cndhisto.class).getResultList();
    }
}

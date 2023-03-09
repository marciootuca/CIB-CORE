package br.com.lello.cibcore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author marcio.froes
 *
 */

@Embeddable
public class CnaePK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    @Column(name = "IDFORNEC")
    private Long idFornec;

    @Getter
    @Setter
    @Column(name = "PG_COD_CNAE")
    private String codCnae;

    public CnaePK() {
    }

    public CnaePK(Long idFornec, String codCnae) {
        super();
        this.idFornec = idFornec;
        this.codCnae = codCnae;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codCnae == null) ? 0 : codCnae.hashCode());
        result = prime * result + ((idFornec == null) ? 0 : idFornec.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CnaePK other = (CnaePK) obj;
        if (codCnae == null) {
            if (other.codCnae != null) {
                return false;
            }
        } else if (!codCnae.equals(other.codCnae)) {
            return false;
        }
        if (idFornec == null) {
            return other.idFornec == null;
        } else return idFornec.equals(other.idFornec);
    }

}

package br.com.lello.cibcore.dto;

import java.util.Objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContaCondominioDTO {
	private static final Long COD_BRADESCO = 237L;
	private static final Long COD_ITAU = 341L;
	
    private Long codBanco;
    private Long condominio;
    
    public Long getConta() {
    	if (COD_BRADESCO.equals(codBanco)) {
			return 12L;
		}
    	
    	if (COD_ITAU.equals(codBanco)) {
			return 14L;
		}
    	
    	return null;
    }
    
    public Long getCondominio() {
    	if (Objects.isNull(condominio)) {
    		return null;
    	}
    	
    	return Long.valueOf(condominio.toString().concat("00").substring(0, 3));
    }
}
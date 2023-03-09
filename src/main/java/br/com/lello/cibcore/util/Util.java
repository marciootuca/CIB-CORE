package br.com.lello.cibcore.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Date;

public class Util {


    public static boolean isDataNullOrBlank(Date data) {
        boolean result = data == null;

        return result;
    }

    public static String preencherZeroEsquerda(String valor, int qtdDigitos) {
        if (isStringNullOrBlank(valor)) {
            return "";
        }
        while (qtdDigitos > valor.length()) {
            valor = "0" + valor;
        }
        return valor;
    }

    public static String preencherComCaracter(String valor, int qtdDigitos, String caracter, boolean preencherEsquerda) {
        if (isStringNullOrBlank(valor)) {
            return "";
        }
        while (qtdDigitos > valor.length()) {
            if (preencherEsquerda) {
                valor = caracter + valor;
            } else {
                valor = valor + caracter;
            }
        }
        return valor;
    }
    public static boolean isStringNullOrBlank(String string) {
        return StringUtils.isBlank(string);
    }
    public static boolean isMaiorQueZero(BigDecimal valor) {

        if (valor == null) {
            return Boolean.FALSE;
        }
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }

    public static boolean isMenorQueZero(BigDecimal valor) {

        if (valor == null) {
            return Boolean.TRUE;
        }
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }


}

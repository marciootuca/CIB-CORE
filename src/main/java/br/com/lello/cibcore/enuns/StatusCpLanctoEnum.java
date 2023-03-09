package br.com.lello.cibcore.enuns;

import lombok.Getter;

public enum StatusCpLanctoEnum {

    BAIXADO("B", "BAIXADO"), //
    CANCELADO("C", "CANCELADO"), //
    LIBERADO("L", "LIBERADO"), //
    EMITIDO("E", "EMITIDO"), //
    INTEGRADO("I", "INTEGRADO"), //
    SUSPENSO("S", "SUSPENSO"), //
    CONTABILIZADO("T", "CONTABILIZADO"), //
    ISENCAO("X", "ISENÇÃO"), //
    ASTERISCO("*", "ISENÇÃO CONTABILIZADA"), //
    CHEQUE_MANUAL("M", "CHEQUE MANUAL");//

    StatusCpLanctoEnum(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Getter
    private final String codigo;

    @Getter
    private final String descricao;

    public static StatusCpLanctoEnum getByCodigo(String codigo) {

        StatusCpLanctoEnum[] values = StatusCpLanctoEnum.values();

        for (StatusCpLanctoEnum statusCpLanctoEnum : values) {
            if (statusCpLanctoEnum.getCodigo().equals(codigo)) {
                return statusCpLanctoEnum;
            }
        }
        return null;
    }
}

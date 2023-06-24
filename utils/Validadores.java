/**
 * 
 */
package br.pr.senaccadastros.utils;

import java.util.Collection;
import java.util.Calendar;
import java.util.Date;

public class Validadores {

    public static Boolean isEmptyString(String value) {
        if (value == null || "".equals(value.trim())) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public static Boolean isNullObject(Object value) {
        if (value == null) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public static boolean isZeroOrNull(Number value) {
        if (value == null || value.intValue() == 0) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public static Boolean isEmptyCollection(Collection<?> value) {
        if (value == null || value.isEmpty()) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public static Boolean dataInicialMenorDataFinal(Date dataInicial, Date dataFinal) {
        Boolean retorno = Boolean.TRUE;

        Calendar dtInicial = Calendar.getInstance();
        dtInicial.setTime(dataInicial);
        toOnlyDate(dtInicial);

        Calendar dtFinal = Calendar.getInstance();
        dtFinal.setTime(dataFinal);
        toOnlyDate(dtFinal);

        if (dtInicial.after(dtFinal)) {
            retorno = Boolean.FALSE;
        }

        return retorno;
    }

    public static void toOnlyDate(Calendar date) {
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
    }
}

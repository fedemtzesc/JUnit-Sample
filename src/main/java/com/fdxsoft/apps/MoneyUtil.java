package com.fdxsoft.apps;

import java.math.BigDecimal;

public class MoneyUtil {

    public static String format(double amount){
        return format(amount, "$");
    }

    public static String format(double amount, String symbol){
        if(symbol==null){
            throw new IllegalArgumentException();
        }
        if(amount<0){
            symbol="-" + symbol;
            amount = Math.abs(amount);
        }
        BigDecimal rounded = BigDecimal.valueOf(amount).setScale(2, BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }
}

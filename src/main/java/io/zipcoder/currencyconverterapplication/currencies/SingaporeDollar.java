package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/this.getType().getRate();
    }

    @Override
    public CurrencyType getType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}

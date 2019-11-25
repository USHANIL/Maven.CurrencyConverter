package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return (Double)currencyType.getRate()/this.getType().getRate();
    }

    @Override
    public CurrencyType getType() {
        return CurrencyType.CHINESE_YR;
    }
}

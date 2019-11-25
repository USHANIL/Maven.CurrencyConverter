package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType){

        return (Double)currencyType.getRate()/this.getType().getRate();
    }



    public CurrencyType getType()
    {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}

package com.intershop.adapters;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal> {
    private static final DecimalFormat FORMAT = new DecimalFormat("0.#####");

    @Override
    public BigDecimal unmarshal(String v) throws Exception {
        return new BigDecimal(v);
    }

    @Override
    public String marshal(BigDecimal v) throws Exception {
        if (v != null) {
            return FORMAT.format(v.setScale(5, RoundingMode.HALF_UP));
        } else {
            return null;
        }
    }
}

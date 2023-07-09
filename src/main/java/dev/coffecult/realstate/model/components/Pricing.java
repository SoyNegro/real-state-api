package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.PricingType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pricing {
    // Price in the lowest denomination in given currency
    private int price;
    // Prices may vary since some place have seasonal prices.
    private List<Integer> monthlyPrices =  new ArrayList<>(12);
    private PricingType pricingType;
    // Currency code of the currency used in ISO 4217 format.
    private String currencyCode;
}

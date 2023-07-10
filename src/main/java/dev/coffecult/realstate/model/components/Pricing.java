package dev.coffecult.realstate.model.components;


import dev.coffecult.realstate.model.enums.PricingType;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Pricing {
    // Price in the lowest denomination in given currency
    @NotNull
    private int price;
    // Prices may vary since some place have seasonal prices.
    private List<Integer> monthlyPrices =  new ArrayList<>(12);
    @NotNull
    private PricingType pricingType;
    // Currency code of the currency used in ISO 4217 format.
    @NotNull
    private String currencyCode;
}

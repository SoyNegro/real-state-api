package dev.coffecult.realstate.model.components;


import dev.coffecult.realstate.model.enums.PricingType;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record Pricing(
        @NotNull
        int price,
        List<Integer> monthlyPrices,
        @NotNull
        PricingType pricingType,
        @NotNull
        String currencyCode
) {
        /**
         * When price is of type 'flat' there is not need for the monthly prices
         * */
    Pricing(@NotNull
            int price, @NotNull
            String currencyCode) {
        this(price, null, PricingType.Flat, currencyCode);
    }

}


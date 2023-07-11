package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.CostType;
import dev.coffecult.realstate.model.enums.PayableAt;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record Cost(
        @NotNull
        CostType type,
        @NotNull
        @Min(value = 0, message = "Price cannot be lower than 0")
        int price,
        @NotNull
        PayableAt payableAt,
        @NotNull
        boolean includedInRent,
        @NotNull
        boolean refundable,
        @NotNull
        boolean required
) {
}

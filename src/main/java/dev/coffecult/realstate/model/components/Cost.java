package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.CostType;
import dev.coffecult.realstate.model.enums.PayableAt;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cost{
    @NotNull
    private CostType type;
    @NotNull
    @Min(value = 0,message = "Price cannot be lower than 0")
    private int price;
    @NotNull
    private PayableAt payableAt;
    @NotNull
    private boolean includedInRent;
    @NotNull
    private boolean refundable;
    @NotNull
    private boolean required;
}

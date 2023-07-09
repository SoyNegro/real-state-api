package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.CostType;
import dev.coffecult.realstate.model.enums.PayableAt;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cost{
    private CostType type;
    private int price;
    private PayableAt payableAt;
    private boolean includedInRent;
    private boolean refundable;
    private boolean required;
}

package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreferredTenant {
    private short minAge;
    private short maxAge;
    private Gender gender;

    // ie: Students, working professionals
    private String tenantType;

    private boolean suitableForCouples;
}

package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.Gender;
import dev.coffecult.realstate.model.enums.TenantStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record PreferredTenant(
        @NotNull
        @Min(0)
        short minAge,
        @Min(0)
        short maxAge,
        @NotNull
        Gender gender,
        @NotNull
        TenantStatus tenantStatus,
        @NotNull
        boolean suitableForCouples
) {
}

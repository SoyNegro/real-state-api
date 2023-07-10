package dev.coffecult.realstate.model.components;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.coffecult.realstate.model.enums.Gender;
import dev.coffecult.realstate.model.enums.TenantStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreferredTenant {
    @NotNull
    @Min(0)
    private short minAge;
    @Min(0)
    private short maxAge;
    @NotNull
    private Gender gender;

    @NotNull
    private TenantStatus tenantStatus;

    @NotNull
    private boolean suitableForCouples;
}

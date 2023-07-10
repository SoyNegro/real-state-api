package dev.coffecult.realstate.model.components;

import jakarta.validation.constraints.NotEmpty;

public record Address(
        @NotEmpty
        String number,
        @NotEmpty
        String street,
        @NotEmpty
        String neighborhood,
        @NotEmpty
        String city,
        @NotEmpty
        String state,
        @NotEmpty
        String countryCode,
        @NotEmpty
        String postalCode
) {
}

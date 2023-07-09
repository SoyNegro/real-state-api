package dev.coffecult.realstate.model.components;

public record Address(
        String number,
        String street,
        String neighborhood,
        String city,
        String state,
        String countryCode,
        String postalCode
        ) {
}

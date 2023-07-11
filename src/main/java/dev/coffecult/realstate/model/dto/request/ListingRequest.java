package dev.coffecult.realstate.model.dto.request;

import dev.coffecult.realstate.model.Listing;
import dev.coffecult.realstate.model.ListingBuilder;
import dev.coffecult.realstate.model.components.*;
import dev.coffecult.realstate.model.enums.PropertyStatus;
import dev.coffecult.realstate.model.enums.PropertyType;
import dev.coffecult.realstate.model.enums.RentKind;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;


public record ListingRequest(
        @NotNull
        Long userId,
        @NotEmpty
        String description,
        int minimumStayMonths,
        int maximumStayMonths,
        int currentOccupancy,
        String alias,
        List<String> galleryImagesUrl,
        @NotNull
        Address address,
        @NotNull
        Pricing pricing,
        List<Cost> costs,
        Facility facilities,
        Amenity amenities,
        PreferredTenant preferredTenant,
        Rule rules,
        @NotNull
        PropertyType propertyType,
        @NotNull
        PropertyStatus propertyStatus,
        @NotNull
        RentKind kindOfRent,
        @NotNull
        List<UnavailableDate> unavailableDates
) {

    ListingRequest(
            @NotNull
            Long userId,
            @NotEmpty
            String description,
            @NotNull
            Pricing pricing,
            @NotNull
            Address address,
            @NotNull
            PropertyType propertyType,
            @NotNull
            PropertyStatus propertyStatus,
            @NotNull
            RentKind kindOfRent) {
        this(userId, description, 1, 32000, 0, "", null, address, pricing, null, null, null, null, null, propertyType, propertyStatus, kindOfRent, new ArrayList<>());
    }

    public Listing toListing() {
        return new ListingBuilder()
                .setUserId(userId)
                .setDescription(description)
                .setMinimumStayMonths(minimumStayMonths)
                .setMaximumStayMonths(maximumStayMonths)
                .setCurrentOccupancy(currentOccupancy)
                .setAlias(alias)
                .setGalleryImagesUrl(galleryImagesUrl)
                .setAddress(address)
                .setPricing(pricing)
                .setCosts(costs)
                .setFacilities(facilities)
                .setAmenities(amenities)
                .setPreferredTenant(preferredTenant)
                .setRules(rules)
                .setPropertyType(propertyType)
                .setPropertyStatus(propertyStatus)
                .setKindOfRent(kindOfRent)
                .setUnavailableDates(unavailableDates)
                .build();
    }
}

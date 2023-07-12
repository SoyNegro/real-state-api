package dev.coffecult.realstate.model;

import dev.coffecult.realstate.model.components.*;
import dev.coffecult.realstate.model.enums.ListingState;
import dev.coffecult.realstate.model.enums.PropertyStatus;
import dev.coffecult.realstate.model.enums.PropertyType;
import dev.coffecult.realstate.model.enums.RentKind;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
public class Listing {
    @Id
    private String id;
    @NotNull
    private Long userId;
    @NotBlank
    private String description;

    private ListingState state;

    private int minimumStayMonths;

    private int maximumStayMonths;

    private int currentOccupancy;

    private String alias;

    private List<String> galleryImagesUrl;
    @NotNull
    private Address address;
    @NotNull
    private Pricing pricing;

    private List<Cost> costs;

    private Facility facilities;

    private Amenity amenities;
    @NotNull
    private PreferredTenant preferredTenant;
    @NotNull
    private Rule rules;

    @NotNull
    private PropertyType propertyType;

    @NotNull
    private PropertyStatus propertyStatus;
    @NotNull
    private RentKind kindOfRent;

    private List<UnavailableDate> unavailableDates;

    public Listing(Long userId, String description, int minimumStayMonths, int maximumStayMonths, int currentOccupancy, String alias, List<String> galleryImagesUrl, Address address, Pricing pricing, List<Cost> costs, Facility facilities, Amenity amenities, PreferredTenant preferredTenant, Rule rules, PropertyType propertyType, PropertyStatus propertyStatus, RentKind kindOfRent, List<UnavailableDate> unavailableDates) {
        this.userId = userId;
        this.description = description;
        this.minimumStayMonths = minimumStayMonths;
        this.maximumStayMonths = maximumStayMonths;
        this.currentOccupancy = currentOccupancy;
        this.alias = alias;
        this.galleryImagesUrl = galleryImagesUrl;
        this.address = address;
        this.pricing = pricing;
        this.costs = costs;
        this.facilities = facilities;
        this.amenities = amenities;
        this.preferredTenant = preferredTenant;
        this.rules = rules;
        this.propertyType = propertyType;
        this.propertyStatus = propertyStatus;
        this.kindOfRent = kindOfRent;
        this.unavailableDates = unavailableDates;
    }
}

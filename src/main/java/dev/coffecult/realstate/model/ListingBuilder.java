package dev.coffecult.realstate.model;

import dev.coffecult.realstate.model.components.*;
import dev.coffecult.realstate.model.enums.PropertyStatus;
import dev.coffecult.realstate.model.enums.PropertyType;
import dev.coffecult.realstate.model.enums.RentKind;

import java.util.List;

public class ListingBuilder {
    private Long userId;
    private String description;
    private int minimumStayMonths;
    private int maximumStayMonths;
    private int currentOccupancy;
    private String alias;
    private List<String> galleryImagesUrl;
    private Address address;
    private Pricing pricing;
    private List<Cost> costs;
    private Facility facilities;
    private Amenity amenities;
    private PreferredTenant preferredTenant;
    private Rule rules;
    private PropertyType propertyType;
    private PropertyStatus propertyStatus;
    private RentKind kindOfRent;
    private List<UnavailableDate> unavailableDates;

    public ListingBuilder setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public ListingBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public ListingBuilder setMinimumStayMonths(int minimumStayMonths) {
        this.minimumStayMonths = minimumStayMonths;
        return this;
    }

    public ListingBuilder setMaximumStayMonths(int maximumStayMonths) {
        this.maximumStayMonths = maximumStayMonths;
        return this;
    }

    public ListingBuilder setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
        return this;
    }

    public ListingBuilder setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public ListingBuilder setGalleryImagesUrl(List<String> galleryImagesUrl) {
        this.galleryImagesUrl = galleryImagesUrl;
        return this;
    }

    public ListingBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public ListingBuilder setPricing(Pricing pricing) {
        this.pricing = pricing;
        return this;
    }

    public ListingBuilder setCosts(List<Cost> costs) {
        this.costs = costs;
        return this;
    }

    public ListingBuilder setFacilities(Facility facilities) {
        this.facilities = facilities;
        return this;
    }

    public ListingBuilder setAmenities(Amenity amenities) {
        this.amenities = amenities;
        return this;
    }

    public ListingBuilder setPreferredTenant(PreferredTenant preferredTenant) {
        this.preferredTenant = preferredTenant;
        return this;
    }

    public ListingBuilder setRules(Rule rules) {
        this.rules = rules;
        return this;
    }

    public ListingBuilder setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
        return this;
    }

    public ListingBuilder setPropertyStatus(PropertyStatus propertyStatus) {
        this.propertyStatus = propertyStatus;
        return this;
    }

    public ListingBuilder setKindOfRent(RentKind kindOfRent) {
        this.kindOfRent = kindOfRent;
        return this;
    }

    public ListingBuilder setUnavailableDates(List<UnavailableDate> unavailableDates) {
        this.unavailableDates = unavailableDates;
        return this;
    }

    public Listing build() {
        return new Listing(userId, description, minimumStayMonths, maximumStayMonths, currentOccupancy, alias, galleryImagesUrl, address, pricing, costs, facilities, amenities, preferredTenant, rules, propertyType, propertyStatus, kindOfRent, unavailableDates);
    }
}
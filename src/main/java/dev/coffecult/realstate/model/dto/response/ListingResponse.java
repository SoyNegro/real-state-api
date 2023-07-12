package dev.coffecult.realstate.model.dto.response;

import dev.coffecult.realstate.model.Listing;
import dev.coffecult.realstate.model.components.*;
import dev.coffecult.realstate.model.enums.RentKind;

import java.util.List;

public record ListingResponse(String id,

                              String description,
                              RentKind kindOfRent,
                              Facility facilities,
                              Amenity amenities,
                              Rule rules,
                              PreferredTenant preferredTenant,
                              int currentOccupancy,
                              List<Cost> costs,
                              int minimumStayMonths,
                              int maximumStayMonths,
                              List<String> galleryImagesUrl,
                              List<UnavailableDate> unavailableDates) {
    ListingResponse(Listing listing) {
        this(listing.getId(),
                listing.getDescription(),
                listing.getKindOfRent(),
                listing.getFacilities(),
                listing.getAmenities(),
                listing.getRules(),
                listing.getPreferredTenant(),
                listing.getCurrentOccupancy(),
                listing.getCosts(),
                listing.getMinimumStayMonths(),
                listing.getMaximumStayMonths(),
                listing.getGalleryImagesUrl(),
                listing.getUnavailableDates());
    }
}

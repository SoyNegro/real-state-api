package dev.coffecult.realstate.model.dto.response;

import dev.coffecult.realstate.model.Listing;
import dev.coffecult.realstate.model.components.Pricing;
import dev.coffecult.realstate.model.enums.PropertyType;

import java.time.LocalDateTime;

public record ListingSearchResponse(String id,
                                    String coverImgUrl,
                                    PropertyType propertyType,
                                    Pricing pricing,
                                    int size,
                                    String bedroomsOrSpaceAvailable,
                                    LocalDateTime availableFrom) {
}

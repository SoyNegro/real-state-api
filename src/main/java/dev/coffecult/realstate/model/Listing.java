package dev.coffecult.realstate.model;

import dev.coffecult.realstate.model.components.*;
import dev.coffecult.realstate.model.enums.PropertyStatus;
import dev.coffecult.realstate.model.enums.PropertyType;
import dev.coffecult.realstate.model.enums.RentKind;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@NoArgsConstructor
@Getter
@Setter
public class Listing {
    @Id
    private String id;
    @NotNull
    private Long userId;
    @NotEmpty
    private String listingNumber;
    @NotEmpty
    private String description;

    private short minimumStayMonths;

    private short maximumStayMonths;

    private short moveInWindow = 0;

    private short currentOccupancy = 0;
    @NotEmpty
    private String alias;
    @NotEmpty
    private List<String> galleryImagesUrl;
    @NotNull
    private Address address;
    @NotNull
    private Pricing pricing;

    @NotEmpty
    private List<Cost> costs;
    @NotNull
    private Facility facilities;
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


}

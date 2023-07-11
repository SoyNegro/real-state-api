package dev.coffecult.realstate.model.components;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.coffecult.realstate.model.enums.AccessType;
import dev.coffecult.realstate.model.enums.HousemateGender;
import dev.coffecult.realstate.model.enums.SharingType;
import dev.coffecult.realstate.model.enums.TenantStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Facility(
        boolean allergyFriendly,
        HousemateGender housematesGender,
        TenantStatus tenantStatus,
        short freePlaces,
        short bedrooms,
        short bedroomSize,
        AccessType balconyTerrace,
        AccessType basement,
        SharingType bathroom,
        AccessType garden,
        AccessType livingRoom,
        AccessType parking,
        AccessType toilet,
        short totalSize
) {
}

package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Facility {
    private boolean allergyFriendly;
    private String housematesGender;

    private TenantStatus tenantStatus;

    private short freePlaces;

    private short bedrooms;

    private boolean bedroomFurnished;

    private short bedroomSize;

    private boolean bedroomLock;

    private AccessType balconyTerrace;

    private AccessType basement;

    private SharingType bathroom;

    private AccessType garden;

    private AccessType livingRoom;

    private AccessType parking;

    private AccessType toilet;

    private short totalSize;

    private boolean wheelchairAccessible;

    private boolean airConditioning;

    private boolean bed;

    private boolean closet;

    private boolean dishwasher;

    private boolean dryer;

    private boolean internet;

    private boolean roomFurniture;

    private boolean tv;

    private boolean washingMachine;

    private FlooringType flooring;

    private HeatingType heating;

    private AccessType kitchenware;

}

package dev.coffecult.realstate.model.components;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.coffecult.realstate.model.enums.AccessType;
import dev.coffecult.realstate.model.enums.FlooringType;
import dev.coffecult.realstate.model.enums.HeatingType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Amenity(boolean wheelchairAccessible,
                      boolean airConditioning,
                      boolean bed,
                      boolean closet,
                      boolean dishwasher,
                      boolean dryer,
                      boolean internet,
                      boolean livingRoomFurniture,
                      boolean bedroomLock,
                      boolean bedroomFurnished,
                      boolean tv,
                      boolean washingMachine,
                      FlooringType flooring,
                      HeatingType heating,
                      AccessType kitchenware) {
}

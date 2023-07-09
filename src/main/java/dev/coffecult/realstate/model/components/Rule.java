package dev.coffecult.realstate.model.components;

import dev.coffecult.realstate.model.enums.AllowedInProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rule {
    private AllowedInProperty petsAllowed;
    private boolean cleaningCommonRooms;

    private boolean cleaningPrivateRoom;

    private AllowedInProperty playingMusicAllowed;

    private AllowedInProperty smokingAllowed;

}

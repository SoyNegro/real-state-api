package dev.coffecult.realstate.model.components;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.coffecult.realstate.model.enums.AllowedInProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class Rule {
    private AllowedInProperty petsAllowed;
    private boolean cleaningCommonRooms;

    private boolean cleaningPrivateRoom;

    private AllowedInProperty playingMusicAllowed;

    private AllowedInProperty smokingAllowed;

}

package dev.coffecult.realstate.model.components;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.coffecult.realstate.model.enums.AllowedInProperty;
import jakarta.validation.constraints.NotNull;


@JsonInclude(JsonInclude.Include.NON_NULL)
public record Rule(
        @NotNull
        AllowedInProperty petsAllowed,
        @NotNull
        boolean cleaningCommonRooms,
        @NotNull
        boolean cleaningPrivateRoom,
        @NotNull
        AllowedInProperty playingMusicAllowed,
        @NotNull
        AllowedInProperty smokingAllowed) {
}


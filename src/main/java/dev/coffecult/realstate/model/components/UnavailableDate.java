package dev.coffecult.realstate.model.components;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;

import java.time.LocalDateTime;

public record UnavailableDate(@FutureOrPresent LocalDateTime dateFrom, @Future LocalDateTime dateTo) {
}

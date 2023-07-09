package dev.coffecult.realstate.model.components;

import java.time.LocalDateTime;

public record UnavailableDate(LocalDateTime dateFrom, LocalDateTime dateTo) {
}

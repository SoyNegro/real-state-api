package dev.coffecult.realstate.controller;

import dev.coffecult.realstate.model.dto.request.ListingRequest;
import dev.coffecult.realstate.model.dto.response.ListingResponse;
import dev.coffecult.realstate.service.ListingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api")
public class ListingController {
    private final ListingService listingService;

    @GetMapping("listings")
    public ResponseEntity<List<ListingResponse>> getListings(@RequestParam(defaultValue = "0") final int page,
                                                             @RequestParam(defaultValue = "50") final int size) {
        return listingService.getListingsByPage(page, size);
    }

    @GetMapping("listings/{id}")
    public ResponseEntity<ListingResponse> getListingById(@PathVariable final String id) {
        return listingService.getListingById(id);
    }

    @PostMapping("listings")
    public ResponseEntity<ListingResponse> createListing(@RequestBody @Valid final ListingRequest listingRequest) {
        return listingService.createListing(listingRequest);
    }

    @PutMapping("listings/{id}")
    public ResponseEntity<ListingResponse> updateListing(@PathVariable final String id, @RequestBody @Valid final ListingRequest listingRequest) {
        return listingService.updateListing(id, listingRequest);
    }

    @DeleteMapping("listings/{id}")
    public ResponseEntity<ListingResponse> deleteListing(@PathVariable final String id) {
        return listingService.deleteListing(id);
    }

    @GetMapping("listings/show/{id}")
    public ResponseEntity<String> showListing(@PathVariable final String id) {
        return listingService.showListing(id);
    }

    @GetMapping("listings/hide/{id}")
    public ResponseEntity<String> hideListing(@PathVariable final String id) {
        return listingService.hideListing(id);
    }


}

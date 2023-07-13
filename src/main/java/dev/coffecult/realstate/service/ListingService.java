package dev.coffecult.realstate.service;

import dev.coffecult.realstate.model.dto.request.ListingRequest;
import dev.coffecult.realstate.model.dto.response.ListingResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ListingService {
    public ResponseEntity<List<ListingResponse>> getListingsByPage(int page, int size) {
        return null;
    }

    public ResponseEntity<ListingResponse> getListingById(String id) {
        return null;
    }

    public ResponseEntity<ListingResponse> createListing(ListingRequest listingRequest) {
        return null;
    }

    public ResponseEntity<ListingResponse> updateListing(String id, ListingRequest listingRequest) {
        return null;
    }


    public ResponseEntity<ListingResponse> deleteListing(String id) {
        return null;
    }

    public ResponseEntity<String> showListing(String id) {
        return null;
    }

    public ResponseEntity<String> hideListing(String id) {
        return null;
    }

}

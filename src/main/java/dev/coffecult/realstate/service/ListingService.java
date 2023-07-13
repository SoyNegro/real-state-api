package dev.coffecult.realstate.service;

import dev.coffecult.realstate.model.Listing;
import dev.coffecult.realstate.model.dto.request.ListingRequest;
import dev.coffecult.realstate.model.dto.response.ListingResponse;
import dev.coffecult.realstate.repository.ListingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ListingService {
    final ListingRepository listingRepository;

    public ResponseEntity<List<ListingResponse>> getListingsByCountry(String countryCode, int page, int size) {
        var listings = listingRepository.findListingsByCountry(countryCode, PageRequest.of(page, size));
        return getListResponse(listings);
    }

    public ResponseEntity<List<ListingResponse>> getListingsByCity(String countryCode, String city, int page, int size) {
        var listings = listingRepository.findListingsByCity(countryCode, city, PageRequest.of(page, size));
        return getListResponse(listings);
    }

    public ResponseEntity<List<ListingResponse>> getListingsByNeighborhood(String countryCode, String city, String neighborhood, int page, int size) {
        var listings = listingRepository.findListingsByNeighborhood(countryCode, city, neighborhood, PageRequest.of(page, size));
        return getListResponse(listings);
    }

    public ResponseEntity<ListingResponse> getListingById(String id) {
        return listingRepository.findById(id)
                .map(listing -> new ResponseEntity<>(new ListingResponse(listing), HttpStatus.OK)).
                orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<ListingResponse> createListing(ListingRequest listingRequest) {
        var listing = listingRepository.save(listingRequest.toListing());
        return new ResponseEntity<>(new ListingResponse(listing), HttpStatus.CREATED);
    }

    public ResponseEntity<ListingResponse> updateListing(String id, ListingRequest listingRequest) {
        if (!listingRepository.existsById(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        var listing = listingRequest.toListing();
        listing.setId(id);
        var response = new ListingResponse(
                listingRepository.save(listing)
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<ListingResponse> deleteListing(String id) {
        var listing = listingRepository.findById(id);
        if (listing.isPresent()){
            listingRepository.deleteById(id);
            var response = new ListingResponse(listing.get());
            return new ResponseEntity<>(response,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> showListing(String id) {
        return null;
    }

    public ResponseEntity<String> hideListing(String id) {
        return null;
    }

    private ResponseEntity<List<ListingResponse>> getListResponse(List<Listing> listings) {
        if (listings.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        var response = new ArrayList<ListingResponse>();
        listings.forEach(listing -> response.add(new ListingResponse(listing))
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}

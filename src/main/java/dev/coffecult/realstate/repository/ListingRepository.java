package dev.coffecult.realstate.repository;

import dev.coffecult.realstate.model.Listing;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends MongoRepository<Listing, String> {

    List<Listing> findByUserId(Long userId, Pageable pageable);

    @Query(" {'address.countryCode': ?0}")
    List<Listing> findListingsByCountry(String countryCode, Pageable pageable);

    @Query(" {'address.countryCode': ?0,'address.city': ?1}")
    List<Listing> findListingsByCity(String countryCode, String city, Pageable pageable);

    @Query(" {'address.countryCode': ?0,'address.city': ?1, 'address.neighborhood': ?2}")
    List<Listing> findListingsByNeighborhood(String countryCode, String city, String neighborhood, Pageable pageable);


//    @Query("{'address.countryCode': ?0,'address.city': ?1,'pricing.price': {'$gte':?2,'$lte': ?3 }}")
//    List<Listing> findListingsByPriceRange(String countryCode, String city, int minimumPrice, int maximumPrice, Pageable pageable);


}

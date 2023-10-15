package dev.coffecult.realstate.security.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiKeyRepository extends JpaRepository<ApiKey,Integer> {
    boolean existsByKey(String key);
}

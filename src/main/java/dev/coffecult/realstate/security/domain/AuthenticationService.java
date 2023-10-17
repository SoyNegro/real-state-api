package dev.coffecult.realstate.security.domain;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
    private final ApiKeyRepository apiKeyRepository;

    public AuthenticationService(ApiKeyRepository apiKeyRepository) {
        this.apiKeyRepository = apiKeyRepository;
    }

    public Authentication getAuthentication(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken == null || bearerToken.isBlank() || !bearerToken.startsWith("Bearer ") || !apiKeyRepository.existsByKey(bearerToken.substring(7))) {
            throw new BadCredentialsException("Invalid API KEY");
        }
        return new ApiKeyAuthentication(bearerToken.substring(7), AuthorityUtils.NO_AUTHORITIES);
    }
}


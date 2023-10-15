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

    public Authentication getAuthentication(HttpServletRequest request){
        String apiKey = request.getHeader("Bearer");
        if (apiKey==null || !apiKeyRepository.existsByKey(apiKey)){
            throw new BadCredentialsException("Invalid API KEY");
        }
        return new ApiKeyAuthentication(apiKey, AuthorityUtils.NO_AUTHORITIES);
    }
}

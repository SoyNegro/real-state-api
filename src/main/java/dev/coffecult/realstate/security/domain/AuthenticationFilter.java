package dev.coffecult.realstate.security.domain;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

@Component
public class AuthenticationFilter extends GenericFilterBean {
    private final AuthenticationService authenticationService;

    public AuthenticationFilter(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
     try {
     var authentication = authenticationService.getAuthentication((HttpServletRequest) servletRequest);
     SecurityContextHolder.getContext().setAuthentication(authentication);
     }catch (Exception ex){
         var response = (HttpServletResponse) servletResponse;
         response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
         response.setContentType(MediaType.APPLICATION_JSON_VALUE);
         var writer = response.getWriter();
         writer.print(ex.getMessage());
         writer.flush();
         writer.close();
     }
     filterChain.doFilter(servletRequest,servletResponse);
    }
}

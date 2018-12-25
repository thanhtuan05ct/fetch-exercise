package com.fetch.exercise.jwt;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by tuanle on 24/12/2018.
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {

    private List<String> roles = Arrays.asList("ROLE_USER");

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("tuan","123456", getAuthorities());
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream().map(SimpleGrantedAuthority::new).collect(toList());
    }
}

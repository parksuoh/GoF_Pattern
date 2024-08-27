package org.example._2_structural_patterns._6_adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}

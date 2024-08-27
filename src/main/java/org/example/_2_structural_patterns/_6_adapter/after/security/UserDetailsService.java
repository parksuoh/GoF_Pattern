package org.example._2_structural_patterns._6_adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}

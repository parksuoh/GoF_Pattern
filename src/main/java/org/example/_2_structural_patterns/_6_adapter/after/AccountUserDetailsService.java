package org.example._2_structural_patterns._6_adapter.after;


import org.example._2_structural_patterns._6_adapter.after.security.UserDetails;
import org.example._2_structural_patterns._6_adapter.after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}

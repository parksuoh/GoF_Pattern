package org.example._2_structural_patterns._6_adapter.after;


import org.example._2_structural_patterns._6_adapter.after.security.LoginHandler;
import org.example._2_structural_patterns._6_adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
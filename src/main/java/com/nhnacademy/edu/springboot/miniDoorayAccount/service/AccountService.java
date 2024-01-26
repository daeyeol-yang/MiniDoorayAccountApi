package com.nhnacademy.edu.springboot.miniDoorayAccount.service;

import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import java.util.List;
import org.springframework.stereotype.Service;


public interface AccountService {

    List<Account> getAccounts();

    boolean matches(String id, String password);

    Account createAccount(Account account);
}

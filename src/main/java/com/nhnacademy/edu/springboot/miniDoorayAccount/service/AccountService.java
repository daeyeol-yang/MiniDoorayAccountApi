package com.nhnacademy.edu.springboot.miniDoorayAccount.service;

import com.nhnacademy.edu.springboot.miniDoorayAccount.domain.IdAndNameOnly;
import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import java.util.List;


public interface AccountService {

    List<Account> getAccounts();

    boolean matches(String id, String password);

    Account createAccount(Account account);

    Account getAccount(String id);

    List<IdAndNameOnly> getIdAndNames();

    List<Account> getAccountByAccountIds(List<String> accountId);
}

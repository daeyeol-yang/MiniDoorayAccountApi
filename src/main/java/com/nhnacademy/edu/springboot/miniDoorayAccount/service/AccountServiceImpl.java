package com.nhnacademy.edu.springboot.miniDoorayAccount.service;

import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import com.nhnacademy.edu.springboot.miniDoorayAccount.repository.AccountRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }
}

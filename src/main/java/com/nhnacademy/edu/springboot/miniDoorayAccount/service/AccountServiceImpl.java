package com.nhnacademy.edu.springboot.miniDoorayAccount.service;

import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import com.nhnacademy.edu.springboot.miniDoorayAccount.repository.AccountRepository;
import java.util.List;
import java.util.Optional;
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

    @Override
    public boolean matches(String id, String password){return accountRepository.existsByAccountIdAndAccountPassword(id,password);}

    @Override
    public Account createAccount(Account account) {
        boolean isPresent = accountRepository.findById(account.getAccountId()).isPresent();
        if(isPresent){
            throw new IllegalStateException("already exist "+account.getAccountId());
        }
        return accountRepository.save(account);
    }

    @Override
    public Account getAccount(String id) {
        return accountRepository.findById(id).orElseThrow();
    }
}

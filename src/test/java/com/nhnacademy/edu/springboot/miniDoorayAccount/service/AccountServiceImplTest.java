package com.nhnacademy.edu.springboot.miniDoorayAccount.service;

import static org.junit.jupiter.api.Assertions.*;

import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceImplTest {

    @Autowired
    AccountService accountService;

    @Test
    void testGetAccounts() {

        List<Account> actual = accountService.getAccounts();
        org.assertj.core.api.Assertions.assertThat(actual).hasSize(1);


    }
}
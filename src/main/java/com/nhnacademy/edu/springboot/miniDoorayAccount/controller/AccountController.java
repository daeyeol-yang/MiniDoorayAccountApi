package com.nhnacademy.edu.springboot.miniDoorayAccount.controller;

import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import com.nhnacademy.edu.springboot.miniDoorayAccount.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createAccount(@RequestBody Account account) {
       try {
           accountService.createAccount(account);
           return ResponseEntity.status(HttpStatus.CREATED).body("Success");
       }catch (RuntimeException e){
           return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
       }


    }

}

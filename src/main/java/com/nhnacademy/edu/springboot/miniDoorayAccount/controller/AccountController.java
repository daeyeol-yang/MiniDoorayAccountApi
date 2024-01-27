package com.nhnacademy.edu.springboot.miniDoorayAccount.controller;

import com.nhnacademy.edu.springboot.miniDoorayAccount.domain.AccountOnlyId;
import com.nhnacademy.edu.springboot.miniDoorayAccount.domain.IdAndNameOnly;
import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import com.nhnacademy.edu.springboot.miniDoorayAccount.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createAccount(@RequestBody Account account) {
        try {
            accountService.createAccount(account);
            return ResponseEntity.status(HttpStatus.CREATED).body("Success");
        } catch (RuntimeException e) {
            log.info(e.getMessage());
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }


    }


    @GetMapping("/names")
    public ResponseEntity<List<IdAndNameOnly>> getIdAndName() {

        return ResponseEntity.status(HttpStatus.OK).body(accountService.getIdAndNames());
    }

    @GetMapping("/projectMember")
    public ResponseEntity< List<Account>> getProjectAccount(@RequestParam List<String> accountIds){
        return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccountByAccountIds(accountIds));

    }



}





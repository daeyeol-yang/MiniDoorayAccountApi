package com.nhnacademy.edu.springboot.miniDoorayAccount.controller;

import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import com.nhnacademy.edu.springboot.miniDoorayAccount.login.LoginRequest;
import com.nhnacademy.edu.springboot.miniDoorayAccount.service.AccountService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class LoginController {

    private final AccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<Account> doLogin(@RequestBody LoginRequest loginRequest) {
        log.info("Login -----");
        if (accountService.matches(loginRequest.getId(), loginRequest.getPwd())) {
            return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccount(loginRequest.getId()));
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}

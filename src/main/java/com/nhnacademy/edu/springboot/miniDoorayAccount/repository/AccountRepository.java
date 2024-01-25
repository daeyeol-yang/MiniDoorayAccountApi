package com.nhnacademy.edu.springboot.miniDoorayAccount.repository;

import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

}

package com.nhnacademy.edu.springboot.miniDoorayAccount.repository;

import com.nhnacademy.edu.springboot.miniDoorayAccount.domain.IdAndNameOnly;
import com.nhnacademy.edu.springboot.miniDoorayAccount.entity.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    boolean existsByAccountIdAndAccountPassword(String accountId,String password);





    @Query("SELECT a.accountId AS accountId, a.name AS name FROM Account a")
    List<IdAndNameOnly> findAllIdAndNameOnly();






}

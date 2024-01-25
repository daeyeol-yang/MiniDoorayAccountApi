package com.nhnacademy.edu.springboot.miniDoorayAccount.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
public class Account {
    @Id
    @Column(name = "account_id")
    private String accountId;

    @Column(name = "account_pw")
    private String accountPassword;

    @Column(name= "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "join_date")
    private LocalDateTime joinDate;

    @Column(name="last_login_date")
    private LocalDateTime lastLoginDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_state_id")
    private AccountState accountStatus;


}

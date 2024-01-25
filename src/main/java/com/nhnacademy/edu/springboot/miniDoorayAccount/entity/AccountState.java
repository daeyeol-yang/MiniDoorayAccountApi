package com.nhnacademy.edu.springboot.miniDoorayAccount.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "account_state")
public class AccountState {
    @Id
    @Column(name = "account_state_id")
    private Integer accountStateId;

    @Column(name = "account_state_name")
    private String accountStateName;


}

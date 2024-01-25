use
nhn_academy_27;

CREATE TABLE `accounts`
(
    `account_id`       varchar(20) NOT NULL,
    `account_pw`       varchar(20) NOT NULL,
    `email`            varchar(30) NOT NULL,
    `name`             varchar(30) NOT NULL,
    `join_date`        datetime    NOT NULL,
    `last_login_date`  datetime    NOT NULL,
    `account_state_id` integer     NOT NULL
);

CREATE TABLE `account_state`
(
    `account_state_id`   integer     NOT NULL,
    `account_state_name` varchar(30) NOT NULL
);

ALTER TABLE `accounts`
    ADD CONSTRAINT `PK_ACCOUNTS` PRIMARY KEY (
                                              `account_id`
        );

ALTER TABLE `account_state`
    ADD CONSTRAINT `PK_ACCOUNT_STATE` PRIMARY KEY (
                                                   `account_state_id`
        );

ALTER TABLE `accounts`
    ADD CONSTRAINT `FK_account_state_TO_accounts_1` FOREIGN KEY (
                                                                 `account_state_id`
        ) REFERENCES `account_state` (
                                      `account_state_id`
        );
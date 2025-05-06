package com.piyapatproject.banking.service;

import com.piyapatproject.banking.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double amount);
    AccountDto withDraw(Long id, double amount);

}

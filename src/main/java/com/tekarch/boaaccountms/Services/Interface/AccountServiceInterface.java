package com.tekarch.boaaccountms.Services.Interface;

import com.tekarch.boaaccountms.models.Accounts;

import java.util.List;

public interface AccountServiceInterface {
    List<Accounts> getAllAccounts();
    Accounts getAccountById(Long accountId);
    Accounts addAccount(Accounts accounts);
    void deleteAccount(Long accountId);
    Accounts updateAccount(Accounts accounts);
}

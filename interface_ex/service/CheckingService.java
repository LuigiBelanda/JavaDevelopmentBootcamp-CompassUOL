package interface_ex.service;

import java.math.BigDecimal;

import interface_ex.pojo.Checking;
import interface_ex.repository.AccountRepository;

public class CheckingService implements AccountService {

    AccountRepository accountRepository;

    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // Note que os métodos abaixo todos referenciam o único repositório que temos
    // pois somente o repositório mexe com os dados
    // Os services apenas são o intermédio da operação, apenas gerenciam isso
    public void createAccount(Checking account) {
        this.accountRepository.createAccount(account);
    }

    public Checking retrieveAccount(String id) {
        return (Checking)this.accountRepository.retrieveAccount(id);
    }

    public void updateAccount(Checking account) {
        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }


    
    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking checking = retrieveAccount(id);
        checking.setBalance(checking.getBalance().add(amount));
        updateAccount(checking);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking checking = retrieveAccount(id);
        checking.setBalance(checking.getBalance().subtract(amount));
        updateAccount(checking);
    }

}
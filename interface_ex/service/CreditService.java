package interface_ex.service;

import interface_ex.pojo.Credit;
import interface_ex.repository.AccountRepository;

public class CreditService {

    AccountRepository accountRepository;

    public CreditService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // Note que os métodos abaixo todos referenciam o único repositório que temos
    // pois somente o repositório mexe com os dados
    // Os services apenas são o intermédio da operação, apenas gerenciam isso
    public void createAccount(Credit account) {
        this.accountRepository.createAccount(account);
    }

    public Credit retrieveAccount(String id) {
        return (Credit)this.accountRepository.retrieveAccount(id);
    }

    public void updateAccount(Credit account) {
        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }
}
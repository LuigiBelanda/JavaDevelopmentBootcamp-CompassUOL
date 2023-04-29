package interface_ex.repository;

import java.util.HashMap;
import java.util.Map;

import interface_ex.pojo.Account;

public class AccountRepository {

    // Só ele tem acesso a esse atributo / método
    private Map<String, Account> datastore = new HashMap<>();

    public void createAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    public Account retrieveAccount(String id) {
        return null;
    }

    public void updateAccount(Account account) {

    }

    public void deleteAccount(String id) {

    }

}

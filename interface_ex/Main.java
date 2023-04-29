package interface_ex;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import interface_ex.pojo.Account;
import interface_ex.pojo.Checking;
import interface_ex.pojo.Credit;
import interface_ex.repository.AccountRepository;
import interface_ex.service.CheckingService;
import interface_ex.service.CreditService;

public class Main {

    public static void main(String[] args) {

        // Iniciando o repositório
        AccountRepository repository = new AccountRepository();

        // Serviços que iram intermediar as operações
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);

        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
                new Checking("A1234B", new BigDecimal("500.00")),
                new Checking("E3456F", new BigDecimal("300.50")),
                new Checking("I5678J", new BigDecimal("100.25")),
                new Credit("A1534B", new BigDecimal("0.50")),
                new Credit("G4567H", new BigDecimal("200.00")));

        // Salvando as contas
        accounts.forEach(account -> {
            if (account instanceof Credit) {
                creditService.createAccount((Credit)account);
            } else {
                checkingService.createAccount((Checking)account);
            }
            repository.createAccount(account);
        });

        // Recuperando as contas
        Checking checking = (Checking) repository.retrieveAccount("A1234B");

        // Mudando dados
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        repository.updateAccount(checking);

        // Deletando conta
        repository.deleteAccount("G4567H");

    }

}
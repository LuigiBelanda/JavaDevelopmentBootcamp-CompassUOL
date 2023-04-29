package interface_ex.service;

import java.math.BigDecimal;

// Com interface fazemos praticamente um contrato
// E nos outros services que tiverem na sua classe "IMPLEMENTS ACCOUNTSERVICE"
// Significa que eles iram implementar os dois métodos abaixo
public interface AccountService {
    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);
}

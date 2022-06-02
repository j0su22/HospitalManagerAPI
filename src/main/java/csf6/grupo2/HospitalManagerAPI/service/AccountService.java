package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccounts();

    Account saveAccount(Account account);

    Optional<Account> findAccount(Integer id);

    Account updateAccount(Account account);

    boolean deleteAccount(Integer id);

    Account disableAccount(Integer id);

    Account enableAccount(Integer id);
}

package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Account;
import csf6.grupo2.HospitalManagerAPI.model.Disease;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccounts();

    Account saveAccount(Account account);

    Optional<Account> findAccount(Integer id);
}

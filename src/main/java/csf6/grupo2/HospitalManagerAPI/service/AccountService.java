package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Account;
import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();

    Account saveAccount(Account account);
}

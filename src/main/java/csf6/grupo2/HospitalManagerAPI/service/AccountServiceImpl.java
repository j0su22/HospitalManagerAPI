package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Account;
import csf6.grupo2.HospitalManagerAPI.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import csf6.grupo2.HospitalManagerAPI.security.BCrypt;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account singIn(String user, String pass) {


        return null;
    }

    @Override
    public Account singUp(Account account) {
        account.setPassword(BCrypt.hashpw(account.getPassword(), BCrypt.gensalt()));
        return accountRepository.save(account);
    }

    @Override
    public Optional<Account> findAccount(Integer id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public boolean deleteAccount(Integer id) {
        accountRepository.deleteById(id);
        return true;
    }

    @Override
    public Account disableAccount(Integer id) {
        Optional<Account> account = accountRepository.findById(id);

        Account acc = new Account();
        acc.setIdAccount(account.get().getIdAccount());
        acc.setUsername((account.get().getUsername()));
        acc.setPassword(account.get().getPassword());
        acc.setIsAdmin(account.get().getIsAdmin());
        acc.setState(0);

        accountRepository.save(acc);

        return acc;
    }

    @Override
    public Account enableAccount(Integer id) {
        Optional<Account> account = accountRepository.findById(id);

        Account acc = new Account();
        acc.setIdAccount(account.get().getIdAccount());
        acc.setUsername((account.get().getUsername()));
        acc.setPassword(account.get().getPassword());
        acc.setIsAdmin(account.get().getIsAdmin());
        acc.setState(1);

        accountRepository.save(acc);

        return acc;
    }
}

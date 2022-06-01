package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.Account;
import csf6.grupo2.HospitalManagerAPI.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/getAll")
    public List<Account> List(){ return accountService.getAllAccounts(); }

    @PostMapping("/add")
    public String addAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return "new account added";
    }

    @GetMapping("/find")
    public Optional<Account> findDisease(Integer id) {
        return accountService.findAccount(id);
    }

    @PutMapping("/update")
    public String updateAccount(@RequestBody Account account) {
        accountService.updateAccount(account);
        return "Account updated!";
    }

    @PutMapping("/disable")
    public String disableAccount(@RequestBody Account account) {
        accountService.disableAccount(account);
        return "Account disable!";
    }
}

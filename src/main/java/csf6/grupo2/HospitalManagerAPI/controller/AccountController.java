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

    @PostMapping("/singIn")
    public String singIn(String user, String pass) {
        accountService.singIn(user, pass);
        return "Welcome!";
    }

    @PostMapping("/singUp")
    public String singUp(@RequestBody Account account) {
        accountService.singUp(account);
        return "Account added";
    }

    @GetMapping("/find")
    public Optional<Account> findAccount(Integer id) {
        return accountService.findAccount(id);
    }

    @PutMapping("/update")
    public String updateAccount(@RequestBody Account account) {
        accountService.updateAccount(account);
        return "Account updated!";
    }

    @PostMapping("/disable")
    public String disableAccount(Integer id) {
        accountService.disableAccount(id);
        return "Account disable!";
    }

    @PostMapping("/enable")
    public String enableAccount(Integer id) {
        accountService.enableAccount(id);
        return "Account enable!";
    }
}

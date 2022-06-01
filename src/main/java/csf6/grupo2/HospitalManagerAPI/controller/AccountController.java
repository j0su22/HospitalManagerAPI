package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.Account;
import csf6.grupo2.HospitalManagerAPI.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/getAll")
    public List<Account> List(){ return accountService.getAllAccounts(); }

    @PostMapping("/add")
    public String add(@RequestBody Account account) {
        accountService.saveAccount(account);
        return "new account added";
    }

}

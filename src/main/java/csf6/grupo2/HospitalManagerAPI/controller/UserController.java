package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.User;
import csf6.grupo2.HospitalManagerAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User added!";
    }

    @GetMapping("/getAll")
    public List<User> listUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/find")
    public Optional<User> findUser(Integer id) {
        return userService.findUser(id);
    }
}

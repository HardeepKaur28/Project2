package com.Signupapi.Signupapi.Controller;
import com.Signupapi.Signupapi.model.User;
import com.Signupapi.Signupapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    //IOC:inversion of control -- done with the help of dependecy injecton

    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.GET,value = "/users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/users" )
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }
}

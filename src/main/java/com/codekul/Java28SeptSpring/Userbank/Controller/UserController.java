package com.codekul.Java28SeptSpring.Userbank.Controller;

import com.codekul.Java28SeptSpring.Userbank.ApiResponce;
import com.codekul.Java28SeptSpring.Userbank.Domain.User;
import com.codekul.Java28SeptSpring.Userbank.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("saveUser")
    public ApiResponce<User> saveUser(@RequestBody User user){
        ApiResponce<User> apiResponce = new ApiResponce<>();
        User user1= userRepository.save(user);
        apiResponce.setMessage("User Saved");
        apiResponce.setStatusCode(HttpStatus.OK.value());
        apiResponce.setResult(user1);


    return  apiResponce;
    }
}

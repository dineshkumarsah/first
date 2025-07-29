package com.dineshbhumca.first.controller;
import com.dineshbhumca.first.model.User;
import com.dineshbhumca.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id){
        boolean deleted = userService.deleteUsr(id);
        if(deleted){
         return ResponseEntity.ok("User id"+ id + "deleted successfully!");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user with ID"+ id+ "not found");
        }
    }
}

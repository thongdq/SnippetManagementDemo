package thong.dq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import thong.dq.model.Snippet;
import thong.dq.model.User;
import thong.dq.service.UserService;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAllUsers();
        if(users.isEmpty()) {
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = {"/get-{id}-user"}, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> getUser(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        if(user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value = {"/get-{id}-user-snippet"}, method = RequestMethod.GET)
    public ResponseEntity<Set<Snippet>> getUserSnippet(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        if(user == null) {
            return new ResponseEntity<Set<Snippet>>(HttpStatus.NOT_FOUND);
        }
        Set<Snippet> snippets = user.getSnippets();
        return new ResponseEntity<Set<Snippet>>(snippets, HttpStatus.OK);
    }

}

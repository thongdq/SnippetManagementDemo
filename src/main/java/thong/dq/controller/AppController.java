package thong.dq.controller;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import thong.dq.model.Snippet;
import thong.dq.model.User;
import thong.dq.service.UserService;

import javax.validation.Valid;
import java.util.*;

//@Controller
//@RequestMapping("/")
public class AppController {

   /* @Autowired
    UserService userService;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "allusers";
    }

    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newEmployee(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("edit", false);
        return "registration";
    }

    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult result,
                               ModelMap model) {

        if (result.hasErrors()) {
            return "registration";
        }

        userService.saveUser(user);

        model.addAttribute("success", "User " + user.getName() + " registered successfully");
        return "success";
    }

    @RequestMapping(value = { "/edit-{ssn}-user" }, method = RequestMethod.GET)
    public String editEmployee(@PathVariable String ssn, ModelMap model) {
        User user = userService.findUserBySsn(ssn);
        model.addAttribute("user", user);
        model.addAttribute("edit", true);
        return "registration";
    }

    @RequestMapping(value = { "/edit-{ssn}-user" }, method = RequestMethod.POST)
    public String updateEmployee(@Valid User user, BindingResult result,
                                 ModelMap model, @PathVariable String ssn) {

        if (result.hasErrors()) {
            return "registration";
        }

        userService.updateUser(user);

        model.addAttribute("success", "User " + user.getName()  + " updated successfully");
        return "success";
    }

    @RequestMapping(value = { "/delete-{ssn}-user" }, method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable String ssn) {
        userService.deleteUserBySsn(ssn);
        return "redirect:/list";
    }

    @RequestMapping(value = {"/get-{id}-user"}, method = RequestMethod.GET)
    public void getUser(@PathVariable("id") Integer id) {
        System.out.println("Fetching User with id " + id);
        User user = userService.findById(id);
        System.out.println(user.getSnippets());
    }*/
}

package thong.dq.controller;

import org.joda.time.LocalDate;
import org.mockito.*;
import org.springframework.context.MessageSource;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import thong.dq.model.User;
import thong.dq.service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.*;

public class AppControllerTest {

    /*@Mock
    UserService userService;

    @Mock
    MessageSource messageSource;

    @InjectMocks
    AppController appController;

    @Spy
    List<User> users = new ArrayList<User>();

    @Spy
    ModelMap modelMap;

    @Mock
    BindingResult result;

    @BeforeClass
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        users = getUserList();
    }

    @Test
    public void listUsers() {
        Mockito.when(userService.findAllUsers()).thenReturn(users);
        Assert.assertEquals(appController.listUsers(modelMap), "allusers");
        Assert.assertEquals(modelMap.get("users"), users);
        Mockito.verify(userService, Mockito.atLeastOnce()).findAllUsers();
    }

    @Test
    public void newUser() {
        Assert.assertEquals(appController.newEmployee(modelMap), "registration");
        Assert.assertNotNull(modelMap.get("user"));
        Assert.assertFalse((Boolean) modelMap.get("edit"));
        Assert.assertEquals(((User)modelMap.get("user")).getId(), 0);
    }

    @Test
    public void saveUserWithValidationError() {
        Mockito.when(result.hasErrors()).thenReturn(true);
        Mockito.doNothing().when(userService).saveUser(any(User.class));
        Assert.assertEquals(appController.saveUser(users.get(0), result, modelMap), "registration");
    }

    @Test
    public void saveUserWithValidationErrorNonUniqueSSN(){
        Mockito.when(result.hasErrors()).thenReturn(false);
        Mockito.when(userService.isUserSsnUnique(Mockito.anyInt(), Mockito.anyString())).thenReturn(false);
        Assert.assertEquals(appController.saveUser(users.get(0), result, modelMap), "registration");
    }

    @Test
    public void saveUserWithSuccess() {
        Mockito.when(result.hasErrors()).thenReturn(false);
        Mockito.when(userService.isUserSsnUnique(Mockito.anyInt(), Mockito.anyString())).thenReturn(true);
        Mockito.doNothing().when(userService).saveUser(any(User.class));
        Assert.assertEquals(appController.saveUser(users.get(0), result, modelMap), "success");
        Assert.assertEquals(modelMap.get("success"), "User Ti registered successfully");
    }

    @Test
    public void editUserWithSuccess() {
        User user = users.get(0);
        Mockito.when(userService.findUserBySsn(anyString())).thenReturn(user);
        Assert.assertEquals(appController.editEmployee(user.getSsn(), modelMap), "registration");
        Assert.assertEquals(modelMap.get("user"), user);
        Assert.assertTrue((Boolean) modelMap.get("edit"));
    }

    @Test
    public void updateUserWithValidationError() {
        Mockito.when(result.hasErrors()).thenReturn(true);
        Assert.assertEquals(appController.updateEmployee(users.get(0), result, modelMap, users.get(0).getSsn()), "registration");
    }

    @Test
    public void updateUserWithValidationErrorNonUniqueSSN() {
        Mockito.when(result.hasErrors()).thenReturn(false);
        Mockito.when(userService.isUserSsnUnique(anyInt(), anyString())).thenReturn(false);
        Assert.assertEquals(appController.updateEmployee(users.get(0), result, modelMap, users.get(0).getSsn()), "registration");
    }

    @Test
    public void upateUserWithSuccess() {
        User user = users.get(1);
        Mockito.when(result.hasErrors()).thenReturn(false);
        Mockito.when(userService.isUserSsnUnique(anyInt(),anyString())).thenReturn(true);
        Mockito.doNothing().when(userService).updateUser(any(User.class));
        Assert.assertEquals(appController.updateEmployee(users.get(1), result, modelMap, users.get(0).getSsn()), "success");
        Assert.assertEquals(modelMap.get("success"), "User Teo updated successfully");
    }

    public List<User> getUserList(){
        User u1 = new User();
        u1.setId(1);
        u1.setName("Ti");
        u1.setJoiningDate(new LocalDate());
        u1.setSalary(new BigDecimal(10000));
        u1.setSsn("XXX111");

        User u2 = new User();
        u2.setId(2);
        u2.setName("Teo");
        u2.setJoiningDate(new LocalDate());
        u2.setSalary(new BigDecimal(20000));
        u2.setSsn("XXX222");

        users.add(u1);
        users.add(u2);
        return users;
    }*/

}

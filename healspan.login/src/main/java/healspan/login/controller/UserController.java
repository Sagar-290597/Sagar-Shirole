package healspan.login.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import healspan.login.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// get User By Id
	@RequestMapping(value = "/user_master", method = RequestMethod.POST)
	public String getUser(@RequestParam Long id, @RequestParam String password) {
		User_Master user_Master = userService.findBy(id, password);
		if (user_Master.equals(id) && user_Master.equals(password)) {
			return "Welcome: " + id;
		} else {
			return "Invalid Credential";
		}
	}

}
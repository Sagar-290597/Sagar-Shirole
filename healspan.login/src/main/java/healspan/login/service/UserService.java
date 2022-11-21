package healspan.login.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import healspan.login.controller.User_Master;
import healspan.login.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	User_Master user_master;

	public User_Master findBy(Long id, String password) {
		boolean check1 = userRepository.existsById(id);
		boolean check2 = userRepository.exitsByPassword(password);
		//System.out.println(user_Master.getUm_id()+user_Master.getUm_password());
		if (check1 == true && check2 == true) {
			user_master.setUm_password(password);
			user_master.setid(id);

				return user_master;
			} else {
				return userRepository.findById(id).orElseThrow(
						()
								-> new NoSuchElementException(
								"NO USER PRESENT WITH ID = " + id));
			}

		}
	}

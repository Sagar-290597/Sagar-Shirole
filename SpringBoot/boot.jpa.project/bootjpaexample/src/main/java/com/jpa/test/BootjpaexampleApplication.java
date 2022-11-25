package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpp.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {
	@Autowired
	private  UserRepository userRepository;
     

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		
	
         BootjpaexampleApplication bootjpaexampleApplication = new  BootjpaexampleApplication();
         bootjpaexampleApplication.demo();
  
		
         
//         update the user of id 
//         Optional<User> optional =  userRepository.findById(1);
//         User user = optional.get();
//         System.out.println(user);
         
         
         //how to get the data
         //findById(id)- return Optional Containing your data
         
//       Iterable<User> itr=userRepository.findAll();
//        Iterator<User>iterator= itr.iterator();
//        
//        while(iterator.hasNext())
//        {
//        	User user =iterator.next();
//        	System.out.println(user); 
//
//        }
         
//       need to pass consumer or lymda
//       itr.forEach(user->{System.out.println(user);});
       
       
       //Deleting the user element
//       userRepository.deleteById(11);
//       System.out.println("deleted");
		
//		Iterable<User> allusers =userRepository.findAll();
//		allusers.forEach(user->{System.out.println(user);});
//		userRepository.deleteAll(allusers);
		

	}
	public void demo()
	{
	    
			//create object of user		
			User user =new User();
			user.setName("abc");
			user.setCity("xyz");
			user.setStatus("developer");
			
			User user1 =new User();
			user1.setName("abcd");
			user1.setCity("xyza");
			user1.setStatus("developer2");
			
			//save single object
//			User resultuser =userRepository.save(user);	
//			System.out.println("Saved user "+resultuser );
			
	    	//save multiple objects
			List<User> users = List.of(user,user1);		
			Iterable<User> result =userRepository.saveAll(users);
		
			result.forEach(user2 ->{
				System.out.println(user2);
			});
		
	}
	
}

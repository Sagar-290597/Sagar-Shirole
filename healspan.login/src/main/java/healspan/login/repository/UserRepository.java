package healspan.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import healspan.login.controller.User_Master;

@Repository
public interface UserRepository extends JpaRepository<User_Master, Long>{
    public boolean exitsByPassword(String password);

	
}

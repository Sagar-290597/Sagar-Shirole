package healspan.login.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import lombok.NonNull;

@Entity
@Table(name = "User_Master", schema = "Healspan")
@Component
public class User_Master {

	@Id
	@Column(name = "um_id")
	private Long id;
	@Column(name ="um_password")
	private String password;

	public User_Master() {
	}

	public User_Master(Long id, String password) {
		this.id = id;
		this.password = password;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getUm_password() {
		return password;
	}

	public void setUm_password(String password) {
		this.password = password;
	}
	

}

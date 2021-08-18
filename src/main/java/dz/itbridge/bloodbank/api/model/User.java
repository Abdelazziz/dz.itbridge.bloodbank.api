package dz.itbridge.bloodbank.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "du_user_v")
public class User {
	
	@Id
	@Column(name = "ad_user_id")
	private int ad_user_id;
	
	@Column(name = "name")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "description")
	private String descrip;
	
	@Column(name = "isactive")
	private boolean isactive;
	
	@Column(name = "rolename")
	private String roleName;

	public int getAd_user_id() {
		return ad_user_id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getDescrip() {
		return descrip;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public String getRoleName() {
		return roleName;
	}
	
	

}

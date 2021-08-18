package dz.itbridge.bloodbank.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dz.itbridge.bloodbank.api.model.MyUserDetails;
import dz.itbridge.bloodbank.api.model.User;
import dz.itbridge.bloodbank.api.repository.UserRepository;

@Service
public class MyUsrDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Utilisateur Non trouver : "+ userName));
		
		return user.map(MyUserDetails::new).get();
	}

}

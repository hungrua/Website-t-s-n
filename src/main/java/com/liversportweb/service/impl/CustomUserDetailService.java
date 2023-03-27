package com.liversportweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.liversportweb.DTO.UserDTO;
import com.liversportweb.converter.UserConverter;
import com.liversportweb.entity.UserEntity;
import com.liversportweb.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserConverter userConverter;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity entity = userRepository.findOneByUserName(username);
		if(entity!=null) {
			UserDTO user = userConverter.toDTO(entity);
			List<GrantedAuthority> grandList = new ArrayList<GrantedAuthority>();
			GrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
			grandList.add(authority);
			
			UserDetails userDetails = new User(username, user.getPassword(), grandList);
			return userDetails;
		}
		else {
			new UsernameNotFoundException("Can not Login");
		}
		
		return null;
	}

}

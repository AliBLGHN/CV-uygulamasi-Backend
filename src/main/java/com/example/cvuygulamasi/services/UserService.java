package com.example.cvuygulamasi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.cvuygulamasi.models.User;
import com.example.cvuygulamasi.repositories.IUserRepository;

@Service
public class UserService {

		IUserRepository userRepository;

		public UserService(IUserRepository userRepository) {
			this.userRepository = userRepository;
		}

		public List<User> getUsers() {
			return userRepository.findAllActiveUsers();
		}

		public User registerUser(User newUser) {
			Optional<User> user = userRepository.findUserByEmail(newUser.getEmail());
			if(user.isPresent()) {
				System.out.println("email var");
				return null;
			}
			System.out.println(newUser.getName());
			return userRepository.save(newUser);
		}

		public User getUser(Integer id) {
			return userRepository.findById(id).orElse(null);
		}
		
		public User loginUser(User loginUser) {
			Optional<User> user = userRepository.findUserByEmail(loginUser.getEmail());
			
			if(user.isPresent()) {
				User find = user.get();
				
				if(find.getPassword().equals(loginUser.getPassword())){
					System.out.println("email var");
					return find;
				}
				return null;
			}
			return null;
		}

		public Integer updateUser(Integer id, User newUser) {
			Optional<User> user = userRepository.findById(id);
			
			if(user.isPresent()) {
				User find = user.get();
				find.setName(newUser.getName());
				find.setSurname(newUser.getSurname());
				find.setEmail(newUser.getEmail());
				find.setPhone(newUser.getPhone());
				find.setGraduated_school(newUser.getGraduated_school());
				find.setGraduaed_year(newUser.getGraduaed_year());
				find.setOldCompanyName(newUser.getOldCompanyName());
				find.setOldCompanyExperienceYear(newUser.getOldCompanyExperienceYear());
				find.setOldCompanyWorkDescription(newUser.getOldCompanyWorkDescription());
				find.setAbout(newUser.getAbout());
				find.setIspdate(true);
				userRepository.save(find);
				return find.getId();
			}
			else
			return 0;
		}

		public void deleteUser(Integer id) {
			userRepository.deleteById(id);
			
		}

		
		
		
}

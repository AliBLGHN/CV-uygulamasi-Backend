package com.example.cvuygulamasi.repositories;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.cvuygulamasi.models.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
	
	public Optional<User> findUserByEmail(String email);
	
	@Query(value = "SELECT * FROM tbl_user WHERE isupdate = true", nativeQuery = true)
	List<User> findAllActiveUsers();
}

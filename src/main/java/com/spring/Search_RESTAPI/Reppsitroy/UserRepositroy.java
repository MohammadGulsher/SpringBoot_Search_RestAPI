package com.spring.Search_RESTAPI.Reppsitroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.Search_RESTAPI.Entity.User;

public interface UserRepositroy extends JpaRepository<User, Integer>{

	@Query(" SELECT p FROM 	User p WHERE p.firstName LIKE CONCAT('%',:query,'%')"+
	" OR p.lastName LIKE CONCAT('%',:query,'%')")
	
	List<User>searchUsers(String query);
	@Query
	( value = "SELECT * p FROM User p WHERE p.firstName LIKE CONCAT('%',:query,'%')"+
			"OR p.lastName LIKE CONCAT('%',:query,'%')"
	,nativeQuery = true)
		
	List<User>searchProductsSQl(String query);
}

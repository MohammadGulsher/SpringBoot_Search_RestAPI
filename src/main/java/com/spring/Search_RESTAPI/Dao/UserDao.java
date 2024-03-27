package com.spring.Search_RESTAPI.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Search_RESTAPI.Entity.User;
import com.spring.Search_RESTAPI.Reppsitroy.UserRepositroy;

@Repository
public class UserDao {

		@Autowired
		private UserRepositroy userRepositroy;
		/*
		 * insert the method...
		 */
		public User insertUser(User user)
		{
			User user1=userRepositroy.save(user);
			return user1;
		}
		/*
		 * Search RestApi..
		 */
		public List<User>searchProducts(String query)
		{
			List<User> products=userRepositroy.searchUsers(query);
			return products;
		}
}




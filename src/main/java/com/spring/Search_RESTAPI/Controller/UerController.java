package com.spring.Search_RESTAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Search_RESTAPI.Dao.UserDao;
import com.spring.Search_RESTAPI.Entity.User;

@RestController
public class UerController {

	@Autowired
	private UserDao userDao;
	/*
	 * insert the data...
	 */
	@PostMapping("/insert")
	public User createAdd(@RequestBody User user)
	{
		return userDao.insertUser(user);
	}
	/*
	 * Search Username....
	 */
	@GetMapping("/search")
	public ResponseEntity<List<User>> searchUser(@RequestParam("query")String query)
	{
		return ResponseEntity.ok(userDao.searchProducts(query));
	}
}



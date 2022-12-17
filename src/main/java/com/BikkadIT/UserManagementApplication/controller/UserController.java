package com.BikkadIT.UserManagementApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.UserManagementApplication.entities.City;
import com.BikkadIT.UserManagementApplication.entities.Country;
import com.BikkadIT.UserManagementApplication.entities.State;
import com.BikkadIT.UserManagementApplication.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping(value ="/getAllCountries", produces = "application/json")
	public ResponseEntity<List<Country>> getAllCountry()
	{
		List<Country> allCountries = userServiceI.getAllCountries();
		return new ResponseEntity<List<Country>>(allCountries,HttpStatus.OK);
		
	}
	
	@GetMapping(value ="/getAllStates/{countryId}", produces = "application/json")
	public ResponseEntity<List<State>> getAllStates(@PathVariable int countryId){
		List<State> allStates = userServiceI.getAllState(countryId);

	return new ResponseEntity<List<State>>(allStates, HttpStatus.OK);
		
	}
	
	@GetMapping(value ="/getAllcity/{stateId}", produces = "application/json")
	public ResponseEntity<List<City>> getAllcity(@PathVariable int stateId){
		
		List<City> allCities = userServiceI.getAllCities(stateId);
		
		return new ResponseEntity<List<City>>(allCities,HttpStatus.OK);
		
	}
}

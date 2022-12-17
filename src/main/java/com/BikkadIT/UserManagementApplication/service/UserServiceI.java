package com.BikkadIT.UserManagementApplication.service;

import java.util.List;

import com.BikkadIT.UserManagementApplication.entities.City;
import com.BikkadIT.UserManagementApplication.entities.Country;
import com.BikkadIT.UserManagementApplication.entities.State;

public interface UserServiceI {

	public List<Country> getAllCountries();

	public List<State> getAllState(int CountryId);
	
	public List<City> getAllCities(int stateId);
}

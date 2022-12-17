package com.BikkadIT.UserManagementApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.UserManagementApplication.entities.City;
import com.BikkadIT.UserManagementApplication.entities.Country;
import com.BikkadIT.UserManagementApplication.entities.State;
import com.BikkadIT.UserManagementApplication.repository.CityRepository;
import com.BikkadIT.UserManagementApplication.repository.CountryRepository;
import com.BikkadIT.UserManagementApplication.repository.StateRepository;

@Service
public class UserServiceImpl  implements UserServiceI {

	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public List<Country> getAllCountries() {
		 List<Country> findAll = countryRepository.findAll();
		return findAll;
	}


	@Override
	public List<State> getAllState(int CountryId) {
		List<State> findByCountryId = stateRepository.findByCountryId(CountryId);
		return findByCountryId;
	}


	@Override
	public List<City> getAllCities(int stateId) {
		List<City> findByStateId = cityRepository.findByStateId(stateId);
		return findByStateId;
	}

}

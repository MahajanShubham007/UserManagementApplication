package com.BikkadIT.UserManagementApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserManagementApplication.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}

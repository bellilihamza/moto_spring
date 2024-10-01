package com.nadhem.motos000.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nadhem.motos000.Type; 
@RepositoryRestResource(path = "type")
public interface TypeRepository extends JpaRepository< Type, Long> {

}

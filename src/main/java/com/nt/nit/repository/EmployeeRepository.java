package com.nt.nit.repository;

import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nt.nit.entity.Employee;

@Repository
/*
 * public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 * 
 * }
 */

public interface EmployeeRepository extends MongoRepository<Employee,Long> {

}
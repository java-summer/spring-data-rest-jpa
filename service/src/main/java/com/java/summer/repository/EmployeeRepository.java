package com.java.summer.repository;

import com.java.summer.domain.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource (collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends
                                     PagingAndSortingRepository<Employee, UUID> {

}

package tn.amin.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import tn.amin.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    @Transactional
    void deleteEmployeeById(long id);

    Optional<Employee> findEmployeeById(Long id);
}

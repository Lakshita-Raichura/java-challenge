package jp.co.axa.apidemo.services;

import jp.co.axa.apidemo.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Long employeeId, Employee employee);

    Boolean deleteEmployee(Long employeeId);
}

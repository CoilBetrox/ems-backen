package com.betroxcoil.ems.mapper;

import com.betroxcoil.ems.dto.EmployeeDto;
import com.betroxcoil.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return  new EmployeeDto(
                employee.getId(),
                employee.getFirtsName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getFirstName(),
                employeeDto.getEmail()
        );
    }
}

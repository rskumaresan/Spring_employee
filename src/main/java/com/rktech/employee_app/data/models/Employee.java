package com.rktech.employee_app.data.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;
    private String firstName;

    public Employee() {

    }
    @Override
    public String toString() {
        return "Employee{" +
                "Employee id=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(employeeId, employee.employeeId) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastname, employee.lastname) && Objects.equals(phoneNumber, employee.phoneNumber) && Objects.equals(email, employee.email) && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastname, phoneNumber, email, salary, department);
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private String lastname;
    private String phoneNumber;
    private String email;
    private double salary;
    @Enumerated(EnumType.STRING)
    private Department department;
}

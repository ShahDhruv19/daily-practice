package com.practise.streamss;

//import java.lang.annotation.Inherited;

public class Employee
{

    private int empId;
    private String dept;
    private String name;
    private long salary;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int empId, String dept, String name, long salary) {
        this.empId = empId;
        this.dept = dept;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

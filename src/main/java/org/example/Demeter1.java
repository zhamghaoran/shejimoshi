package org.example;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> employees = new ArrayList<>();
        for (int i = 0;i < 10;i ++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id：" + i);
            employees.add(employee);
        }
        return employees;
    }
    public void printEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("----学院员工-----");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}
class SchoolManager {
    public List<Employee> getAllEmployee () {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 1;i <= 5;i ++) {
            Employee employee = new Employee();
            employee.setId("学校员工id: " + i);
            employees.add(employee);
        }
        return employees;
    }
    void printAllEmployee(CollegeManager sub) {
        //分析问题
        // 1.这里的CollegeManger不是SchoolManger的直接朋友
        // 2.CollegeManger是以局部变量的方式出现在SchoolManger
        //3.违背了迪米特原则
        //获取到学院员工
//        List<CollegeEmployee> list = sub.getAllEmployee();
//        System.out.println("------学院员工-------");
//        for (var i : list) {
//            System.out.println(i.getId());
//        }
        sub.printEmployee();
        List<Employee> list1 = this.getAllEmployee();
        System.out.println("------学校员工------");
        for (var i : list1) {
            System.out.println(i.getId());
        }
    }
}

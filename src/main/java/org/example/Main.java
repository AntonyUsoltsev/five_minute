package org.example;

import org.example.sem_25_03_23.Second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Second second = new Second();
        Second.Worker worker1 = new Second.Worker("Nikita", "Jun", 20000);
        Second.Worker worker2 = new Second.Worker("Dima", "PM", 30000);

        Second.Worker worker3 = new Second.Worker("Eric", "Seo", 50000);
        Second.Worker worker4 = new Second.Worker("Yarik", "Frontend", 100000);
        Second.Worker worker5 = new Second.Worker("Tony", "Director", 300000);

        List<Second.Worker> workList1 = new ArrayList<>();
        workList1.add(worker1);
        workList1.add(worker2);
        Second.Department department1 = new Second.Department("Company", workList1, 12);

        List<Second.Worker> workList2 = new ArrayList<>();
        workList2.add(worker3);
        workList2.add(worker4);
        workList2.add(worker5);
        Second.Department department2 = new Second.Department("Company", workList2, 20);

        List<Second.Department> depList = new ArrayList<>();
        depList.add(department1);
        depList.add(department2);
        Second.Firm firm = new Second.Firm(depList);

        System.out.println(Second.departmentSalary(department1));
        System.out.println(Second.departmentSalary(department2));
        System.out.println(Second.jobTitles(firm));
        System.out.println(Second.bigDepartment(firm,2));
        System.out.println(Second.cheapProfessions(firm));
        System.out.println(Arrays.toString(Second.recentDepartments(firm)));
    }
}
package com.github.kubrabal;

import com.github.kubrabal.model.Department;
import com.github.kubrabal.model.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John1", "Doe1", "Department1");
        Person p2 = new Person("John2", "Doe2", "Department2");
        Person p3 = new Person("John3", "Doe3", "Department3");

        Department department = new Department();

        department.addPerson(p1);
        department.addPerson(p2);
        department.addPerson(p3);

        List<Person> personList = department.getPersonList();
        for(Person person: personList) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getDepartment());
        }
    }
}
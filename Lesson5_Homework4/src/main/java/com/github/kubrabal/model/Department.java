package com.github.kubrabal.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Person> personList;

    public Department() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}

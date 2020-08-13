package com.company;
import java.io.Serializable;
import java.util.Objects;
public class Neighbour implements Comparable<Neighbour>, Serializable {
    private String surname;
    private String name;
    private String secondName;
    private Integer age;
    private String married;
    private String docNumber;
    public Neighbour(String surname, String name, String secondName, int age, String married, String docNumber) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.married = married;
        this.docNumber = docNumber;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public String getMarried() {
        return married;
    }
    public String getPassport() {
        return docNumber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbour neighbour = (Neighbour) o;
        return docNumber.equals(neighbour.docNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(docNumber);
    }
    @Override
    public int compareTo(Neighbour o) {
        String fullName = surname + " " + name + " " + secondName;
        String fullName2 = o.getSurname() + " " + o.getName() + " " + o.getSecondName();
        int result = this.age.compareTo(o.age);
        if(result == 0) {
            result = fullName.compareTo(fullName2);
        }
        return result;
    }
    @Override
    public String toString() {
        return  surname + ";" +
                name + ";" +
                secondName + ";" +
                age + ";" +
                married + ";" +
                docNumber;
    }
}
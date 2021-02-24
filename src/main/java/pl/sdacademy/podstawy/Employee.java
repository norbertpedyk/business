package pl.sdacademy.podstawy;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  double getSalary() {
        return salary;
    }

    public Employee(String firstName, String lastName, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String toString() {
        return firstName + " " + lastName + "\n";
    }


    public boolean isRetired(LocalDate referanceDate, Country country) {
        Period agePeriod = Period.between(birthDate,referanceDate);
        int age = agePeriod.getYears();
        int retireAge = country.getRetirementAge();
        return age >= retireAge;

    }
}

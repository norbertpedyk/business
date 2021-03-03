package pl.sdacademy.podstawy.loading;

import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String lastName;
    private LocalDate birthDate;
    private Double weight;
    private Double height;


    public Person(String firstName, String lastName, LocalDate birthDate, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }
            //wykozystanie konstruktor w konstruktorze - this()
    public Person(String firstName, String lastName) {
        this(firstName,lastName,LocalDate.of(2000, 1, 1),0.0,0.0 );
    }

    public Person(LocalDate birthDate, double weight, double height) {
        this("","",birthDate,weight,height);
    }


    public Person(String birthDate, double weight, double height) {
        this("","",LocalDate.parse(birthDate),weight,height);
    }

    public static void main(String[] args) {
        Person person = new Person("2010-01-09",90.0,1);
    }
}

package pl.sdacademy.podstawy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country(65, "Poland");
        Country germany = new Country(67, "Germany");

        for (Country country : new Country[]{poland, germany}) {
            System.out.println(country);
        }
        Company terravita = new Company(poland, "Terrawita");
        Company volkswagen = new Company(germany, "Volkswagen");

        Employee employee1 = new Employee("Hans", "M\u00fcller", LocalDate.of(1950, 12, 10));
        Employee employee2 = new Employee("Helga", "Schweinsteiger", LocalDate.of(1985, 5, 13));
        Employee employee3 = new Employee("Jan", "Nowak", LocalDate.of(1995, 1, 12));
        Employee employee4 = new Employee("Adam", "Kowalski", LocalDate.of(1965, 4, 28));


        volkswagen.setEmployees(employee1, employee2);
        terravita.setEmployees(employee3, employee4);


        terravita.setEmployees(null);


        for (Company company : new Company[]{terravita, volkswagen}) {
            for (Employee employee : company.getEmployees())
                System.out.printf("Kraj: %s Nazwa firmy: %s, Pracownik: %s", company.getCountry(), company, employee);
        }

        for (Employee employee : volkswagen.getRetiredEmployees(LocalDate.of(2040,3,4))) {
            System.out.println(employee.toString());
        }

        for (Employee employee : volkswagen.getRetiredEmployees() ){
            System.out.println("NOW: " + employee);
        }

        for (Company company : new Company[]{terravita,volkswagen}) {
            for (Employee employee : company.getEmployees()) {
                employee.setSalary(employee.getSalary()+100);
                System.out.println((employee.getLastName() + " salary: " + employee.getSalary()));
            }
        }
    }
}

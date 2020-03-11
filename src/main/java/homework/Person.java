package homework;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Person implements Comparable<Person>, Serializable {
    private int taxNumber;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(int taxNumber, String firstName, String lastName, LocalDate birthDate) {
        this.taxNumber = taxNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void inputNewPerson() throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter: TaxNumber (Only digits)");
            this.setTaxNumber(Integer.parseInt(scanner.nextLine()));

            System.out.println("Please enter: First name");
            this.setFirstName(scanner.nextLine());

            System.out.println("Please enter: Last name");
            this.setLastName(scanner.nextLine());

            System.out.println("Please enter: Birth date in format 'yyyy/mm/d'");
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/d");
            LocalDate date = LocalDate.parse(scanner.nextLine(), dateFormat);
            this.setBirthDate(date);
        } catch (InputMismatchException | NumberFormatException | DateTimeParseException e) {
            throw new InputException("Please input correct data");
        }
    }

    public void outPut() {
        System.out.println(toString());
    }

    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return taxNumber == person.taxNumber &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxNumber, firstName, lastName, birthDate);
    }

    public int compareTo(Person o) {
        return this.birthDate.compareTo(o.birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "taxNumber=" + taxNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
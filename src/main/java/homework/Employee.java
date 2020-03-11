package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Employee extends Person {
    private LocalDate employmentDate;
    private int wage;

    public Employee(int taxNumber, String firstName, String lastName, LocalDate birthDate,
                    LocalDate employmentDate, int wage) {
        super(taxNumber, firstName, lastName, birthDate);
        this.employmentDate = employmentDate;
        this.wage = wage;
    }

    public Employee() {
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void inputNewEmployee() throws Exception {
        super.inputNewPerson();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter: Employment date in the following format 'yyyy/mm/d'");
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
            LocalDate date = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
            this.setEmploymentDate(date);

            System.out.println("Please enter: employee wage");
            this.setWage(scanner.nextInt());
        } catch (InputMismatchException | NumberFormatException | DateTimeParseException e) {
            throw new InputException("Incorrect data input");
        }
    }

    @Override
    public void outPut() {
        super.outPut();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return wage == employee.wage &&
                Objects.equals(employmentDate, employee.employmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employmentDate, wage);
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "Employee{" +
                "employmentDate=" + employmentDate +
                ", wage=" + wage +
                "} ";
    }
}
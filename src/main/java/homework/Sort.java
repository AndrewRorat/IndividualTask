package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    private static final int REQUIRED_AGE = 40;
    private static final int REQUIRED_WAGE = 1000;

    public static List<Employee> getEmployeesWithRequiredAgeAndWage(ArrayList<Employee> employees) {
        return employees.stream().filter(m -> m.getAge() > REQUIRED_AGE && m.getWage() < REQUIRED_WAGE)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static List<Person> sortByFirstAndLastName(ArrayList<Person> personList) {
        return personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
package homework;

import org.testng.annotations.DataProvider;

import java.time.LocalDate;
import java.util.ArrayList;

public class Collection {

    public static ArrayList<Person> personList() {
        var people = new ArrayList<Person>();
        people.add(new Person(2287, "Igor", "Proton",
                LocalDate.of(1992, 2, 5)));
        people.add(new Employee(5548, "Taras", "Larsky",
                LocalDate.of(1952, 12, 22),
                LocalDate.of(2015, 5, 30), 800));
        people.add(new Employee(8448, "Anna", "Potosjd",
                LocalDate.of(1987, 2, 25),
                LocalDate.of(2013, 2, 20), 2550));
        people.add(new Employee(2658, "John", "Travolta",
                LocalDate.of(1990, 3, 5),
                LocalDate.of(2014, 3, 12), 480));
        people.add(new Person(2287, "Barbara", "Kleiton",
                LocalDate.of(1996, 5, 7)));
        people.add(new Employee(2757, "Klark", "Jerryson",
                LocalDate.of(1958, 10, 17),
                LocalDate.of(2012, 2, 20), 500));
        people.add(new Employee(4657, "Jerry", "Tommason",
                LocalDate.of(1995, 12, 19),
                LocalDate.of(2011, 4, 21), 3200));
        return people;
    }

    @DataProvider(name = "sortingAge")
    public Object[][] employeeSorting() {
        return new Object[][]{{new Employee(8564, "Tomas", "Spears",
                LocalDate.of(1965, 11, 2),
                LocalDate.of(2015, 1, 3), 500)}};
    }

    @DataProvider(name = "forNamesLists")
    public Object[][] firstAndLastNameList() {
        var sortedList = new ArrayList<Person>();
        sortedList.add(new Employee(8448, "Anna", "Potosjd",
                LocalDate.of(1987, 2, 25),
                LocalDate.of(2013, 2, 20), 2550));
        sortedList.add(new Person(2287, "Barbara", "Kleiton",
                LocalDate.of(1996, 5, 7)));
        sortedList.add(new Person(2287, "Igor", "Proton",
                LocalDate.of(1992, 2, 5)));
        sortedList.add(new Employee(4657, "Jerry", "Tommason",
                LocalDate.of(1995, 12, 19),
                LocalDate.of(2011, 4, 21), 3200));
        sortedList.add(new Employee(2658, "John", "Travolta",
                LocalDate.of(1990, 3, 5),
                LocalDate.of(2014, 3, 12), 480));
        sortedList.add(new Employee(2757, "Klark", "Jerryson",
                LocalDate.of(1958, 10, 17),
                LocalDate.of(2012, 2, 20), 500));
        sortedList.add(new Employee(5548, "Taras", "Larsky",
                LocalDate.of(1952, 12, 22),
                LocalDate.of(2015, 5, 30), 800));

        var employee = new ArrayList<Person>();
        employee.add(new Person(2287, "Igor", "Proton",
                LocalDate.of(1992, 2, 5)));
        employee.add(new Employee(5548, "Taras", "Larsky",
                LocalDate.of(1952, 12, 22),
                LocalDate.of(2015, 5, 30), 800));
        employee.add(new Employee(8448, "Anna", "Potosjd",
                LocalDate.of(1987, 2, 25),
                LocalDate.of(2013, 2, 20), 2550));
        employee.add(new Employee(2658, "John", "Travolta",
                LocalDate.of(1990, 3, 5),
                LocalDate.of(2014, 3, 12), 480));
        employee.add(new Person(2287, "Barbara", "Kleiton",
                LocalDate.of(1996, 5, 7)));
        employee.add(new Employee(2757, "Klark", "Jerryson",
                LocalDate.of(1958, 10, 17),
                LocalDate.of(2012, 2, 20), 500));
        employee.add(new Employee(4657, "Jerry", "Tommason",
                LocalDate.of(1995, 12, 19),
                LocalDate.of(2011, 4, 21), 3200));
        return new Object[][]{{sortedList, employee}};
    }

    @DataProvider(name = "ageAndWageList")
    public Object[][] forAgeWage() {
        var sortedList = new ArrayList<Employee>();
        sortedList.add(new Employee(2757, "Klark", "Jerryson",
                LocalDate.of(1958, 10, 17),
                LocalDate.of(2012, 2, 20), 500));
        sortedList.add(new Employee(5548, "Taras", "Larsky",
                LocalDate.of(1952, 12, 22),
                LocalDate.of(2015, 5, 30), 800));

        var employees = new ArrayList<Employee>();
        employees.add(new Employee(8448, "Anna", "Potosjd",
                LocalDate.of(1987, 2, 25),
                LocalDate.of(2013, 2, 20), 2550));
        employees.add(new Employee(4657, "Jerry", "Tommason",
                LocalDate.of(1995, 12, 19),
                LocalDate.of(2011, 4, 21), 3200));
        employees.add(new Employee(2658, "John", "Travolta",
                LocalDate.of(1990, 3, 5),
                LocalDate.of(2014, 3, 12), 480));
        employees.add(new Employee(2757, "Klark", "Jerryson",
                LocalDate.of(1958, 10, 17),
                LocalDate.of(2012, 2, 20), 500));
        employees.add(new Employee(5548, "Taras", "Larsky",
                LocalDate.of(1952, 12, 22),
                LocalDate.of(2015, 5, 30), 800));
        return new Object[][]{{sortedList, employees}};
    }
}
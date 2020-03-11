package homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CollectionToText {

    public static void main(String[] args) throws IOException {

        var employeeList = new ArrayList<Person>();
        employeeList.add(new Person(2287, "Igor", "Proton",
                LocalDate.of(1992, 2, 5)));
        employeeList.add(new Employee(5548, "Taras", "Larsky",
                LocalDate.of(1952, 12, 22),
                LocalDate.of(2015, 5, 30), 800));
        employeeList.add(new Employee(8448, "Anna", "Potosjd",
                LocalDate.of(1987, 2, 25),
                LocalDate.of(2013, 2, 20), 2550));
        employeeList.add(new Employee(2658, "John", "Travolta",
                LocalDate.of(1990, 3, 5),
                LocalDate.of(2014, 3, 12), 480));
        employeeList.add(new Person(2287, "Barbara", "Kleiton",
                LocalDate.of(1996, 5, 7)));
        employeeList.add(new Employee(2757, "Klark", "Jerryson",
                LocalDate.of(1958, 10, 17),
                LocalDate.of(2012, 2, 20), 500));
        employeeList.add(new Employee(4657, "Jerry", "Tommason",
                LocalDate.of(1995, 12, 19),
                LocalDate.of(2011, 4, 21), 3200));


        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("D:\\empllist.txt")));
        String arrayToWrite = String.valueOf(employeeList);
        writer.write(arrayToWrite);
        writer.close();
    }
}
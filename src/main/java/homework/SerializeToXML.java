package homework;

import java.beans.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerializeToXML {

    private static final String FILE_PATH = "D:\\empex.xml";

    public SerializeToXML() {
    }

    public List<Person> personList(){
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
        return employee;
    }

        public void serializeToXML()throws IOException {
            XMLEncoder encoder;
            try {
                encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(FILE_PATH)));
            } catch (FileNotFoundException e) {
                throw new FileNotFoundException("ERROR: While Creating the File empex.xml");
            }

            encoder.setPersistenceDelegate(LocalDate.class,
                    new PersistenceDelegate() {
                        @Override
                        protected Expression instantiate(Object obj, Encoder enc) {
                            LocalDate localDate = (LocalDate) obj;
                            return new Expression(localDate,
                                    LocalDate.class,
                                    "of",
                                    new Object[] {localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth()});
                        }
                    });

            encoder.writeObject(personList());
            encoder.close();

        }
        public void deserializeFromXML() throws IOException {
            XMLDecoder decoder;
            try {
                decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(FILE_PATH)));
            } catch (FileNotFoundException e) {
                throw new FileNotFoundException("ERROR: While reading File: empex.xml");
            }

            System.out.println(decoder.readObject());
        }
}
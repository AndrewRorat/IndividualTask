package simple_Test;

import homework.Collection;
import homework.Employee;
import homework.Sort;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AgeAndWageSortingTest {

    @Test(description = "Test verify correct output of employees with age more then '40' years and wage less then 1000",
            dataProvider = "ageAndWageList", dataProviderClass = Collection.class)
    public void sortingAgeAndWageTest(ArrayList<Employee> expectedList, ArrayList<Employee> actualList) {

        //arrange
        var expectedResult = expectedList;

        //act
        List<Employee> actualResult = Sort.getEmployeesWithRequiredAgeAndWage(actualList);

        //assert
        Assert.assertEquals(actualResult, expectedResult, "Actual and expected results are not equals.");
    }
}
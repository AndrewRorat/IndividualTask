package simple_Test;

import homework.Employee;
import homework.Collection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeTest {

    @Test(dataProvider = "sortingAge", dataProviderClass = Collection.class,
            description = "Test verify employees full age")
    public void testAge(Employee employee) {

        //arrange
        int expectedResult = 54;

        //act
        int actualResult = employee.getAge();

        //assert
        Assert.assertEquals(actualResult, expectedResult,
                String.format("Actual: %s and Expected: %s result does not match.", actualResult, expectedResult));
    }
}
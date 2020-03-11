package simple_Test;

import homework.Collection;
import homework.Person;
import homework.Sort;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastNameSortingTest {

    @Test(dataProvider = "forNamesLists", dataProviderClass = Collection.class,
    description = "Test verify correct sorting by First and Last Name")
    public void sortingByFirstAndLastNameTest(ArrayList<Person> expectedList, ArrayList<Person> personsList) {
        //arrange
        List<Person> expectedResult = expectedList;

        //act
        List<Person> actualResult = Sort.sortByFirstAndLastName(personsList);

        //assert
        Assert.assertEquals(actualResult, expectedResult, "Actual and expected result are not equals");
    }
}
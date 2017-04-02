package FindDistance;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static FindDistance.FindDistance.findDistance;


public class FindDistanceTest {

    @DataProvider(name = "test")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {new int[]{23, 45, 34, 12, 45, 4, 38, 56, 2, 49, 100}, 3},
                {new int[]{-23, 45, 34, 12, 45, 4, 38, 56, 2, 49, -100}, 10},
                {new int[]{23, 45, 23}, 2},
                {new int[]{15, -3, 45, 23, 5, 20, 55}, 3},
                {new int[]{1, 2}, 1},
                {new int[]{1, 45, 34, 12, 45, 4, 38, 56, 2, 49, 2}, 8},
                {new int[]{45, 34, 12, 45, 4, 38, 56, 2, 1, 2}, 1},
        };
    }

    @Test(dataProvider = "test")
    public void testFindDistance(int[] massif, int expectedDistance) {
        Assert.assertEquals(expectedDistance, findDistance(massif));
    }

}

import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        int actualResult = Week4.max2Int(2,5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMax2Int2(){
        int actualResult = Week4.max2Int(2,5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMax2Int3(){
        int actualResult = Week4.max2Int(2,5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMax2Int4(){
        int actualResult = Week4.max2Int(2,5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMax2Int5(){
        int actualResult = Week4.max2Int(2,5);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray1(){
        int[] array = {1, 3, 5, 7};
        int actualResult = Week4.minArray(array);
        int expectedResult =1;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray2(){
        int[] array = {1, 3, 5, 7};
        int actualResult = Week4.minArray(array);
        int expectedResult =1;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray3(){
        int[] array = {1, 3, 5, 7};
        int actualResult = Week4.minArray(array);
        int expectedResult =1;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray4(){
        int[] array = {1, 3, 5, 7};
        int actualResult = Week4.minArray(array);
        int expectedResult =1;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMinArray5(){
        int[] array = {1, 3, 5, 7};
        int actualResult = Week4.minArray(array);
        int expectedResult =1;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI1(){
        double weight = 52;
        double height = 1.65;
        String actualResult = Week4.calculateBMI(weight,height);
        String expectedResult = "Bình thường";
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI2(){
        double weight = 50;
        double height = 1.65;
        String actualResult = Week4.calculateBMI(weight,height);
        String expectedResult = "Thiếu cân";
        Assert.assertEquals(expectedResult,actualResult);}

    @Test
    public void testCalculateBMI3(){
        double weight = 80;
        double height = 1.7;
        String actualResult = Week4.calculateBMI(weight,height);
        String expectedResult = "Béo phì";
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI4(){
        double weight = 52;
        double height = 1.65;
        String actualResult = Week4.calculateBMI(weight,height);
        String expectedResult = "Thiếu cân";
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalculateBMI5(){
        double weight = 52;
        double height = 1.65;
        String actualResult = Week4.calculateBMI(weight,height);
        String expectedResult = "Thiếu cân";
        Assert.assertEquals(expectedResult,actualResult);
    }
} 
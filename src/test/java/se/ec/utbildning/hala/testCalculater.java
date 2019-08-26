package se.ec.utbildning.hala;

import org.junit.Assert;
import org.junit.Test;

public class testCalculater {
    @Test
    public void testAddition(){
        double num1= 5;
        double num2= 6;
        //Act
        double result= 11;
        //Assert
        Assert.assertEquals(result,Calculater.addition(num1,num2),0);

    }
    @Test
    public void testSub(){
        double num1= 6;
        double num2= 4;
        //Act
        double result= 2;
        //Assert
        Assert.assertEquals(result,Calculater.subtraction(num1,num2),0);

    }
    @Test
    public void testMultiplication(){
        double num1= 5;
        double num2= 6;
        //Act
        double result= 30;
        //Assert
        Assert.assertEquals(result,Calculater.multiplication(num1,num2),0);

    }
    @Test
    public void testDivision(){
        double num1= 30;
        double num2= 6;
        //Act
        double result= 5;
        //Assert
        Assert.assertEquals(result,Calculater.division(num1,num2),0);

    }
}


import org.junit.Assert;
import org.junit.Test;

public class testMainClass {

    @Test
    public void testGetBiggestString(){
        String str1="abc";
        String str2="abcd";
        //Act
        String actual = MainClass.getBiggestString(str1,str2);
        //Assert
        Assert.assertEquals(str2,actual);
    }

}

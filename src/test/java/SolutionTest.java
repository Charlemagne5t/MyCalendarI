import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        MyCalendar myCalendar = new MyCalendar();
        Assert.assertTrue(myCalendar.book(10, 20));
        Assert.assertFalse(myCalendar.book(15, 25));
        Assert.assertTrue(myCalendar.book(20, 30));

    }
    @Test
    public void test2() {
        MyCalendar myCalendar = new MyCalendar();
        Assert.assertTrue(myCalendar.book(47, 50));
        Assert.assertTrue(myCalendar.book(33, 41));
        Assert.assertFalse(myCalendar.book(39, 45));
        Assert.assertFalse(myCalendar.book(33, 42));
        Assert.assertTrue(myCalendar.book(25, 32));
        Assert.assertFalse(myCalendar.book(26, 35));
        Assert.assertTrue(myCalendar.book(19, 25));
        Assert.assertTrue(myCalendar.book(3, 8));
        Assert.assertTrue(myCalendar.book(8, 13));
        Assert.assertFalse(myCalendar.book(18, 27));

    }
    //[null,true,true,false,false,true,false,true,true,true,false]
}

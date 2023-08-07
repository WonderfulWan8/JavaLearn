import com.imooc.junit.Caculartor;
import org.junit.Test;

public class CaculatorTest {
    private Caculartor cal = new Caculartor();
//    1.与原方法保持一致
//      2.在原方法加个test
    @Test
    public void testAdd(){
        System.out.println(cal.add(1,2));
    }
    @Test
    public void test(){
        System.out.println(cal.add(3,4));
    }
    @Test
    public void test2(){
        System.out.println(cal.divide(1,2));
    }
    @Test
    public void test3(){
        System.out.println(cal.divide(1,0));
    }

}

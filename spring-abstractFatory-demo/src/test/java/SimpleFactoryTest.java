import junit.framework.TestCase;

public class SimpleFactoryTest extends TestCase {

    public static void main(String[] args) {
       // String band = "蒙牛";
       String band = "伊利";
        //String band = "特仑苏";
        Milk milk = SimpleFactory.createMilk(band);
        if(milk!=null){
            System.out.println(milk.info());
        }else{
            System.out.println("查找不到");
        }

    }
}
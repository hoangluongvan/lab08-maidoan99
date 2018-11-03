package Bai2;

/**
 * Ep kieu khong hop le
 */
public class ClassCast {
    public static void testClassCastException() throws ClassCastException{
        Object i = Integer.valueOf(42);
        try {
            String s = (String) i;
        }catch (ClassCastException e){
            System.out.println("Ep kieu khong hop le");
        }
    }

    public static void main(String[] args) {
        testClassCastException();
    }
}

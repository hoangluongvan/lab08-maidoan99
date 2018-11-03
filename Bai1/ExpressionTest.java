package Bai1;

public class ExpressionTest {

    public static void main(String[] args) {
        try {
            Numeral numeral1 = new Numeral(10);
            Numeral numeral2 = new Numeral(1);
            Numeral numeral3 = new Numeral(2);
            Numeral numeral4 = new Numeral(3);

            Square res = new Square(new Addition(new Subtraction(new Square(numeral1), numeral2), new Multiplication(numeral3, numeral4)));
            System.out.println(res + " = " + res.evaluate());

            //Kiem tra loi chia cho 0
            Numeral numeral5 = new Numeral(18);
            Numeral numeral6 = new Numeral(0);

            Square res1 = new Square(new Addition(new Subtraction(new Square(numeral1), numeral2), new Division(numeral5, numeral6)));
            System.out.println(res1 + " = " + res1.evaluate());
        }catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
    }
}
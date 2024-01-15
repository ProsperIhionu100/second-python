public class work1 {

    public static void main(String[] args) {
        try {
            String name = "prosper";
            int num1 = 23;
            int cal = name + num1;
            System.out.println(cal);
        } catch (ArithmeticException e) {
            System.out.println("except");
        }
    }
    
}
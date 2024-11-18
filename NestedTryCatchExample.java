public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block.");
            try {
                int result = 10 / 0;  
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: Division by zero!");
            }
        } catch (Exception e) {
            System.out.println("Outer catch block: General exception.");
        }
    }
}

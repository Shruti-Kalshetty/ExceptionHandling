public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 25;              
            String str = null;
            System.out.println(str.length());  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object!");
        }
        
        System.out.println("Program continues after exception handling.");
    }
}


public class ThrowExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15);  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

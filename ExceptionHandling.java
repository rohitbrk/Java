public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 30;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error - " + e.getClass());
        } finally {
            System.out.println("bye");
        }
    }
}

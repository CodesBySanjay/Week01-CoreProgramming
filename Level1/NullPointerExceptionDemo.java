public class NullPointerExceptionDemo {
    public static void generateNPE() {
        String s = null;
        System.out.println(s.length());
    }
    public static void handleNPE() {
        try {
            String s = null;
            s.length();
        } catch(NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }
    public static void main(String[] args) {
        try {
            generateNPE();
        } catch(NullPointerException e) {
            handleNPE();
        }
    }
}
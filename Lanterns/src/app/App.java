package app;

public class App {
    public static void main(String[] args) throws Exception {
        // trapezoid();
        // gap();
        // trapezoid();
        // bulbPart();
        // base();
        // trapezoid();
        // gap();
        // trapezoid();
        // columnPart();
        // bulbPart();
        // bulbPart();
        // columnPart();
        // columnPart();
        for(int line = 1; line <= numLines; line++){
            for (int slash = 1; slash <= ((-4 * line) + 20); slash++) {
                System.out.print('/');
            }
            for (int star = 1; star <= (8 * line - 8); star++) {
                System.out.print('*');
            }
            for (int bslash = 1; bslash <= ((-4 * line) + 20); bslash++) {
                System.out.print('\\');
            }
            System.out.println();
        }        
    }
    public static final int numLines = 5;
    public static void trapezoid(){
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    public static void gap() {
        System.out.println();
    }
    public static void base() {
        System.out.println("*************");
    }
    public static void bulbPart(){
        System.out.println("* | | | | | *");
    }
    public static void columnPart(){
        System.out.println("    *****");
    }
}
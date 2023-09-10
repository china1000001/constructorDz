public class Main {
    public static void main(String[] args) {
        Class c = new Class(123, "word!", new int[3]);
        c.massiv[0] = 3;
        c.massiv[1] = 5;
        c.massiv[2] = 6;
        System.out.println(c);
    }
}
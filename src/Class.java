import java.util.Arrays;

public class Class {
    int number;
    String word;
    int[] massiv;

    public Class() {
    }

    public Class(int number, String word, int[] massiv) {
        this.number = number;
        this.word = word;
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "Class " +"\n"+
                "number= " + number +"\n"+
                "word= " + word + "\n" +
                "massiv= " + Arrays.toString(massiv);
    }
}

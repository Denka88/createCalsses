public class Main {
    public static void main(String[] args) {

        Vector firstVector = new Vector(2, 2, 2);
        Vector secondVector = new Vector(2, 2, 2);

        System.out.println(secondVector.lengthVector());
        System.out.println(secondVector);
        System.out.println(Vector.scalar(firstVector, secondVector));

    }
}
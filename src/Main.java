public class Main {
    public static void main(String[] args) {

        Vector firstVector = new Vector(8, 6, 4);
        Vector secondVector = new Vector();

        secondVector.setX(4);
        secondVector.setY(6);
        secondVector.setZ(8);

        scalar(firstVector, secondVector);

    }

    public static int scalar(Vector first, Vector second){

        return first.getX() * second.getX() + first.getY() * second.getY() + first.getZ() * second.getZ();

    }
}
public class Vector {

    private int x;
    private int y;
    private int z;

    public Vector() {

    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    //    Длина вектора Задача 1
    public int lengthVector() {

        return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

    }

    public static String scalar(Vector first, Vector second) {
        System.out.printf("Vector{%d, %d, %d}", first.getX(), first.getY(), first.getZ());
        return "Vector scalar{ " + first.getX() * second.getX() + first.getY() * second.getY() + first.getZ() * second.getZ() + "}";

    }

    /**
     * Метод для вычисления векторного произведения двух векторов
     *
     * @param first  Первый вектор
     * @param second Второй вектор
     * @return Возврпает векторное произведение двух векторов
     */
    public Vector vectorMult(Vector first, Vector second) {

        int a = first.getY() * second.getZ() - first.getZ() * second.getY();
        int b = first.getZ() * second.getX() - first.getX() * second.getZ();
        int c = first.getX() * second.getY() - first.getY() * second.getX();

        System.out.printf(new Vector(a, b, c) + "Vector{%d, %d, %d}", a, b, c);

        return new Vector(a, b, c);

    }


    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

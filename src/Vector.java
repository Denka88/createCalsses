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


    /**
     *Метод для вычисления длины вектора
     * 
     * @return Возвращает длину вектора
     */
    public int lengthVector() {

        return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

    }

    /**
     * Метод для вычисления скалаярного произведения двух векторов
     * 
     * @param first Первый вектор
     * @param second Второй вектор
     * @return Возвращает скалярное произвеедение двух векторов
     */
    public static int scalar(Vector first, Vector second) {
        
        return first.getX() * second.getX() + first.getY() * second.getY() + first.getZ() * second.getZ();

    }

    /**
     * Метод для вычисления векторного произведения двух векторов
     *
     * @param first  Первый вектор
     * @param second Второй вектор
     * @return Возврпает векторное произведение двух векторов
     */
    public static Vector vectorMult(Vector first, Vector second) {

        int a = first.getY() * second.getZ() - first.getZ() * second.getY();
        int b = first.getZ() * second.getX() - first.getX() * second.getZ();
        int c = first.getX() * second.getY() - first.getY() * second.getX();

        return new Vector(a, b, c);

    }
    
    public static void sumVector(Vector first, Vector second) {
        
        int sumX = first.getX() + second.getX();
        int sumY = first.getY() + second.getY();
        int sumZ = first.getZ() + second.getZ();

        System.out.println("Сумма векторов: " + sumX + ", " + sumY + ", " + sumZ);
        
    }

    public static void diffVector(Vector first, Vector second) {

        int diffX = first.getX() - second.getX();
        int diffY = first.getY() - second.getY();
        int diffZ = first.getZ() - second.getZ();

        System.out.println("Разность векторов: " + diffX + ", " + diffY + ", " + diffZ);

    }

    /**
     * Метод для вычисления длины вектора
     *
     * @return Возвращает длину вектора
     */
    public static void cos(Vector first, Vector second) {

        double cosTheta = (double) scalar(first, second) / (Math.abs(first.lengthVector()) * Math.abs(second.lengthVector()));
        System.out.println(cosTheta);

    }


    @Override
    public String toString() {
        return "Vector {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {

        Vector firstVector = new Vector(1, 2, 3);
        Vector secondVector = new Vector(4, 5, 6);

//        Выводим координаты векторов
        System.out.println(firstVector);
        System.out.println(secondVector);

//        Выводим длины векторов
        System.out.println("Длина вектора: " + firstVector.lengthVector());
        System.out.println("Длина вектора: " + secondVector.lengthVector());
        
//        Скалярное произведение
        System.out.println("Скалярное произведение: " + Vector.scalar(firstVector, secondVector));
        
//        Векторное произведение
        System.out.println("Векторное произведение ");
        System.out.println(Vector.vectorMult(firstVector, secondVector));
        
//        Сумма векторов
        Vector.sumVector(firstVector, secondVector);
        
//        Разность векторов
        Vector.diffVector(firstVector, secondVector);
    }
}
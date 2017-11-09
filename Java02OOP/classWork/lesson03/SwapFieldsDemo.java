package Java02OOP.classWork.lesson03;

class MyClass6{ // Класс для создания объектов
    int number; // Целочисленное поле
    MyClass6(int n){ // Конструктор
        number=n;
    }
} // Класс со статическим методом swap() и главным методом программы:
class SwapFieldsDemo{
    // Статический метод с двумя аргументами, являющимися
// объектами класса MyClass:
    static void swap(MyClass6 A,MyClass6 B){
        System.out.println("Выполняется метод swap()");
// Значения поля number объектов, переданных
// аргументами методу:
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
// Объекты "обмениваются" значениями полей:
        int number=B.number;
        B.number=A.number;
        A.number=number;
// Продолжение на следующем слайде!!!
// Значения поля number объектов, переданных
// аргументами методу swap()
// (после "обмена" значениями полей):
        System.out.println("Значения полей изменены");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        System.out.println("Завершено выполнение метода swap()");
    } // Главный метод программы:
    public static void main(String[] args){
// Создание объектов:
        MyClass6 A=new MyClass6(100);
        MyClass6 B=new MyClass6(200);
// Значения поля number объектов A и B до
// вызова метода swap():
        System.out.println("До вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
// Вызов метода swap():
        swap(A,B);
// Значения поля number объектов A и B после вызова swap():
        System.out.println("После вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
    }
}

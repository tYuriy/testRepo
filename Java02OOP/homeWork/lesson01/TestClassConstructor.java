package Java02OOP.homeWork.lesson01;

/*
Напишите программу с классом, в котором есть два символьных поля, а также конструкторы,
позволяющие создавать объекты на основе таких значений:
а) один символ (значение полей)Ж
б) два символа (значение полей);
в) текст (значения полей - первая и последняя буква в тексте)
 */

public class TestClassConstructor {
    public static void main(String[] args) {
        ClassConstructor ccOne = new ClassConstructor('a');
        ccOne.printVal();
        ClassConstructor ccTwo = new ClassConstructor('&','Z');
        ccTwo.printVal();
        ClassConstructor ccThree = new ClassConstructor("some short string");
        ccThree.printVal();

    }
}
class ClassConstructor {
    char fieldOne;
    char fieldTwo;
    ClassConstructor (char a) {
        this.fieldOne = a;
        this.fieldTwo = a;
    }
    ClassConstructor (char a, char b) {
        this.fieldOne = a;
        this.fieldTwo = b;
    }
    ClassConstructor (String str) {
        this.fieldOne = str.charAt(0);
        this.fieldTwo = str.charAt(str.length()-1);
    }

    public void printVal (){
        System.out.println("Values " + fieldOne + " and " + fieldTwo);
    }
}

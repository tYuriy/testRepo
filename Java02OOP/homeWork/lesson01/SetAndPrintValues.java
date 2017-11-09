package Java02OOP.homeWork.lesson01;


/*
Напишите программу с классом, в котором есть два поля (текстовое и симаольное), а также методы для
присваинвания значений полям и метод для отображения значений полей в консольном окне.
*/
public class SetAndPrintValues {
    public static void main(String[] args) {
        NewClass nc1 = new NewClass();
        NewClass nc2 = new NewClass();
        nc1.setA('X');
        nc2.setA('#');
        nc1.setStr("New value for object");
        nc2.setStr("some text");
        nc1.printVals(nc1.str, nc1.a);
        System.out.println();
        nc2.printVals(nc2.str, nc2.a);
    }
}
class NewClass {
    String str;
    char a;
    public void setStr (String str){
        this.str = str;
    }
    public void setA (char a){
        this.a=a;
    }
    public void printVals (String str, char a){
        System.out.println("Значение для текстового поля: " + str + "\nЗначение для символьного поля: " + a);
    }
}

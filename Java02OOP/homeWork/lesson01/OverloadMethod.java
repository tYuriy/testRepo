package Java02OOP.homeWork.lesson01;
/*
Напишите программу с классом, в котором есть симаольное поле. Класс должен содержать описание
перегруженного метода для присваивания значения полю: без аргументов, с символьным аргументом,
и с текстовым аргументом. В первом случае полю присваивается значением символ "А",
во втором = значение, переданное аргументом, в третьем = первая буква в тексте,
переданном аргументом методу.
 */

public class OverloadMethod {
    public static void main(String[] args) {
        CharField cf = new CharField();
        cf.setField();
        System.out.println("Value without args: " + cf.field);
        cf.setField('j');
        System.out.println("Value with char arg: " + cf.field);
        cf.setField("what a great string");
        System.out.println("Value with string arg: " + cf.field);

    }
}
class CharField {
    char field;
    public void setField (){
        this.field = 'A';
    }
    public void setField (char a){
        this.field = a;
    }
    public void setField (String str){
        this.field = str.charAt(0);
    }
}

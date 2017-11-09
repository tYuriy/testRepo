package Java02OOP.classWork.lesson03;

class Binomial{
    // Закрытое поле-массив:
    private int[] binoms;
    // Конструктор:
    Binomial(int n){
// Создание массива:
        binoms=new int[n+1];
// Значение начального элемента массива:
        binoms[0]=1;
// Заполнение массива:
        for(int k=1;k<=n;k++){
            binoms[k]=binoms[k-1]*(n-k+1)/k;
        }
    } // Продолжение на следующем слайде!!!
    //По определению биномиальные коэффициенты 𝐶𝑛𝑘=𝑛!𝑘!𝑛−𝑘!. При вычислении коэффициентов мы исходим из того, что 𝐶𝑛0=1 и для всех 𝑘=1,2,3,…,𝑛 имеет место соотношение 𝐶𝑛𝑘=𝐶𝑛𝑘−1⋅𝑛−𝑘+1𝑘.
    // Переопределение метода toString():
    public String toString(){
// Текстовая переменная для формирования результата:
        String txt="| ";
// Добавление к тексту значений элементов массива:
        for(int k=0;k<binoms.length;k++){
            txt+=binoms[k]+" | ";
        }
// Результат метода:
        return txt;
    }
}
// Главный класс:
class ArrayAsFieldDemo{
    public static void main(String[] args){
// Создание объектов:
        Binomial A=new Binomial(5);
        Binomial B=new Binomial(10);
// Отображение биномиальных коэффициентов:
        System.out.println(A);
        System.out.println(B);
    }
}
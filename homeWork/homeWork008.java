package homeWork;

import static javax.swing.JOptionPane.*;

public class homeWork008 {
    public static void main(String[] args) {
        //String startTitle="";
        //String startMessage="";
        String inpMsg = "Введите какое-нибудь число";
        String inpTitle1 = "Ввод данных";
        String inpTitle2 = "Результат";
        String inpInt = "Введено целое число ";
        String inpDbl = "Введено десятичное число ";
        String inpErr = "Введен текст, нужно ввести число, \nпопробуйте еще раз";
        String inpNull = "Ничего не введено, нужно ввести число, \nпопробуйте еще раз";
        int infConst = INFORMATION_MESSAGE;
        int infErr = ERROR_MESSAGE;
        //int inf;

        boolean a = true;

        while (a){
        String newTxt=showInputDialog(null, inpMsg, inpTitle1, infConst);

        //showMessageDialog(null,startMessage,startTitle,INFORMATION_MESSAGE);
        try {
            int newValue = Integer.parseInt(newTxt);//(showInputDialog(null, inpMsg, inpTitle, INFORMATION_MESSAGE));
            //inf = infConst;
            //System.out.println("int " + newValue);
            showMessageDialog(null,inpInt + newValue,inpTitle2,infConst);
            a=false;
            } catch (NumberFormatException ex0) {
                try {
                    double newValue = Double.parseDouble(newTxt);
                    showMessageDialog(null,inpDbl+ newValue,inpTitle2,infConst);
                    //System.out.println("double " + newValue);
                    a=false;
                    } catch (NumberFormatException ex1) {
                    showMessageDialog(null,inpErr,inpTitle2,infErr);
                    //System.out.println("need some number, try again");
                    } catch (NullPointerException ex2) {
                    showMessageDialog(null,inpNull,inpTitle2,infErr);
                    //System.out.println("Enter smth");
                }
            }
        }
    }
}

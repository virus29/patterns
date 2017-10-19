package EnterFromKeyboard;

import java.util.Scanner;

public class EnterFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Введи что-нибудь и нажми Enter");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        System.out.println("Вывелось что ты напечатал: " + string);
    }
}

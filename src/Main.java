import pro.learnup.homework.GameLogic;

import static pro.learnup.homework.GameLogic.speedValue;

public class Main {
    public static void main(String[] args) {

        String result = speedValue(0);
        System.out.println("Игрок 1 " + result);

        result = speedValue(2);
        System.out.println("Игрок 2 " + result);

        result = speedValue(78);
        System.out.println("Игрок 3 " + result);
    }
}


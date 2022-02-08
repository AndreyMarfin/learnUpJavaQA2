package pro.learnup.homework;

public class GameLogic {
    public static boolean isGreenLight = false;

    public static String speedValue(int value) {
        String response;
        if (isGreenLight) {
            response = "со скоростью = " + value + " играет дальше, так как горит зеленый сигнал светофора";
        } else {
            if (value > 0) {
                response = "со скоростью = " + value + " выбывает, так как двигается на красный сигнал светофора";

            } else {
                response = "со скоростью = " + value + " играет дальше, так как стоит на красный сигнал светофора";
            }
        }
        return response;
    }
}




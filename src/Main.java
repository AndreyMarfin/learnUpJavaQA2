public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 1;
        int speedOfPlayer2 = 1;
        int speedOfPlayer3 = 1;

        int outsiders = 0;
        if (isGreenLight) {
            System.out.println("Количество выбывающих игроков: " + outsiders);
        } else {

            if (speedOfPlayer1 > 0) {
                outsiders = outsiders + 1;
            }
            if (speedOfPlayer2 > 0) {
                outsiders = outsiders + 1;
            }
            if (speedOfPlayer3 > 0) {
                outsiders = outsiders + 1;
            }
            System.out.println("Количество выбывающих игроков: " + outsiders);
        }
    }
}

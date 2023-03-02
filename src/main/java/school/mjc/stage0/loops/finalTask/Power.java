package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        if (numberToPrint == 0) {
            System.out.println(0);
            return;
        }
        int newPower = 1;
        for (int i = 0; i < power; i++) {
            newPower *= numberToPrint;
        }
        System.out.println(newPower);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}

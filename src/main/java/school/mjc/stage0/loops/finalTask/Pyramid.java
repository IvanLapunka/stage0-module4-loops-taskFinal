package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int middle = cathetusLength;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if ( middle - i < j && j < middle + i) {
                    System.out.print(Math.abs(middle - j) + 1);
                } else if (j >= middle + i) {
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

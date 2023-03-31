package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power >= 0) {
            int i = 1;
            int result = 1;
            System.out.println(result);
            while (i <= power) {
                result = result * 2;
                i++;
                System.out.println(result);
            }
        } else {
            System.out.println("too much power");
        }
    }
}

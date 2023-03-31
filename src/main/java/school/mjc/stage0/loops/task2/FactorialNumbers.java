package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int j = 1;
        System.out.println(i);
        while(i <= printToInclusive){
            System.out.println(j = j * i);
            i++;
        }
    }
}

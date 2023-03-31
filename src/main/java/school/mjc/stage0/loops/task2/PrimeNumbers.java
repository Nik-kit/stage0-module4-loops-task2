package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if(printToInclusive != 0) {
            int i = 2;
            boolean b = true;
            while (i <= printToInclusive) {
                int j = 2;
                while(j < i) {
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                    j++;
                }
                if(b){
                    System.out.println(i);
                } else {
                    b = true;
                }
                i++;
            }
        }
    }
}

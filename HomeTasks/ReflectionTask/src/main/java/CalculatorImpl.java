import static java.lang.Thread.*;

public class CalculatorImpl implements Calculator{

    @Override
    public int calc(int number) {
       try{
           sleep(5000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
        int r = 1;
        for(int i = 2; i <=number; i++){
            r *= i;
        }
        return r;
    }
}

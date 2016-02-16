import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by colin on 2/10/2016.
 */
abstract class driverDFA {
    private int state;
    static private int [][] delta;

    abstract boolean accepted();
    abstract int inputNumber(char in);
    abstract void reset();
    abstract void process(String in);



}

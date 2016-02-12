import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by colin on 2/10/2016.
 */
public class driverDFA {
    public static void main(String[] args)
            throws IOException {

        ManWolf t = new ManWolf(); //The DFA from ManWolf.java
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine();
        while (s!=null) {
          t.reset();
          t.process(s);
          if (
          s = in.readLine();

        }
    }



}

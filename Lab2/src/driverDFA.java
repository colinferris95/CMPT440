import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by colin on 2/10/2016.
 */
public class driverDFA {
    public static void main(String[] args){
        ManWolf d = new ManWolf();

        d.process(args[0]);


        if (d.accepted() == true){

            System.out.println("That is a solution"); // dfa.accepted is true and the solution passed

        }
        else {
            System.out.println("That is not a solution"); // dfa.accepted is false and the solution has failed

        }


}
}
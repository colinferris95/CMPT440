//transition function
public class ManWolf {
    private static final int q0 = 0;
    private static final int q1 = 1;
    private static final int q2 = 2;
    private static final int q3 = 3;
    private static final int q4 = 4;
    private static final int q5 = 5;
    private static final int q6 = 6;
    private static final int q7 = 7;
    private static final int q8 = 8;
    private static final int q9 = 9;
    private static final int q10 = 10;
    //The collected states of the Man Wolf Cabbage DFA q0-q10


    private int state;
    //Holds the current state code


    //tranistion function
    //

    /*
    static private int delta(int s, char c) {
        switch (s)  {
            case q0: switch (c){
                case 'w': return q10;
                case 'g': return q1;
                case 'c': return q10;
                case 'n': return q10;
                default:  return q10;
                //state q0 E:MWGC W:
            }
            case q1: switch (c){
                case 'w': return q10;
                case 'g': return q0;
                case 'c': return q10;
                case 'n': return q3;
                default:  return q10;
                //state q1 E:WC W:MG
            }
            case q2: switch (c){
                case 'w': return q8;
                case 'g': return q10;
                case 'c': return q3;
                case 'n': return q1;
                default:  return q10;
                //state q2 E:MWC W:G
            }
            case q3: switch (c){
                case 'w': return q10;
                case 'g': return q4;
                case 'c': return q2;
                case 'n': return q10;
                default:  return q10;
                //state q3 E:W W:MGC
            }
            case q4: switch (c){
                case 'w': return q5;
                case 'g': return q3;
                case 'c': return q10;
                case 'n': return q10;
                default:  return q10;
                //state q4 E:MGW W:C
            }
            case q5: switch (c){
                case 'w': return q4;
                case 'g': return q10;
                case 'c': return q9;
                case 'n': return q6;
                default:  return q10;
                //state q5 E:G W:MWC
            }
            case q6: switch (c){
                case 'w': return q10;
                case 'g': return q7;
                case 'c': return q10;
                case 'n': return q5;
                default:  return q10;
                //state q6 E:NG W:WC
            }
            case q7: switch (c){
                case 'w': return q10;
                case 'g': return q6;
                case 'c': return q10;
                case 'n': return q10;
                default:  return q10;
                //state q7 E: W:MWGC
            }
            case q8: switch (c){
                case 'w': return q2;
                case 'g': return q9;
                case 'c': return q10;
                case 'n': return q10;
                default:  return q10;
                //state q8 E:C W:MWG
            }
            case q9: switch (c){
                case 'w': return q10;
                case 'g': return q8;
                case 'c': return q5;
                case 'n': return q10;
                default:  return q10;
                //state q9 E:MGC W:W
            }
            case q10: switch (c){
                case 'w': return q10;
                case 'g': return q10;
                case 'c': return q10;
                case 'n': return q10;
                default:  return q10;

            }
            default: return q10;
            //If none of the cases are met it returns to error state
        }
    }
*/

    static private int [][] delta = {
            {q10,q1,q10,q10},{q10,q0,q10,q3},{q8,q10,q3,q1},{q10,q4,q2,q10}, {q5,q3,q10,q10}, {q4,q10,q9,q6},
                    {q10,q7,q10,q5}, {q10,q6,q10,q10}, {q2,q9,q10,q10}, {q10,q8,q5,q10}, {q10,q10,q10,q10}};


    public void reset() {
        state = q0;
    }

    public void process(String in){
        for (int i=0; i < in.length(); i++){
            char c = in.charAt(i);
            try {
                state = delta[state][c - '0'];
            }
            catch (ArrayIndexOutOfBoundsException ex)    {
                    state = q10;
                }
            }
        }




    public boolean accepted() {
        return state == q10;
    }
}
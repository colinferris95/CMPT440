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



    //takes the alphabet (wgnc) and changes it to numbers
    protected int inputNumber(char in){
        switch (in) {
            case 'n':
                return 3;
            case 'c':
                return 2;
            case 'g':
                return 1;
            case 'w':
                return 0;
            default:
                state = q10; // error state
                return 0;
        }
    }

    static private int [][] delta = {
            {q10,q1,q10,q10},
            {q10,q0,q10,q2},
            {q3,q10,q4,q1},
            {q2,q5,q10,q10},
            {q10,q6,q2,q10},
            {q10,q3,q7,q10},
            {q7,q4,q10,q10},
            {q6,q10,q5,q8},
            {q10,q9,q10,q7},
            {q10,q8,q10,q10},
            {q10,q10,q10,q10}};
    //transition matrix



    public void reset() {
        state = q0;
    }

    public boolean accepted() { // The end state of the DFA
        return state == q9;

    }

    public void process(String in){
        for (int i=0; i < in.length(); i++){
            char c = in.charAt(i);
            int input = this.inputNumber(c); //the current input as a number
            state = delta[state][input];


        }
    }




}
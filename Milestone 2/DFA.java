public class DFA {
	  
	  private static final int Q0 = 0;
	  private static final int Q1 = 1;
	  private static final int Q2 = 2;
	  private static final int Q3 = 3;
	  private static final int Q4 = 4;
	  private static final int Q5 = 5;
	  private static final int Q6 = 6;
	  private static final int Q7 = 7;
	  private static final int Q8 = 8;
	  private static final int Q9 = 9;
	  private static final int Q10 = 10;
	  private static final int Q11 = 11;
	  private static final int Q12 = 12;
	  private static final int Q13 = 13;
	  private static final int Q14 = 14;
	  private static final int Q15 = 15;
	  private static final int Q16 = 16;
	  private static final int Q17 = 17;
	  private static final int Q18 = 18;
	  private static final int Q19 = 19;
	  private static final int Q20 = 20;
	  private static final int Q21 = 21;
	  private static final int Q22 = 22;
	  private static final int Q23 = 23;
	  private static final int Q24 = 24;
	  private static final int Q25 = 25;
	  private static final int Q26 = 26;
	  private static final int Q27 = 27;
	  private static final int Q28 = 28;
	  private static final int Q29 = 29;
	  private static final int Q30 = 30;
	  private static final int Q31 = 31;
	  private static final int Q32 = 32;
	  private static final int Q33 = 33;
	  private static final int Q34 = 34;
	  private static final int Q35 = 35;
	  private static final int Q36 = 36;
	  private static final int Q37 = 37;
	  private static final int Q38 = 38;
	  private static final int Q39 = 39;
	  private static final int Q40 = 40;
	  private static final int Q41 = 41;
	  private static final int Q42 = 42;
	  private static final int Q43 = 43;
	  private static final int Q44 = 44;
	  private static final int Q45 = 45;
	  private static final int Q46 = 46;
	  private static final int Q47 = 47;
	  private static final int Q48 = 48;
	  private static final int Q49 = 49;

	  
	  
	  private static int state = Q0;
	  
	  public String currentPhrase = "";
	  
	  
	  
	  public int inputNumberState(char in){
		    switch(in){
		        case 'b':
		        case 'c':
		        case 'd':
		        case 'e':
		        case 'f':
		        case 'g':
		        case 'h':
		        case 'j':
		        case 'k':
		        case 'l':
		        case 'm':
		        case 'o':
		        case 'q':
		        case 's':
		        case 'u':
		        case 'w':
		        case 'x':
		        case 'y':
		        case 'z':
		          return 0;
		        case 'v':		        	
		          return 1;
		        case 'a':
		          return 2;	        	
		        case 'r' :
		        	    	
		        	if ( state == Q1 ){
		          return 5;
		        	}
		        	else {
		          return 3;
		        	}
		        	
		        case 'p' :
			      return 4;
		        case 'i' :
		          return 6;
		        case 'n' :
		          return 7;
		        case 't' :
		          return 8;
		        case '0':
		        case '1':
		        case '2':
		        case '3':
		        case '4':
		        case '5':
		        case '6':
		        case '7':
		        case '8':
		        case '9':
		          return 9;
		        case ' ':
		          return 10;
		        case '-':
		          return 11;
		        case '+':
		          return 12;
		        case '=':
		          return 13;
		        case '*':
			      return 14;
		        case '"':
			      return 15;
		        case '(':
				      return 16;
		        case ')':
				      return 17;  
		        default:
		        	return 0;
		      }
		       
		           
		        
		    }

public void reset() {
	    state = Q0;
	 }

	/*  
public boolean acceptedStates() { 
		  
		  if (state == Q11 ||state == Q27 ||state == Q36 ||state == Q47 ||state == Q48 ) {
	        	System.out.println("true");
	        	return true;
		  }    
	        else {
		        	System.out.println("false");
		        	return false;
		        	
		        }
	        

	    }
*/
public boolean process(String in){
    for (int i=0; i < in.length(); i++){
        char c = in.charAt(i);
        int input = this.inputNumberState(c); //the current input as a number
        System.out.println("input from case switch " + input);//debug
        try{
        state = delta[state][input];
        System.out.println(state);// debug
        } catch (ArrayIndexOutOfBoundsException ex){
        	state = Q49;
        }
    }
        
  	  if (state == Q11 ||state == Q27 || state == Q32 || state == Q36 ||state == Q47 ||state == Q48 ) {
      	System.out.println("true");
      	System.out.println(state);// debug
      	state = Q0;
      	return true;
      	
	  }    
      else {
	        	System.out.println(state); //debug
	        	reset();
	        	return false;
	        	
	        

      }
    
}
	  
	  // Create DFA matrix
	  private static int [][] delta = {
		  //{a-z}v  a   r   p  r   i   n    t {0-9} _  -   +   =    *    " (    )
/*q0*/		{Q28,Q23,Q28,Q28,Q1,Q28,Q28,Q28,Q28,Q49,Q49,Q49,Q49,Q49,Q41,Q49,Q49,Q49},
/*q1*/	    {Q49,Q49,Q49,Q2,Q49,Q2,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q2*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q3,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q3*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q4,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q4*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q5,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q5*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q6,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q6*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q7,Q49},
/*q7*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q8,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q8*/	    {Q9,Q9,Q9,Q9,Q9,Q9,Q9,Q9,Q9,Q17,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q9*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q10,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q10*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q11},
/*q11*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q12*/	    {Q13,Q13,Q13,Q13,Q13,Q13,Q13,Q13,Q13,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q13*/	    {Q13,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q14,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q14*/	    {Q13,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q15,Q49,Q49},
/*q15*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q16,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q16*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q11},
/*q17*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q18,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q18*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q19,Q49,Q49,Q49,Q49,Q11},
/*q19*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q20,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q20*/	    {Q21,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q21*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q22,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q22*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q11},
/*q23*/	    {Q49,Q49,Q24,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q24*/	    {Q49,Q49,Q49,Q25,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q25*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q26,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q26*/	    {Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q27*/	    {Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q28*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q29,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q29*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q30,Q49,Q49,Q49,Q49},
/*q30*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q31,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q31*/	    {Q48,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q32,Q49,Q49,Q49,Q49,Q49,Q37,Q49,Q49},
/*q32*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q32,Q33,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q33*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q34,Q49,Q49,Q49,Q49,Q49},
/*q34*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q35,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q35*/	    {Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q36*/	    {Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q37*/	    {Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q38*/	    {Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q49,Q39,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q39*/	    {Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q49,Q49,Q49,Q49,Q49,Q49,Q40,Q49,Q49},
/*q40*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q41*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q42,Q49,Q49,Q49,Q49,Q49,Q49},
/*q42*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q43,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q43*/	    {Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q44*/	    {Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q49,Q45,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q45*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q46,Q49,Q49,Q49,Q49,Q49,Q49},
/*q46*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q47,Q49,Q49,Q49},
/*q47*/	    {Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*q48*/	    {Q48,Q48,Q48,Q48,Q48,Q48,Q48,Q48,Q48,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},


	  };
	  
	  
	  
	  public void test(){
	    for(int i = 0; i < delta.length; i++)
	    {
	        for(int j = 0; j < delta[i].length; j++)
	        {
	            System.out.print(delta[i][j]);
	            if(j < delta[i].length - 1) System.out.print(" ");
	        }
	        System.out.println();
	    }
	  }

	}
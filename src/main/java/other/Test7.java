package other;

public class Test7 {
    public static void main(String[] args){
        int i=2;
        Loop1:
        while ( true ) {			//	1
            for ( ; true; ) {
                if ( i ==2 )
                    break Loop1;	//	2
            }
            //i=4;				//	3
        }
        i=5;
    }
}

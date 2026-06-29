//diamond pattern
public class patterns {
    public static void main(String[] args){
        int n=9;
        int half=(n+1)/2;
        for(int row=1;row<=half;row++){
            for(int spaces=1;spaces<=half-row;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=2*row-1;stars++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int row=1;row<=half-1;row++){
            for(int spaces=1;spaces<=row;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=2*((half-1)-row)+1;stars++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
/*output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
  */

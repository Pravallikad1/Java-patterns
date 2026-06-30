public class patterns{
    public static void main(String[] args){
        int n=5;
        for(int row=1;row<=n;row++){
            int start;
            if(row%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int col=1;col<=row;col++){
                start=1-start;
                System.out.print(start);
            }
            System.out.println();
        }
    }
}
/*
1
01
101
0101
10101
*/

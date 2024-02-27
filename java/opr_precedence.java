public class opr_precedence{
    public static void main(String[] args){
        int a=6*5-34/2; 
        /*30
        17
        13*/

        int b=60/5-34*2;
        /*12
        -68
        =-56*/

        //precedence of multiply and division is same and associtivity is from left to right
        System.out.println(a);
        System.out.println(b);
        
        
        // Quick quiz
        // int  x=6;
        // int y=1;
        // int k=x*y/2;
        // System.out.println(k);


        // int a=5;
        // int b=4;
        // int c=1;
        // int k=(b*b-4*a*c)/(2*a); // 4*4-20/10 = 16-2=14  
        // System.out.println(k);


        // int v=2;
        // int u=1;
        // int k=v*v-u*u;  //4-1=3  a*b-d
        // System.out.println(k);


        // int a=5;
        // int b=3;
        // int d=2;
        // int k= a*b-d; //15-2=13
        // System.out.println(k);

        }
}
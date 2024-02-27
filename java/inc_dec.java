public class inc_dec{
    public static void main(String[]args){
        int i=56;
        // int b=i++;//first b is assigned i(56) then i is incremented
        int j=67;
        int c=++j;// first j is incremented then c is assigned j (68)
        System.out.println(i++);
         System.out.println(i);
          System.out.println(++i);
           System.out.println(i);
        char a='b';
        a++;
         System.out.println(a);

// quick quiz find value of x
      int y=7;
      int x=++y*8;  // ++ will implement first b/c ++ has higher precedence then *
       System.out.println(x);
    }
}
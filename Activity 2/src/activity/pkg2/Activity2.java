package activity.pkg2;

public class Activity2 {
    
public static void main(String args[]){
  
    int r = 5; 
            for(int i = 1; i <= r; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
    }
            for(int i = r; i >= 1; --i) {
            for(int j = 2; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
            }
}
        int r = 5, i = 1, j = 1;
        {
       while (i <= r)
       {
        while (j <= i )
        {
            System.out.print("* ");
            ++j;
        }
        System.out.print("\n");
        i++;
        j = 1;
       }
       int a = 4, b = 1;
       
       while (a >= 1)
       {
        while (b <= a)
        {
            System.out.print("* ");
            ++b;
        }
        System.out.print("\n");
        --a;
        b = 1;
       }
    }
        {
     do
     {
         do
             {
                 System.out.print("*");
                 j++;
             }
         while(j<=i);
         j=0;
         System.out.print("\n");
         i--;
     }
     while(i>=j);
     j=0; i=0;
     do
     {
         do
         {
             System.out.print("*");
             j++;
         }
         while(j!=i+1);
         j=0;
         i++;
         System.out.print("\n");
     }
     while(i!=5);   
}
}

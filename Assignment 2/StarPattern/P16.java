class P16{
public static void main(String args[]){
int i,j,k;
for(i=1; i<=5; i++)
        {
          
            for (j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for ( k=1; k<=i; k++)
            {
                if( k == 1 || k == i || i == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
		}

}

}
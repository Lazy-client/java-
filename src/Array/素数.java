package Array;




public class 素数 {
    public static void main(String[] args) {
        int j;
        int x=0;
        for (int i = 100; i <=1000; i++) {
            for ( j = 2; j < i;j++) {
                if(i%j == 0)
                    break;

            }
            if(i == j)
            {

                System.out.print(i+" ");
                x++;
                if (x%10==0)
                    System.out.println();
            }
        }

    }
}

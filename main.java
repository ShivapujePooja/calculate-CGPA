import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner ob1 = new Scanner(System.in);
        int total,c,g;
        float tcp=21f,sum=0f;
        System.out.println("enter the number of subjects");
        int n = ob1.nextInt();
        System.out.println("enter your information");;
        for(int i=1;i<=n;i++)
        {
            System.out.print("credit points:");
            System.out.println("grade points:\t");
            c = ob1.nextInt();
            g = ob1.nextInt();
            for(int j=1; j<=1; j++)
            {
                total = c * g;
                System.out.println("total : " + total);
                sum+ = total;
                System.out.println("sum :"+sum);
             }
            System.out.println(" ");
        }
        float SGPA;
        SGPA = sum/tcp;
        System.out.println("Calculated SGPA :" + SGPA);
    }
}
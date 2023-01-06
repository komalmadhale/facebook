import java.util.Scanner;
class While
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int s=sc.nextInt();
int e=sc.nextInt();
while(s<=e)
{
++s;
e++;
}
System.out.println("even");
}

}

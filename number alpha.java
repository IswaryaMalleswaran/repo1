import java.io.*
import java.util.*
public static void main(String args[])
{
Scanner s=new Scanner(System.in)
int n=s.nextint();
for(int i=0;i<n;i++)
{
char a= s.nextLine();
int b= s.nextint();
if(b!=0)
{
for(i=0;i<=b;i++)
{
System.out.println(a);
}
}
}
}



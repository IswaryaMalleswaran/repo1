import java.io.*
import java.util.*
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();

for(i=0;i<n;i++)
{
int a[]=c.nextInt();
}
int tar=c.nextInt();
for(j=0;j<a.length;j++)
{
for(k=j+1;k<a.length;k++)
{
 int z=a[j]+a[k];
 if(z==tar)
 {
 System.out.Println(a[j],a[k]);
 }
 }
 }
 

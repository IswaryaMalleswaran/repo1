import java.io.*
imoprt java.util.*
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
string s=c.nextLine();
int i;
string ss[i]=s.split(" ");
if(ss[i] %2!=0)
{
ss[i].reverse();
}
string t= "";
for(i=0;i<ss.length;i++)
{
t=t.concat(ss[i]);
}
System.out.println(t);
}

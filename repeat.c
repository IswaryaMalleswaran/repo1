#include<conio.h>
#include<stdio.h>
void main()
{
int a[],x,n;
scanf("%d",&n);
for(int i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(int j=0;j<n-1;j++)
{
for(int k=i-1;k<n-1;k++)
{
if(a[j]==a[k])
{
printf(" %d",a[j]);
}
break;
}
}
}



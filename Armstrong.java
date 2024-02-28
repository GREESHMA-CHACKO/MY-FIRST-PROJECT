class Armstrong
{
public static void main(String args[])
{
int rem;
int n=121;
int x=n;
int rev=0;
while(n>0)
{
rem=n%10;
rev=(rev*rev*rev)+rem;
n=n/10;
}
if(x==rev)
{
System.out.println("armstrong");
}
else
{
System.out.println("not Armstrong");
}
}}
public class a1q4{
public static void main (String[] args){

int a=4,b=8,c=65,d=220;

System.out.println("no. are "+a+","+b+","+c+","+d);

int result = a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));

System.out.println("the greatest no. is = "+result);

}}


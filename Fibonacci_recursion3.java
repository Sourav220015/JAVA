class Fibonacci_recursion3{
public static void Fibbo(int a,int b,int n){
	if(n==0){
		return ;
	}
	//int a=0,b=1;
	int c=a+b;
	System.out.println(c);
	Fibbo(b,c,n-1);
	//return d;
}
public static void main(String args[]){
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	int n=5;
	Fibbo(a,b,n-2);
	
	
}
}
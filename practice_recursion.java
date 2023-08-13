class practice_recursi{
public static void printNum(int i,int n,int sum){
	if(i==n){
	sum=sum+n;
	System.out.println(sum);
	return;
	}
	sum +=i;
	printNum(i+1,n,sum);
	//return;
}
public static void main(String args[]){
	printNum(1,5,0);
}
}
/*
public static int Factorial(int n){
	if(n==1 || n==0){
		return 1;
	}
	int num_1 = Factorial(n-1);
	int num = n*num_1;
	return num;
}
public static void main(String args[]){
	Factorial(5);
	System.out.println(Factorial(5));
}
*/

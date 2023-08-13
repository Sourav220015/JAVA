class Recursion1{
	public static int SumOfNumber(int i,int n,int sum){
		if(i==n){
		sum = sum+i;
		System.out.println(sum);
			return sum;
		}
		sum=sum+i;
		return SumOfNumber(i+1,n,sum);
	}
	public static void main(String args[]){
		SumOfNumber(1,5,0);
	}
}
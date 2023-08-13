class Factoria_recursion2{
	public static int Fact(int n){
		if(n==0){
			return 1;
		}
		int a =Fact(n-1);
		int Facn = n*Fact(n-1);
		return Facn;
	}
	public static void main(String args[]){
		int n=5;
		System .out.println(Fact(5));
	}
}
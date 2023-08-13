class powerrecursion4{
public static int Pow(int x,int n){
	if(n==0){
		return 1;
	}
	if(x==0){
	return 1;
	}
	int xpownm1=Pow(x,n-1);
	int xpow=x*xpownm1;
	return xpow;
}

public static void main(String args[]){
	int x=2,n=5;
	int ans = Pow(x,n);
	System.out.println(ans);
	}
}
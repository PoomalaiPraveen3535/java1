package javapro1;

public class reverse {
	public static void main(String[] args) {
	int num=42567;
	int rev=0,rem=0;
	int originial=num;
	while(num!=0) {

	rem=num%10;
	rev=rev*10+rem;
	num/=10;
	}
	System.out.println("rev "+rev);
}
}

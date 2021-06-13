package src;

public class NthFibonacci {
//AlgoExpert Nth Fibonacci
	public NthFibonacci() {
		// TODO Auto-generated constructor stub
	}

	  public static int getNthFib(int n) {
			if(n == 1) 
				return 0;
			if(n == 2)
				return 1;
			return (getNthFib(n-1) + getNthFib(n-2));
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

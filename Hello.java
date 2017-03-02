

public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello Android");
		printArgs(args);
	}

	private static void printArgs(String[] args) {
		if (null != args && args.length > 0) {
	        for (int i=0; i<args.length; ++i) {
	        	System.out.println("arg " + (i+1) + " : " + args[i]);
	        }
		}
	}
}


public class twoPowerN implements ISubscriber{

	public void twopowN(int input) {
		long output = 1;
		for(int i = 1;i<=input;i++) {
			output *= 2;
		}
		System.out.println("2^"+input+"="+output);
	}
	public void notifySubscriber(double input) {
		twopowN((int)input);
	}

}

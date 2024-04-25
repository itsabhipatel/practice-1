
public class Adapter implements AppleCharger {

	private SamsungCharger samsungCharger;
	
	
	public Adapter(SamsungCharger samsungCharger) {
		super();
		this.samsungCharger = samsungCharger;
	}


	@Override
	public void chargeApple() {
		
		samsungCharger.chargeSamsung();
	}

}

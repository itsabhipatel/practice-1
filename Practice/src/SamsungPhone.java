
public class SamsungPhone {
 
	private SamsungCharger samsungCharger;

	public SamsungPhone(SamsungCharger samsungCharger) {
		super();
		this.samsungCharger = samsungCharger;
	}
	
	public void chargerSamsung()
	{
		samsungCharger.chargeSamsung();
	}
}

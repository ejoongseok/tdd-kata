package parrot;

public class NorwegianBlueParrot implements Parrot {
	private final double voltage;
	private final boolean isNailed;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}
}

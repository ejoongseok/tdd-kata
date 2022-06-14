package parrot;

public interface Parrot {

	double getSpeed();

	default double getBaseSpeed() {
		return 12.0;
	}
}

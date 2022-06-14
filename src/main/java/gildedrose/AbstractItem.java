package gildedrose;

public abstract class AbstractItem {

	protected Item item;

	AbstractItem(Item item) {
		this.item = item;
	}

	abstract void updateQuality();
}

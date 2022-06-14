package gildedrose;

public class Conjured extends AbstractItem {
	public Conjured(Item item) {
		super(item);
	}

	@Override
	void updateQuality() {
		item.sellIn -= 1;
		if (item.quality > 0) {
			item.quality -= 2;
		}
	}
}

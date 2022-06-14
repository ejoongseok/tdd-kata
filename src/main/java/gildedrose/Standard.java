package gildedrose;

public class Standard extends AbstractItem {
	public Standard(Item item) {
		super(item);
	}

	@Override
	void updateQuality() {
		item.sellIn -= 1;
		if (item.quality > 0) {
			item.quality -= 1;
		}
	}
}

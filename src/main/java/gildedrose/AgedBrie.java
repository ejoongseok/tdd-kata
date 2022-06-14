package gildedrose;

public class AgedBrie extends AbstractItem{

	public AgedBrie(Item item) {
		super(item);
	}

	@Override
	void updateQuality() {
		item.sellIn -= 1;
		if (item.quality < 50) {
			item.quality += 1;
		}
	}
}

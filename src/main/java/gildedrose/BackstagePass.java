package gildedrose;

public class BackstagePass extends AbstractItem {
	public BackstagePass(Item item) {
		super(item);
	}

	@Override
	void updateQuality() {
		item.sellIn -= 1;
		if (item.sellIn < 0) {
			item.quality = 0;
			return;
		}
		differentialQualityIncreases();
	}

	private void differentialQualityIncreases() {
		if (item.quality < 50) {
			item.quality += 1;
		}
		if (item.sellIn < 11 && item.quality < 50) {
			item.quality += 1;
		}
		if (item.sellIn < 6 && item.quality < 50) {
			item.quality += 1;
		}
	}
}

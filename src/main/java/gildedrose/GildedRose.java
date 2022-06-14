package gildedrose;

public class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			String name = item.name;
			if (name.equals("Sulfuras, Hand of Ragnaros")) {
				continue;
			}
			item.sellIn = item.sellIn - 1;
			if (name.equals("Aged Brie")) {
				duplicateQualityExtract(item);
			} else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				duplicateQualityExtract(item);
				if (item.sellIn < 11) {
					duplicateQualityExtract(item);
				}

				if (item.sellIn < 6) {
					duplicateQualityExtract(item);
				}

				if (item.sellIn < 0) {
					item.quality = 0;
				}
			} else {
				duplicatedExtract(item);
			}
		}
	}

	private void duplicatedExtract(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
	}


	private void duplicateQualityExtract(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;
		}
	}
}
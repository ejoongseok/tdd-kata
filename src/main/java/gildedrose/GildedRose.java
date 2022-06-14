package gildedrose;

public class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			if(item.name.equals("Sulfuras, Hand of Ragnaros")) {
				continue;
			}
			step1(item);
			item.sellIn = item.sellIn - 1;
			step3(item);
		}
	}

	private void step1(Item item) {
		if (!item.name.equals("Aged Brie")
			&& !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			duplicatedExtract(item);
		} else {
			if (item.quality < 50) {
				item.quality = item.quality + 1;

				if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (item.sellIn < 11) {
						duplicateQualityExtract(item);
					}

					if (item.sellIn < 6) {
						duplicateQualityExtract(item);
					}
				}
			}
		}
	}


	private void step3(Item item) {
		if (item.sellIn < 0) {
			if (!item.name.equals("Aged Brie")) {
				if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
					duplicatedExtract(item);
				} else {
					item.quality = 0;
				}
			} else {
				duplicateQualityExtract(item);
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
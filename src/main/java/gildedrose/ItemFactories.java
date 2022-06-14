package gildedrose;

public final class ItemFactories {

	private ItemFactories() {}

	static AbstractItem of(Item item) {
		switch (item.name) {
			case "Aged Brie":
				return new AgedBrie(item);
			case "Backstage passes to a TAFKAL80ETC concert":
				return new BackstagePass(item);
			case "Sulfuras, Hand of Ragnaros":
				return new Sulfuras(item);
			case "Conjured Mana Cake":
				return new Conjured(item);
			default:
				return new Standard(item);
		}
	}
}

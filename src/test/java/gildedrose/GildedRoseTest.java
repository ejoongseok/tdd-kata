package gildedrose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

	@Test
	void updateQuality() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("foo", app.items[0].name);
		assertEquals(-1, app.items[0].sellIn);
		assertEquals(0, app.items[0].quality);

	}

}

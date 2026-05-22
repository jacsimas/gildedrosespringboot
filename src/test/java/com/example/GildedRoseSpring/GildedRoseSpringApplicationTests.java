package com.example.GildedRoseSpring;

import com.example.GildedRoseSpring.model.Item;
import com.example.GildedRoseSpring.service.InventoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseSpringApplicationTests {

    Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };

    int i;

    InventoryService app = new InventoryService();

    @Test
    public void foo() {

        app.distribute(items);
        assertEquals("+5 Dexterity Vest", items[0].name);
        assertEquals("Aged Brie", items[1].name);
        assertEquals("Elixir of the Mongoose", items[2].name);
        assertEquals("Sulfuras, Hand of Ragnaros", items[3].name);
        assertEquals("Sulfuras, Hand of Ragnaros", items[4].name);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", items[5].name);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", items[6].name);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", items[7].name);
        assertEquals("Conjured Mana Cake", items[8].name);
    }
}

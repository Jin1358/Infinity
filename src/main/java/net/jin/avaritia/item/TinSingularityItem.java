
package net.jin.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.jin.avaritia.init.AvaritiaModTabs;

public class TinSingularityItem extends Item {
	public TinSingularityItem() {
		super(new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}

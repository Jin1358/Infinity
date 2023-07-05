
package net.jin.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.jin.avaritia.init.AvaritiaModTabs;

public class NetheriteSingularityItem extends Item {
	public NetheriteSingularityItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}

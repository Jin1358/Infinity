
package net.jin.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.jin.avaritia.procedures.Replace3Procedure;
import net.jin.avaritia.procedures.Replace1Procedure;
import net.jin.avaritia.init.AvaritiaModTabs;

public class InfinityShovelItem extends ShovelItem {
	public InfinityShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 9999;
			}

			public float getSpeed() {
				return 100f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Replace1Procedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Replace3Procedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()));
		return InteractionResult.SUCCESS;
	}
}

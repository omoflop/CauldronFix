package mod.omoflop.cauldronfix;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CauldronFix implements ModInitializer {

	public static Item EMPTY = Items.BUCKET;

	public static HashMap<Item, Block> FILL_MAP = new HashMap<>(){
		{
			put(Items.WATER_BUCKET,       Blocks.WATER_CAULDRON);
			put(Items.LAVA_BUCKET,        Blocks.LAVA_CAULDRON);
			put(Items.POWDER_SNOW_BUCKET, Blocks.POWDER_SNOW_CAULDRON);
		}
	};
	public static HashMap<Block, Item> EMPTY_MAP = new HashMap<>() {
		{
			for (Map.Entry<Item,Block> entry : FILL_MAP.entrySet()) {
				put(entry.getValue(), entry.getKey());
			}
		}
	};

	@Override
	public void onInitialize() {}
}

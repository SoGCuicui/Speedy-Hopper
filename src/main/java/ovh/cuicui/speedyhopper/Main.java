package ovh.cuicui.speedyhopper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	private static final String FAST_HOPPER_ID = "speedyhopper:fast_hopper";
	private static final String FAST_HOPPER_ENTITY_ID = "speedyhopper:fast_hopper_entity";
	private static final String FAST_HOPPER_RECIPE_ID = "speedyhopper:crafting_special_fast_hopper";
	public static final String FAST_HOPPER_CONTAINER_ID = "container.fast_hopper";
	public static final FastHopperBlock FAST_HOPPER_BLOCK = new FastHopperBlock(FabricBlockSettings.copy(Blocks.HOPPER));
	public static final BlockEntityType<FastHopperBlockEntity> FAST_HOPPER_BLOCK_ENTITY = BlockEntityType.Builder.create(FastHopperBlockEntity::new, FAST_HOPPER_BLOCK).build(null);
	public static SpecialRecipeSerializer<FastHopperRecipe> FAST_HOPPER_RECIPE_SERIALIZER;

	private static final String SLOW_HOPPER_ID = "speedyhopper:slow_hopper";
	private static final String SLOW_HOPPER_ENTITY_ID = "speedyhopper:slow_hopper_entity";
	private static final String SLOW_HOPPER_RECIPE_ID = "speedyhopper:crafting_special_slow_hopper";
	public static final String SLOW_HOPPER_CONTAINER_ID = "container.slow_hopper";
	public static final SlowHopperBlock SLOW_HOPPER_BLOCK = new SlowHopperBlock(FabricBlockSettings.copy(Blocks.HOPPER));
	public static final BlockEntityType<SlowHopperBlockEntity> SLOW_HOPPER_BLOCK_ENTITY = BlockEntityType.Builder.create(SlowHopperBlockEntity::new, SLOW_HOPPER_BLOCK).build(null);
	public static SpecialRecipeSerializer<SlowHopperRecipe> SLOW_HOPPER_RECIPE_SERIALIZER;

	private static final String HOPPER_RECIPE_ID = "speedyhopper:crafting_special_hopper";
	public static SpecialRecipeSerializer<HopperRecipe> HOPPER_RECIPE_SERIALIZER;

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, FAST_HOPPER_ID, FAST_HOPPER_BLOCK);
		Registry.register(Registry.ITEM, FAST_HOPPER_ID, new BlockItem(FAST_HOPPER_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
		Registry.register(Registry.BLOCK_ENTITY_TYPE, FAST_HOPPER_ENTITY_ID, FAST_HOPPER_BLOCK_ENTITY);
		FAST_HOPPER_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, FAST_HOPPER_RECIPE_ID, new SpecialRecipeSerializer<FastHopperRecipe>(FastHopperRecipe::new));

		Registry.register(Registry.BLOCK, SLOW_HOPPER_ID, SLOW_HOPPER_BLOCK);
		Registry.register(Registry.ITEM, SLOW_HOPPER_ID, new BlockItem(SLOW_HOPPER_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
		Registry.register(Registry.BLOCK_ENTITY_TYPE, SLOW_HOPPER_ENTITY_ID, SLOW_HOPPER_BLOCK_ENTITY);
		SLOW_HOPPER_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, SLOW_HOPPER_RECIPE_ID, new SpecialRecipeSerializer<SlowHopperRecipe>(SlowHopperRecipe::new));

		HOPPER_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, HOPPER_RECIPE_ID, new SpecialRecipeSerializer<HopperRecipe>(HopperRecipe::new));

		System.out.println("Speedy Hopper mod loaded!");
	}
}

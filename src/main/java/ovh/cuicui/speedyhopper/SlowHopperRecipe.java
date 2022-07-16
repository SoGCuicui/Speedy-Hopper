package ovh.cuicui.speedyhopper;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class SlowHopperRecipe extends SpecialCraftingRecipe {
    public SlowHopperRecipe(Identifier id) {
        super(id);
    }

    @Override
    public boolean matches(CraftingInventory inv, World world) {
        int hopperExpectedPos = 0;
        boolean valid = false;
        for (int i = 0; i < inv.size(); ++i) {
            ItemStack stack = inv.getStack(i);
            Item item = stack.getItem();
            if (item.equals(Items.LINGERING_POTION) && stack.getNbt().getString("Potion").equals("minecraft:strong_slowness") && hopperExpectedPos == 0) {
                hopperExpectedPos = i + inv.getWidth();
                continue;
            }
            if (item.equals(Items.HOPPER) && i == hopperExpectedPos) {
                valid = true;
                continue;
            }
            if (!item.equals(Items.AIR)) {
                return false;
            }
        }
        return valid;
    }

    @Override
    public ItemStack craft(CraftingInventory inv) { return new ItemStack(Main.SLOW_HOPPER_BLOCK.asItem()); }

    @Override
    @Environment(EnvType.CLIENT)
    public boolean fits(int width, int height) {
        return width >= 1 && height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Main.SLOW_HOPPER_RECIPE_SERIALIZER;
    }
}

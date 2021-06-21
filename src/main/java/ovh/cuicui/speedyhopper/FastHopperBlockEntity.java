package ovh.cuicui.speedyhopper;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class FastHopperBlockEntity extends HopperBlockEntity {
    public FastHopperBlockEntity() {
        super();
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText(Main.FAST_HOPPER_CONTAINER_ID);
    }

    @Override
    public BlockEntityType<?> getType() {
        return Main.FAST_HOPPER_BLOCK_ENTITY;
    }
}

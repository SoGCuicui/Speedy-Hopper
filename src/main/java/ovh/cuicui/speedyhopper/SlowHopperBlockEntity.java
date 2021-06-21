package ovh.cuicui.speedyhopper;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class SlowHopperBlockEntity extends HopperBlockEntity {
    public SlowHopperBlockEntity() {
        super();
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText(Main.SLOW_HOPPER_CONTAINER_ID);
    }

    @Override
    public BlockEntityType<?> getType() {
        return Main.SLOW_HOPPER_BLOCK_ENTITY;
    }
}

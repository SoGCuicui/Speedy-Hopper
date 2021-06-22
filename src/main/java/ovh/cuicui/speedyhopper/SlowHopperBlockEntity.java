package ovh.cuicui.speedyhopper;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;

public class SlowHopperBlockEntity extends HopperBlockEntity {
    public SlowHopperBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
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

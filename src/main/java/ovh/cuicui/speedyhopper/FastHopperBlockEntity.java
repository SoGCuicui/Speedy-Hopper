package ovh.cuicui.speedyhopper;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class FastHopperBlockEntity extends HopperBlockEntity {
    public FastHopperBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable(Main.FAST_HOPPER_CONTAINER_ID);
    }

    @Override
    public BlockEntityType<?> getType() {
        return Main.FAST_HOPPER_BLOCK_ENTITY;
    }
}

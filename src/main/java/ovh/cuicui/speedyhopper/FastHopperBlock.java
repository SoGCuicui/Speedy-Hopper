package ovh.cuicui.speedyhopper;

import net.minecraft.block.HopperBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;

public class FastHopperBlock extends HopperBlock {
    public FastHopperBlock(Settings settings) { super(settings); }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new FastHopperBlockEntity();
    }
}

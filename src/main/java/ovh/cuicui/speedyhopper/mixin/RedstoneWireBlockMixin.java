package ovh.cuicui.speedyhopper.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneWireBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ovh.cuicui.speedyhopper.Main;

@Mixin(RedstoneWireBlock.class)
public abstract class RedstoneWireBlockMixin extends Block {
    public RedstoneWireBlockMixin(AbstractBlock.Settings settings) { super(settings); }

    // Redstone Dust, Repeaters and Comparators should be able to be placed on top of Speedy Hoppers
    @Inject(method = "canRunOnTop", at = @At("RETURN"), cancellable = true)
    private void sh_canRunOnTop_return(BlockView world, BlockPos pos, BlockState floor, CallbackInfoReturnable<Boolean> info) {
        if (floor.isOf(Main.FAST_HOPPER_BLOCK) || floor.isOf(Main.SLOW_HOPPER_BLOCK)) {
            info.setReturnValue(true);
            info.cancel();
        }
    }
}

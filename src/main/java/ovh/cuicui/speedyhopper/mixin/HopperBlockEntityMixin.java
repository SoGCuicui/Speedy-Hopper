package ovh.cuicui.speedyhopper.mixin;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ovh.cuicui.speedyhopper.Main;

@Mixin(HopperBlockEntity.class)
public abstract class HopperBlockEntityMixin extends LootableContainerBlockEntity {
    public HopperBlockEntityMixin(BlockEntityType<?> type) { super(type); }

    @Shadow
    private int transferCooldown;

    // Change the cooldown of Speedy Hoppers
    @Inject(method = "setCooldown", at = @At("HEAD"), cancellable = true)
    private void sh_setCooldown_head(int cooldown, CallbackInfo info) {
        if (cooldown > 0) {
            if (this.getType() == Main.FAST_HOPPER_BLOCK_ENTITY) {
                this.transferCooldown = cooldown - 4;
                info.cancel();
            }
            if (this.getType() == Main.SLOW_HOPPER_BLOCK_ENTITY) {
                this.transferCooldown = cooldown + 8;
                info.cancel();
            }
        }
    }
}

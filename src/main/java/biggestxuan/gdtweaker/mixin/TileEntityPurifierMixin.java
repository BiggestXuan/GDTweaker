package biggestxuan.gdtweaker.mixin;

import androsa.gaiadimension.block.tileentity.TileEntityPurifier;
import androsa.gaiadimension.recipe.PurifierRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 *  @Author Biggest_Xuan
 *  2023/04/18
 */

@Mixin(value = TileEntityPurifier.class,remap = false)
public abstract class TileEntityPurifierMixin {
    @Shadow
    private NonNullList<ItemStack> purifyingItemStacks;

    @Inject(method = "canChange",at = @At("HEAD"),cancellable = true)
    public void _inject(CallbackInfoReturnable<Boolean> cir){
        ItemStack[] itemstack = PurifierRecipes.instance().getPurifyingResult((ItemStack)this.purifyingItemStacks.get(0));
        if(itemstack == null){
            cir.setReturnValue(false);
        }
    }
}

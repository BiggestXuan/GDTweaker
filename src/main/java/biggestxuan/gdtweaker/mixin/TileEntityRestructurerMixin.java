package biggestxuan.gdtweaker.mixin;

import androsa.gaiadimension.block.tileentity.TileEntityRestructurer;
import androsa.gaiadimension.recipe.RestructurerRecipes;
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

@Mixin(value = TileEntityRestructurer.class,remap = false)
public abstract class TileEntityRestructurerMixin {
    @Shadow
    private NonNullList<ItemStack> restructurerItemStacks;

    @Inject(method = "canChange",at = @At("HEAD"),cancellable = true)
    public void _inject(CallbackInfoReturnable<Boolean> cir){
        ItemStack[] stack = RestructurerRecipes.instance().getRefactoringResult(restructurerItemStacks.get(0));
        if(stack == null){
            cir.setReturnValue(false);
        }
    }
}

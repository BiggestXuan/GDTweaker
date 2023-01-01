package biggestxuan.gdtweaker;

import androsa.gaiadimension.recipe.RestructurerRecipe;
import androsa.gaiadimension.registry.ModRecipes;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IIngredient;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.managers.IRecipeManager;
import com.blamejared.crafttweaker.impl.actions.recipes.ActionAddRecipe;
import com.blamejared.crafttweaker.impl.actions.recipes.ActionRemoveRecipeByName;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.gdtweaker.RestructurerRecipe")
public class CrTRestructurerRecipe implements IRecipeManager {
    @ZenCodeType.Method
    public void addRecipe(String name, IIngredient input, IItemStack output1, IItemStack output2, float xp, int time){
        RestructurerRecipe recipe = new RestructurerRecipe(GDTweaker.rl(name),"",input.asVanillaIngredient(),output1.getImmutableInternal(),output2.getImmutableInternal(),xp,time);
        CraftTweakerAPI.apply(new ActionAddRecipe(this,recipe,""));
    }

    @ZenCodeType.Method
    public void removeRecipeByName(String name){
        String[] n = name.split(":");
        ResourceLocation rl = new ResourceLocation(n[0],n[1]);
        CraftTweakerAPI.apply(new ActionRemoveRecipeByName(this,rl));
    }

    @Override
    public IRecipeType<RestructurerRecipe> getRecipeType() {
        return ModRecipes.RESTRUCTURING;
    }
}

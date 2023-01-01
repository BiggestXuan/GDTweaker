package biggestxuan.gdtweaker;

import androsa.gaiadimension.recipe.RecipeHandler;
import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.GDTweaker.GDTweaker")
public class GDTweakerRecipe {
    @ZenMethod
    public static void addPurifyRecipe(IItemStack input, IItemStack output1, IItemStack output2, float xp) {
        RecipeHandler.addPurifying(CraftTweakerMC.getItemStack(input),CraftTweakerMC.getItemStack(output1),CraftTweakerMC.getItemStack(output2),xp);
    }
    @ZenMethod
    public static void addGlitterRecipe(IItemStack input, IItemStack output1, IItemStack output2, float xp){
        RecipeHandler.addGlitterRefactoring(CraftTweakerMC.getItemStack(input),CraftTweakerMC.getItemStack(output1),CraftTweakerMC.getItemStack(output2),xp);
    }
    @ZenMethod
    public static void removePurifyRecipe(IItemStack input){
        CraftTweakerAPI.apply(new RemoveRecipeAction.removePurifyRecipe(CraftTweakerMC.getItemStack(input)));
    }
    @ZenMethod
    public static void removeGlitterRecipe(IItemStack input){
        CraftTweakerAPI.apply(new RemoveRecipeAction.removeGlitterRecipe(CraftTweakerMC.getItemStack(input)));
    }
}

package biggestxuan.gdtweaker;

import androsa.gaiadimension.recipe.PurifierRecipes;
import androsa.gaiadimension.recipe.RestructurerRecipes;
import crafttweaker.IAction;
import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.Map;

public abstract class RemoveRecipeAction implements IAction {
    public ItemStack input;
    public RemoveRecipeAction(ItemStack input){
        this.input = input;
    }

    public static class removePurifyRecipe extends RemoveRecipeAction{
        public removePurifyRecipe(ItemStack input) {
            super(input);
        }

        @Override
        public void apply() {
            Map<ItemStack,ItemStack[]> map = PurifierRecipes.instance().getPurifyingList();
            Iterator<Map.Entry<ItemStack,ItemStack[]>> it = map.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<ItemStack,ItemStack[]> entry = it.next();
                ItemStack stack = entry.getKey();
                if(stack.getItem().getRegistryName() != null && stack.getItem().getRegistryName().equals(input.getItem().getRegistryName())){
                    it.remove();
                }
            }
        }

        @Override
        public String describe() {
            return "Remove Purify Recipe By Input:"+ input;
        }
    }

    public static class removeGlitterRecipe extends RemoveRecipeAction{
        public removeGlitterRecipe(ItemStack input) {
            super(input);
        }

        @Override
        public void apply() {
            Map<ItemStack,ItemStack[]> map = RestructurerRecipes.instance().getGlitteringList();
            Iterator<Map.Entry<ItemStack,ItemStack[]>> it = map.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<ItemStack,ItemStack[]> entry = it.next();
                ItemStack stack = entry.getKey();
                if(stack.getItem().getRegistryName() != null && stack.getItem().getRegistryName().equals(input.getItem().getRegistryName())){
                    it.remove();
                }
            }
        }

        @Override
        public String describe() {
            return "Remove Glitter Recipe By Input:"+ input;
        }
    }
}

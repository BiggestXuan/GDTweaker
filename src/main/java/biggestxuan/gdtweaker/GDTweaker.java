package biggestxuan.gdtweaker;

import com.blamejared.crafttweaker.CraftTweaker;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(GDTweaker.MODID)
public class GDTweaker {
    public static final String MODID = "gdtweaker";

    public GDTweaker() {
    }

    public static ResourceLocation rl(String value){
        return new ResourceLocation(CraftTweaker.MODID,value);
    }
}

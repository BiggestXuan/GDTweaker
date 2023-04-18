package biggestxuan.gdtweaker;

import org.spongepowered.asm.mixin.Mixins;
import zone.rong.mixinbooter.MixinLoader;

/**
 *  @Author Biggest_Xuan
 *  2023/04/18
 */

@MixinLoader
public class MixinInit {
    public MixinInit(){
        Mixins.addConfiguration("mixins.gdtweaker.json");
    }
}

package biggestxuan.gdtweaker;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = GDTweaker.MODID, name = GDTweaker.NAME, version = GDTweaker.VERSION,
dependencies = "required-after:crafttweaker;"+"required-after:gaiadimension;")
public class GDTweaker
{
    public static final String MODID = "gdtweaker";
    public static final String NAME = "GD Tweaker";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}

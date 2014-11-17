package disconsented.DisconUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.MODID)
public class Main
{
    public static final String MODID = "DisconUtils";
    public static final String VERSION = "1.0";
    public static final Settings settings = Settings.getInstance();
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());		
		config.load();
		settings.setInvulnerability(config.getBoolean("Hurt resistance", config.CATEGORY_GENERAL, false, "true will disable the time window where entitys can't take damage"));		
		config.save();
	}
    
    @EventHandler 
    public void load(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(new EntityInvulnerability());
    }
}

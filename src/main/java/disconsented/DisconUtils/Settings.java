/**
 * 
 */
package disconsented.DisconUtils;

/**
 * @author Disconsented
 * Singleton class which holds the mods settings
 */
public class Settings {
	
	private static boolean invul = false;
	private static Settings instance = null;
	   protected Settings() {
	      // Exists only to defeat instantiation.
	   }
	   public static Settings getInstance() {
	      if(instance == null) {
	         instance = new Settings();
	      }
	      return instance;
	   }
	   public boolean getInvulnerability()
	   {
		   return invul;
	   }
	   public void setInvulnerability(Boolean setting)
	   {
		   this.invul = setting;
	   }

}

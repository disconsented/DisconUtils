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
	private boolean printEntitys = false;
	private boolean printBlocks = false;
	private boolean printItems = false;
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
	public boolean isPrintEntitys() {
		return printEntitys;
	}
	public void setPrintEntitys(boolean printEntitys) {
		this.printEntitys = printEntitys;
	}
	public boolean isPrintBlocks() {
		return printBlocks;
	}
	public void setPrintBlocks(boolean printBlocks) {
		this.printBlocks = printBlocks;
	}
	public boolean isPrintItems() {
		return printItems;
	}
	public void setPrintItems(boolean printItems) {
		this.printItems = printItems;
	}

}

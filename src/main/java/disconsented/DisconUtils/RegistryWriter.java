package disconsented.DisconUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
public class RegistryWriter{
	public static void Write(int entry){
		List<String> temp = null;
		String registryName = null;
		switch (entry){
		case 1:
			temp = new ArrayList<String>(Item.itemRegistry.getKeys());
			registryName = "item.registry";
		break;
		case 2:
			temp = new ArrayList(Arrays.asList(EntityList.func_151515_b().toArray())); ;
			registryName = "entity.registry";
		break;
		case 3:
			temp = new ArrayList<String>(Block.blockRegistry.getKeys());
			registryName = "block.registry";
		break;
		}
			try {
				FileWriter fileWriter = new FileWriter(registryName);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				for (int i = 0; i < temp.size(); i++){
					bufferedWriter.write(temp.get(i));
					bufferedWriter.newLine();
				}
					bufferedWriter.close();
				}
				catch(IOException ex) {
					System.out.println("Error writing to file '"+ "itemRegister.txt" + "'");
					ex.printStackTrace();
			}
		}
	}
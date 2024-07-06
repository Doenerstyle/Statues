/**
 * Container class for the statue
 */

package info.jbcs.minecraft.statues;

import net.minecraft.entity.player.InventoryPlayer;
import pl.asie.lib.block.ContainerBase;

public class ContainerShowcase extends ContainerBase {

	public ContainerShowcase(InventoryPlayer inventory, TileEntityShowcase tile) {
		super(tile, inventory);
		
		addSlotToContainer(new SlotHand(tile, 0, 120, 59));

		bindPlayerInventory(inventory, 48, 144);
		
		tile.openInventory(); // Removing this line fixes the lid not closing in the dev environment, but not in the built jar.
	}
}

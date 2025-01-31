/*
 * ******************************************************************************
 *  Copyright 2011-2015 CovertJaguar
 *
 *  This work (the API) is licensed under the "MIT" License, see LICENSE.md for details.
 * ***************************************************************************
 */

package mods.railcraft.api.core.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Should be implemented by any rail item class that wishes to have
 * it's rails placed by for example the Tunnel Bore or Track Relayer.
 *
 * If you defined your rails with a TrackSpec, you don't need to worry about this.
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public interface ITrackItem {

    /**
     * Attempts to place a track.
     *
     * @param stack
     * @param world The World object
     * @param i x-Coord
     * @param j y-Coord
     * @param k z-Coord
     * @return true if successful
     */
    public boolean placeTrack(ItemStack stack, World world, int i, int j, int k);

    /**
     * Return the block of a placed track.
     *
     * @return the blockId
     */
    public Block getPlacedBlock();

    /**
     * Return true if the given tile entity corresponds to this Track item.
     *
     * If the track has no tile entity, return true on null.
     *
     * @param stack
     * @param tile
     * @return
     */
    public boolean isPlacedTileEntity(ItemStack stack, TileEntity tile);
}

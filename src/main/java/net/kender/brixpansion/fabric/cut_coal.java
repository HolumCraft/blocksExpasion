package net.kender.brixpansion.fabric;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class cut_coal extends PillarBlock {
public cut_coal(Settings settings) {
super(settings);
}

@Override
public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
 super.onBlockAdded(state, world, pos, oldState, notify);

}
}
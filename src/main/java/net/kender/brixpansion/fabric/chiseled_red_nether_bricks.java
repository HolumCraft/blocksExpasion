package net.kender.brixpansion.fabric;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class chiseled_red_nether_bricks extends PillarBlock {
public chiseled_red_nether_bricks(Settings settings) {
super(settings);
}

@Override
public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
 super.onBlockAdded(state, world, pos, oldState, notify);

}
}

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.util.EnumFacing
import net.minecraft.util.math.AxisAlignedBB
import net.minecraft.util.math.BlockPos
import net.minecraft.world.IBlockAccess
import net.minecraft.block.state.BlockFaceShape

content.registerBlock('pda_bobby', new Block(Material.ROCK) {

	protected static final AxisAlignedBB PDA_AABB =
		new AxisAlignedBB(
			4/16D, 0D, 4/16D,
			12/16D, 1/16D, 12/16D
		)

	AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos) {
		return PDA_AABB
	}

	boolean isOpaqueCube(IBlockState state) {
		return false
	}

	boolean isFullCube(IBlockState state) {
		return false
	}

	BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.UNDEFINED
	}
})
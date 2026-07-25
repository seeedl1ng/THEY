import net.minecraftforge.event.world.WorldEvent.Load

event_manager.listen { Load event ->
	def world = event.world

	if (!world.isRemote && world.totalWorldTime == 0) {
		world.setWorldTime(22812)
	}
}
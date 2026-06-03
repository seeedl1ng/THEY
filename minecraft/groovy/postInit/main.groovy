import net.minecraftforge.fml.common.registry.ForgeRegistries
import net.minecraftforge.fml.common.gameevent.PlayerEvent
import net.minecraftforge.fml.common.FMLCommonHandler

def hide(stack) {
	mods.hei.ingredient.hide(stack)
	stack.item.setCreativeTab(null)
}
// выборочно
crafting.remove('cobwebs:cobweb')

hide(item('clmodcev:block_of_chainmail'))
crafting.remove('clmodcev:crafting_chain_link_3')

mods.hei.ingredient.hide(item('nocubessrparmory:thereaper'))
mods.hei.ingredient.hide(item('nocubessrparmory:thereapertrue'))

hide(item('baubles:max_verstappen'))
hide(item('baubles:creeper_cast'))
// Kelp Forest
hide(item('biomesoplenty:seaweed'))
// Origin Island
hide(item('biomesoplenty:terrarium', 13))
crafting.remove('biomesoplenty:origin_terrarium')

hide(item('biomesoplenty:flower_1', 5))
crafting.remove('biomesoplenty:red_dye_from_rose')

hide(item('biomesoplenty:sapling_1'))
ore_dict.remove('treeSapling', item('biomesoplenty:sapling_1'))

hide(item('biomesoplenty:grass', 5))

hide(item('biomesoplenty:leaves_2', 8))
ore_dict.remove('treeLeaves', item('biomesoplenty:leaves_2', 8))
// ЗАМЕНИ НА PYROTECH если поменяешь мнение !!!
ore_dict.add('campfire', item('simpledifficulty:campfire'))
// SNM кровати
def beds = []

crafting.streamRecipes()
	.filter {
		it.recipeOutput?.registryName?.namespace == 'simplenightmares' &&
		it.recipeOutput?.registryName?.path?.endsWith('_oakbed')
	}
	.forEach {
		beds << it.recipeOutput.copy()
	}

crafting.streamRecipes()
	.filter {
		it.recipeOutput?.registryName?.namespace == 'simplenightmares' &&
		it.recipeOutput?.registryName?.path?.endsWith('_oakbed')
	}
	.removeAll()

beds.unique().each {
	mods.hei.ingredient.removeAndHide(it)
}

mods.hei.ingredient.removeAndHide(item('simplenightmares:wroughtironbed'))
mods.hei.ingredient.removeAndHide(item('simplenightmares:wroughtcincinnasitebed'))
// HammerCore
ForgeRegistries.ITEMS.each { i ->
	if (i.registryName.namespace == 'hammercore') {
		mods.hei.ingredient.hide(item(i.registryName.toString()))
	}
}

ForgeRegistries.ITEMS.each { i ->
	if (i.registryName.namespace == 'hammercore') {
		i.setCreativeTab(null)
	}
}
ForgeRegistries.BLOCKS.each { b ->
	if (b.registryName.namespace == 'hammercore') {
		b.setCreativeTab(null)
	}
}

crafting.remove('hammercore:manual')
// TAB
def updateTab() {
	def server = FMLCommonHandler.instance().minecraftServerInstance
	if (server == null) return

	def scoreboard = server.worlds[0].scoreboard

	if (scoreboard.getObjective("hp") == null) {
		server.commandManager.executeCommand(server, "scoreboard objectives add hp health")
	}

	if (server.playerList.currentPlayerCount >= 2) {
		server.commandManager.executeCommand(server, "scoreboard objectives setdisplay list hp")
	} else {
		server.commandManager.executeCommand(server, "scoreboard objectives setdisplay list")
	}
}

event_manager.listen(PlayerEvent.PlayerLoggedInEvent, { updateTab() })
event_manager.listen(PlayerEvent.PlayerLoggedOutEvent, { updateTab() })
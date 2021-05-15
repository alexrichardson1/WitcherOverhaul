package alex.witcher.overhaul.enchantment;

import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

  public static final WolvenArmourEnchantment WOLVEN_ARMOUR_ENCHANTMENT = WolvenArmourEnchantment.INSTANCE;

  public static void register() {
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_armour"), WOLVEN_ARMOUR_ENCHANTMENT);
  }
}

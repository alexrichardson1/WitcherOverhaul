package alex.witcher.overhaul.enchantment;

import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

  public static final Enchantment WOLVEN_ARMOUR_ENCHANTMENT = WolvenArmourEnchantment.INSTANCE;
  public static final Enchantment WOLVEN_WEAPON_ENCHANTMENT = WolvenWeaponEnchantment.INSTANCE;

  public static void register() {
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_armour"), WOLVEN_ARMOUR_ENCHANTMENT);
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_weapon"), WOLVEN_WEAPON_ENCHANTMENT);
  }
}

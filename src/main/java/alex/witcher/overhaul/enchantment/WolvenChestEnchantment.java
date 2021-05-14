package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class WolvenChestEnchantment extends WolvenEnchantment {

  public final static WolvenEnchantment INSTANCE = new WolvenChestEnchantment();

  private WolvenChestEnchantment() {
    super(Rarity.VERY_RARE, EnchantmentTarget.ARMOR_CHEST,
        new EquipmentSlot[]{EquipmentSlot.CHEST});
  }

  @Override
  public int getProtectionAmount(int level, DamageSource source) {
    if (source.isOutOfWorld()) {
      return 0;
    } else if (source.isProjectile()) {
      return level * 5;
    }
    return level;
  }

  @Override
  public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
    super.onUserDamaged(user, attacker, level);
  }
}
package net.leventeand1.soul.enchantment;

import net.leventeand1.soul.effect.ModEffects;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.gameevent.GameEvent;

public class SoulPowerEnchantment extends Enchantment {
    public SoulPowerEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot... pApplicableSlots) {
        super(rarity, category, pApplicableSlots);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            ServerLevel world = ((ServerLevel) pAttacker.level);
            BlockPos position = pTarget.blockPosition();

            if (pLevel == 1) {
                pAttacker.addEffect(new MobEffectInstance(ModEffects.CURSE_OF_THE_SOULS.get(), 100));
            }

            if (pLevel == 2) {
                pAttacker.addEffect(new MobEffectInstance(ModEffects.CURSE_OF_THE_SOULS.get(), 200));
                pTarget.hurtMarked
            }

        }

        super.doPostAttack(pAttacker, pTarget, pLevel);
    }


}

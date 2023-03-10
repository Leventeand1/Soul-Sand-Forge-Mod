package net.leventeand1.soul.effect;

import net.leventeand1.soul.Main;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Main.MOD_ID);

    public static final RegistryObject<MobEffect> CURSE_OF_THE_SOULS = MOB_EFFECTS.register("curse_of_the_souls", () -> new CurseOfTheSoulsEffect(MobEffectCategory.HARMFUL, 352922));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}

package net.leventeand1.soul.dimensions;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {

    public static final ResourceKey<DimensionType> THE_BEYOND = register("the_beyond");
    public static final ResourceLocation THE_BEYOND_EFFECTS = new ResourceLocation("the_beyond");


    private static ResourceKey<DimensionType> register(String p_223548_) {
        return ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(p_223548_));
    }
}

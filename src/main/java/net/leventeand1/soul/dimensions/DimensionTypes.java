package net.leventeand1.soul.dimensions;

import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.dimension.DimensionType;

import java.util.OptionalLong;

public class DimensionTypes {
    public static void bootstrap(BootstapContext<DimensionType> types) {
        types.register(ModDimensions.THE_BEYOND, new DimensionType(OptionalLong.of(18000L), false, true, false, false, 8.4D, false, false, 0, 300, 150, BlockTags.INFINIBURN_NETHER, ModDimensions.THE_BEYOND_EFFECTS, 0.5f, new DimensionType.MonsterSettings(true, false, ConstantInt.of(7), 15)));
    }
}

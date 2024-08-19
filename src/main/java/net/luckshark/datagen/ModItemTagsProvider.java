package net.luckshark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.luckshark.item.ModItems;
import net.luckshark.tags.ModItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.ADISC)
                .add(ModItems.ADISC_MUSIC_DISC_TEST)
                .add(ModItems.ADISC_MUSIC_DISC_UTAKOTOBA)
                .add(ModItems.ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER)
                .add(ModItems.ADISC_MUSIC_DISC_SILHOUETTEDANCE)
                .add(ModItems.ADISC_MUSIC_DISC_SENZAIHYOUMEI)
                .add(ModItems.ADISC_MUSIC_DISC_SASURAI)
                .add(ModItems.ADISC_MUSIC_DISC_SHIORI)
                .add(ModItems.ADISC_MUSIC_DISC_REFRAIN)
                .add(ModItems.ADISC_MUSIC_DISC_PANORAMA)
                .add(ModItems.ADISC_MUSIC_DISC_OTOICHIE)
                .add(ModItems.ADISC_MUSIC_DISC_NOROSHI)
                .add(ModItems.ADISC_MUSIC_DISC_NAMONAKI)
                .add(ModItems.ADISC_MUSIC_DISC_KOKYUU)
                .add(ModItems.ADISC_MUSIC_DISC_KAISOU)
                .add(ModItems.ADISC_MUSIC_DISC_HEKITENBANSOU)
                .add(ModItems.ADISC_MUSIC_DISC_HARUHIKAGE)
                .add(ModItems.ADISC_MUSIC_DISC_MAYOIUTA)
                .add(ModItems.ADISC_MUSIC_DISC_MELODY)
                .add(ModItems.ADISC_MUSIC_DISC_TANEBI)

                .add(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN)
                .add(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE)

                .add(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA)
                .add(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH)
                .add(ModItems.ADISC_MUSIC_DISC_ANGLES)

                .add(ModItems.ADISC_MUSIC_DISC_BOND_EIGHTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_ELEVENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FIFTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FIRST)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTEENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_NINTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_SECOND)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_SEVENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_SIXTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_TENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_THIRD)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_THIRTEENTH)
                .add(ModItems.ADISC_MUSIC_DISC_BOND_TWELFTH)

                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_1)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_10)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_11)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_12)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_13)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_14)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_15)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_16)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_17)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_18)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_19)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_2)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_20)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_21)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_3)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_4)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_5)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_6)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_7)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_8)
                .add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_9)

                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_1)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_10)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_11)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_12)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_13)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_14)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_15)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_16)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_17)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_18)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_19)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_2)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_20)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_21)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_22)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_23)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_24)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_25)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_26)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_27)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_28)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_29)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_3)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_30)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_4)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_5)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_6)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_7)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_8)
                .add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_9)


        ;
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .addTag(ModItemTags.ADISC)
        ;
    }
}

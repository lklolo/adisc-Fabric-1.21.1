package net.luckshark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.luckshark.item.ModItemGroups;
import net.luckshark.item.ModItems;
import net.luckshark.tags.ModItemTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItemGroups.ADISC_GROUP, "ADisc唱片");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TEST, "AdiscTest唱片");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_KOKYUU, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_KAISOU, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_NAMONAKI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SENZAIHYOUMEI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SASURAI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_REFRAIN, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_MELODY, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SHIORI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SILHOUETTEDANCE, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_UTAKOTOBA, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TANEBI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_NOROSHI, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_MAYOIUTA, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_PANORAMA, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_SINGANDPLAYTOGETHER, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_HEKITENBANSOU, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_OTOICHIE, "It's MyGO!!!!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_HARUHIKAGE, "It's MyGO!!!!!");
        translationBuilder.add("jukebox_song.adisc.adisc_test", "Test");
        translationBuilder.add("jukebox_song.adisc.adisc_kokyuu", "It's MyGO!!!!! - 処救生");
        translationBuilder.add("jukebox_song.adisc.adisc_kaisou", "It's MyGO!!!!! - 回層浮");
        translationBuilder.add("jukebox_song.adisc.adisc_namonaki", "It's MyGO!!!!! - 名無声");
        translationBuilder.add("jukebox_song.adisc.adisc_senzaihyoumei", "It's MyGO!!!!! - 潜在表明");
        translationBuilder.add("jukebox_song.adisc.adisc_sasurai", "It's MyGO!!!!! - 砂寸奏");
        translationBuilder.add("jukebox_song.adisc.adisc_refrain", "It's MyGO!!!!! - 輪符雨");
        translationBuilder.add("jukebox_song.adisc.adisc_melody", "It's MyGO!!!!! - 迷路日々");
        translationBuilder.add("jukebox_song.adisc.adisc_shiori", "It's MyGO!!!!! - 栞");
        translationBuilder.add("jukebox_song.adisc.adisc_silhouettedance", "It's MyGO!!!!! - 影色舞");
        translationBuilder.add("jukebox_song.adisc.adisc_utakotoba", "It's MyGO!!!!! - 詩超絆");
        translationBuilder.add("jukebox_song.adisc.adisc_tanebi", "It's MyGO!!!!! - 焚音打");
        translationBuilder.add("jukebox_song.adisc.adisc_noroshi", "It's MyGO!!!!! - 無路矢");
        translationBuilder.add("jukebox_song.adisc.adisc_mayoiuta", "It's MyGO!!!!! - 迷星叫");
        translationBuilder.add("jukebox_song.adisc.adisc_panorama", "It's MyGO!!!!! - 端程山");
        translationBuilder.add("jukebox_song.adisc.adisc_singandplaytogether", "It's MyGO!!!!! - 歌いましょう鳴らしましょう（一同歌唱一同奏响）");
        translationBuilder.add("jukebox_song.adisc.adisc_hekitenbansou", "It's MyGO!!!!! - 碧天伴走");
        translationBuilder.add("jukebox_song.adisc.adisc_otoichie", "It's MyGO!!!!! - 音一会");
        translationBuilder.add("jukebox_song.adisc.adisc_haruhikage", "It's MyGO!!!!! - 春日影");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_CRYCHICHARUHIKAGE, "CRYCHIC");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WANTTOBEHUMAN, "CRYCHIC");
        translationBuilder.add("jukebox_song.adisc.adisc_crychicharuhikage", "CRYCHIC - 春日影");
        translationBuilder.add("jukebox_song.adisc.adisc_wanttobehuman", "CRYCHIC - 人間になりたいうた（想成为人类）");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BLACKBIRTH, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_ANGLES, "Ave Mujica");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_WELCOMETOAVEMUJICA, "Ave Mujica");
        translationBuilder.add("jukebox_song.adisc.adisc_blackbirth", "Ave Mujica - 黒のバースデイ (黑色生日)");
        translationBuilder.add("jukebox_song.adisc.adisc_angles", "Ave Mujica - Angles");
        translationBuilder.add("jukebox_song.adisc.adisc_welcometoavemujica", "Ave Mujica - 素晴らしき世界でもどこにもない場所（欢迎来到Ave Mujica的世界）");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_EIGHTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_eighth", "结束バンド - カラカラ（卡拉卡拉）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_ELEVENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_eleventh", "结束バンド - 忘れてやらない（绝不会忘记）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FIFTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fifth", "结束バンド - ギターと孤独と蒼い惑星（吉他与孤独与蓝色星球）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FIRST, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_first", "结束バンド - 青春コンプレックス（青春症候群）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTEENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fourteenth", "结束バンド - 転がる岩、君に朝が降る（翻转岩石，晨光洒落你身）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_FOURTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_fourth", "结束バンド - ひみつ基地（秘密基地）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_NINTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_ninth", "结束バンド - 小さな海（小小的海）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SECOND, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_second", "结束バンド - ひとりぼっち東京（孤独东京）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SEVENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_seventh", "结束バンド - あのバンド（那个乐队）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_SIXTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_sixth", "结束バンド - ラブソングが歌えない（不会唱情歌）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_TENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_tenth", "结束バンド - なにが悪い（有什么不好）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRD, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_third", "结束バンド - Distortion!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_THIRTEENTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_thirteenth", "结束バンド - フラッシュバッカー（往日重现）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOND_TWELFTH, "结束バンド");
        translationBuilder.add("jukebox_song.adisc.adisc_bond_twelfth", "结束バンド - 星座になれたら（若能化作星座）");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_1, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_1", "TOGENASHI TOGEARI - Cycle Of Sorrow");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_10, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_10", "TOGENASHI TOGEARI - 理想的パラドクスとは");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_11, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_11", "TOGENASHI TOGEARI - 名もなき何もかも");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_12, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_12", "TOGENASHI TOGEARI - 気鬱、白濁す");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_13, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_13", "TOGENASHI TOGEARI - 傷つき傷つけ痛くて辛い");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_14, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_14", "TOGENASHI TOGEARI - 声なき魚");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_15, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_15", "TOGENASHI TOGEARI - 視界の隅 朽ちる音");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_16, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_16", "TOGENASHI TOGEARI - 誰にもなれない私だから");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_17, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_17", "TOGENASHI TOGEARI - 偽りの理");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_18, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_18", "TOGENASHI TOGEARI - 心象的フラクタル");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_19, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_19", "TOGENASHI TOGEARI - 運命に賭けたい論理");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_2, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_2", "TOGENASHI TOGEARI - ETERNAL FLAME 〜空の箱");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_20, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_20", "TOGENASHI TOGEARI - 運命の華");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_21, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_21", "TOGENASHI TOGEARI - 雑踏、僕らの街");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_3, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_3", "TOGENASHI TOGEARI - サヨナラサヨナラサヨナラ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_4, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_4", "TOGENASHI TOGEARI - 爆ぜて咲く");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_5, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_5", "TOGENASHI TOGEARI - 碧いif");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_6, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_6", "TOGENASHI TOGEARI - 極私的極彩色アンサー");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_7, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_7", "TOGENASHI TOGEARI - 空の箱");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_8, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_8", "TOGENASHI TOGEARI - 空白とカタルシス");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_TOGETOGE_9, "TOGENASHI TOGEARI");
        translationBuilder.add("jukebox_song.adisc.adisc_togetoge_9", "TOGENASHI TOGEARI - 黎明を穿つ");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_1, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_1", "放課後ティータイム~ - 天使にふれたよ!（相遇天使）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_10, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_10", "放課後ティータイム~ - GO! GO! MANIAC");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_11, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_11", "放課後ティータイム~ - Utauyo!!MIRACLE");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_12, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_12", "放課後ティータイム~ - Don't say ''lazy''");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_13, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_13", "放課後ティータイム~ - Listen!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_14, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_14", "放課後ティータイム~ - NO, Thank You!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_15, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_15", "放課後ティータイム~ - いちばんいっぱい");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_16, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_16", "放課後ティータイム~ - Singing!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_17, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_17", "放課後ティータイム~ - 青春Vibration");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_18, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_18", "放課後ティータイム~ - Oh My ギー太!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_19, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_19", "放課後ティータイム~ - いちごパフェが止まらない");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_2, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_2", "放課後ティータイム~ - ふわふわ時間");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_20, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_20", "放課後ティータイム~ - Over the Starlight");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_21, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_21", "放課後ティータイム~ - ぴゅあぴゅあはーと（纯纯的心）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_22, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_22", "放課後ティータイム~ - Drumming Shining My Life");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_23, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_23", "放課後ティータイム~ - jump");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_24, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_24", "放課後ティータイム~ - Maddy Candy");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_25, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_25", "放課後ティータイム~ - ラヴ（Love）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_26, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_26", "放課後ティータイム~ - 純情Bomber!!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_27, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_27", "放課後ティータイム~ - 桜が丘女子高等学校校歌（樱丘女子高等学校校歌）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_28, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_28", "放課後ティータイム~ - ときめきシュガー");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_29, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_29", "放課後ティータイム~ - わたしの恋はホッチキス");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_3, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_3", "放課後ティータイム~ - ごはんはおかず（米饭是配菜）");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_30, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_30", "放課後ティータイム~ - Sweet Bitter Beauty Song");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_4, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_4", "放課後ティータイム~ - U&I");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_5, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_5", "放課後ティータイム~ - Sweet Bitter Beauty Song");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_6, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_6", "放課後ティータイム~ - ウキウキNew! My Way");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_7, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_7", "放課後ティータイム~ - Diaryはフォルテシモ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_8, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_8", "放課後ティータイム~ - Honey sweet tea time");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_COMEWITHME_9, "K-ON!");
        translationBuilder.add("jukebox_song.adisc.adisc_comewithme_9", "放課後ティータイム~ - Cagayake!GIRLS");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_1, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_1", "DAOKO×米津玄師 - 打上花火");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_10, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_10", "DAOKO - GRY");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_11, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_11", "DAOKO - もしも僕らがGAMEの主役で");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_12, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_12", "DAOKO - ゆめみてたのあたし");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_13, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_13", "DAOKO - Cinderella step");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_14, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_14", "DAOKO - ワンルーム・シーサイド・ステップ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_2, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_2", "DAOKO - DAOKO×岡村靖幸 - ステップアップLOVE");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_3, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_3", "DAOKO - Juicy");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_4, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_4", "DAOKO - さみしいかみさま");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_5, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_5", "DAOKO - ShibuyaK");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_6, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_6", "DAOKO - BANG!");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_7, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_7", "DAOKO - ダイスキ with TeddyLoid");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_8, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_8", "DAOKO - 拝啓グッバイさようなら");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_THANK17_9, "2017 - THANK YOU BLUE");
        translationBuilder.add("jukebox_song.adisc.adisc_thank17_9", "DAOKO - 同じ夜");

        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_1, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_1", "YOASOBI - Epilogue");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_2, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_2", "YOASOBI - アンコール");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_3, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_3", "YOASOBI - ハルジオン");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_4, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_4", "YOASOBI - あの夢をなぞって");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_5, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_5", "YOASOBI - たぶん");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_6, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_6", "YOASOBI - 群青");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_7, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_7", "YOASOBI - ハルカ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_8, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_8", "YOASOBI - 夜に駆ける");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK1_9, "THE BOOK");
        translationBuilder.add("jukebox_song.adisc.adisc_book1_9", "YOASOBI - Prologue");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_1, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_1", "YOASOBI×ミドリーズ  - ツバメ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_2, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_2", "YOASOBI - 三原色");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_3, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_3", "YOASOBI - 大正浪漫");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_4, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_4", "YOASOBI - もう少しだけ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_5, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_5", "YOASOBI - 優しい彗星");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_6, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_6", "YOASOBI - 怪物");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_7, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_7", "YOASOBI - もしも命が描けたら");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK2_8, "THE BOOK 2");
        translationBuilder.add("jukebox_song.adisc.adisc_book2_8", "YOASOBI - ラブレター");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_1, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_1", "YOASOBI - 勇者");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_10, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_10", "YOASOBI - 好きだ");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_2, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_2", "YOASOBI - Interlude 'Awakening'");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_3, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_3", "YOASOBI - 祝福");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_4, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_4", "YOASOBI - 海のまにまに");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_5, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_5", "YOASOBI - ミスター");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_6, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_6", "YOASOBI - Interlude 'Worship'");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_7, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_7", "YOASOBI - アイドル");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_8, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_8", "YOASOBI - セブンティーン");
        translationBuilder.add(ModItems.ADISC_MUSIC_DISC_BOOK3_9, "THE BOOK 3");
        translationBuilder.add("jukebox_song.adisc.adisc_book3_9", "YOASOBI - アドベンチャー");
    }}

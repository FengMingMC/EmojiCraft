package top.fengmingsysu.emojicraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.fengmingsysu.emojicraft.EmojiCraft;

public class CreativeModTabList {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmojiCraft.MODID);
    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> EMOJICRAFT = CREATIVE_MODE_TABS.register("emojicraft", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.emojicraft"))
            .icon(() -> ItemList.Smiling_Face_With_Heart_Eyes.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemList.Smiling_Face_With_Heart_Eyes.get());
            }).build()
    );
}

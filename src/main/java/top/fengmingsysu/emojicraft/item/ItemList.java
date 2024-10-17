package top.fengmingsysu.emojicraft.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.fengmingsysu.emojicraft.EmojiCraft;

public class ItemList {
    public static final DeferredRegister.Items ITEM = DeferredRegister.createItems(EmojiCraft.MODID);

    public static final DeferredItem<Item> Smiling_Face_With_Heart_Eyes = ITEM.register("smiling_face_with_heart_eyes", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Emoji_Element = ITEM.register("emoji_element", ()-> new Item(new Item.Properties()));
}

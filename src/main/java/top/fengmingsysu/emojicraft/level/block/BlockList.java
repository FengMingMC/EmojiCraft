package top.fengmingsysu.emojicraft.level.block;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.fengmingsysu.emojicraft.EmojiCraft;

public class BlockList {
    public static final DeferredRegister.Blocks BLOCK = DeferredRegister.createBlocks(EmojiCraft.MODID);

    public static final DeferredBlock<EmojiOre> EMOJI_ORE = BLOCK.register("emoji_ore",EmojiOre::new);
}

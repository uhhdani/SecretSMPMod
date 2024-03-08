package net.uhhdani.secretsmpmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.uhhdani.secretsmpmod.SecretSMPMod;

public class ModItems {



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SecretSMPMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SecretSMPMod.LOGGER.info("Registering mod items for " + SecretSMPMod.MOD_ID);
    }
}

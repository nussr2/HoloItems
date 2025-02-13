package xyz.holocons.mc.holoitemsrevamp.collection.gen0;

import java.util.List;

import com.strangeone101.holoitemsapi.CustomItem;

import org.jetbrains.annotations.NotNull;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import xyz.holocons.mc.holoitemsrevamp.collection.Idol;

public class AZKi extends Idol {

    private static final String name = "azki";
    private static final String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDVhNjU0ZjM4MzAyZDI0NWU1OWVjNWY5ZjZjYjQ2NzQ4YzgzNDJjYjU1MmQ3OTY1M2YxMTk4YTVmYWEwYTQ2OCJ9fX0=";

    public AZKi(CustomItem... items) {
        super(name, base64, items);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.text("AZKi")
                .color(TextColor.color(0xD11C76))
                .decoration(TextDecoration.BOLD, true)
                .decoration(TextDecoration.ITALIC, false);
    }

    @Override
    public List<Component> getLore() {
        return null;
    }
}
            
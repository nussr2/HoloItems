package xyz.holocons.mc.holoitemsrevamp.collection.gamers;

import java.util.List;

import com.strangeone101.holoitemsapi.CustomItem;

import org.jetbrains.annotations.NotNull;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import xyz.holocons.mc.holoitemsrevamp.collection.Idol;

public class InugamiKorone extends Idol {

    private static final String name = "inugamikorone";
    private static final String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJlN2NkZDkwYzEyZGFkOWFmYzAwYjkzYTZlYjA4ZmNhZTkzNmM0ZDlmOTE1ZTc0MGQ0NWQ3MzAyMjkyNTczNCJ9fX0=";

    public InugamiKorone(CustomItem... items) {
        super(name, base64, items);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.text("Inugami Korone")
                .color(TextColor.color(0xDBB314))
                .decoration(TextDecoration.BOLD, true)
                .decoration(TextDecoration.ITALIC, false);
    }

    @Override
    public List<Component> getLore() {
        return null;
    }
}

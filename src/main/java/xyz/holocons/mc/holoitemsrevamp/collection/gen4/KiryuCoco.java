package xyz.holocons.mc.holoitemsrevamp.collection.gen4;

import java.util.List;

import com.strangeone101.holoitemsapi.CustomItem;

import org.jetbrains.annotations.NotNull;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import xyz.holocons.mc.holoitemsrevamp.collection.Idol;

public class KiryuCoco extends Idol {

    private static final String name = "kiryucoco";
    private static final String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWZlODczZDI3Y2M1YzM5ODgwYjk0ZGQyZGJmNDViOWM3NTc4OWExOGVhNDQyZmJlZTFmYTI4YWI4N2FjMTk4MSJ9fX0=";

    public KiryuCoco(CustomItem... items) {
        super(name, base64, items);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.text("Kiryu Coco")
                .color(TextColor.color(0xDC7310))
                .decoration(TextDecoration.BOLD, true)
                .decoration(TextDecoration.ITALIC, false);
    }

    @Override
    public List<Component> getLore() {
        return null;
    }
}

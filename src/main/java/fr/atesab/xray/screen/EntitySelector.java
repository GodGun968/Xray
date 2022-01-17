package fr.atesab.xray.screen;

import fr.atesab.xray.color.EntityTypeInfo;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.registry.Registry;

public abstract class EntitySelector extends EnumSelector<EntityTypeInfo> {

    public EntitySelector(Screen parent) {
        super(new TranslatableText("x13.mod.esp.selector"), parent,
                Registry.ENTITY_TYPE.stream().map(EntityTypeInfo::new));
    }

}

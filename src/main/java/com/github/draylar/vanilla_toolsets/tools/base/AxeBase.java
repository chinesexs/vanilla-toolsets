package com.github.draylar.vanilla_toolsets.tools.base;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem
{
    public AxeBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, 3, -3.0f, new Item.Settings().itemGroup(ItemGroup.TOOLS));
    }
}

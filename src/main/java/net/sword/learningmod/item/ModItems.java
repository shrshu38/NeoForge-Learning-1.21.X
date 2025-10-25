package net.sword.learningmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sword.learningmod.LearningMod;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LearningMod.MODID);
    //ITEMS是一個data type是DeferredRegister.Items的Object, 他被定義為(=後面) 在準備要被forge註冊進遊戲的item的物品清單(DeferredRegister內部結構裡有一個像是List的東西)。

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));
    //ITEMS.register就是加入註冊清單的method。裡面的() -> new Item(new Item.Properties())就是在告訴forge該如何建立這個物品，BISMUTH應該有什麼格式。

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { //在ModItems裡的register method

        ITEMS.register(eventBus); //DeferredItem.Items 的 register method

    }
    //將ITEM這個清單告訴forge的事件系統IEventBus，告訴他ITEMS也要加入載入階段的排程



}

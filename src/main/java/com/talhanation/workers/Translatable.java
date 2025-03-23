package com.talhanation.workers;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Translatable {
    public static final Component TOOLTIP_TRAVEL_INFO =  Component.translatable("gui.workers.tooltip.travel_info");
    public static final Component TOOLTIP_AUTO_START_TRAVEL =  Component.translatable("gui.workers.tooltip.autoStartTravel");

    public static final Component TOOLTIP_TRAVEL_SPEED =  Component.translatable("gui.workers.tooltip.travelSpeed");
    public static final Component TEXT_TRAVEL_INFO =  Component.translatable("chat.workers.text.travel_info");
    public static final Component TOOLTIP_TRAVEL_START =  Component.translatable("gui.workers.tooltip.travel_start");
    public static final Component TOOLTIP_TRAVEL_STOP =  Component.translatable("gui.workers.tooltip.travel_stop");
    public static final Component TOOLTIP_TRAVEL_RETURN =  Component.translatable("gui.workers.tooltip.travel_return");
    public static final Component TOOLTIP_FARMER_USE_EGGS = Component.translatable("gui.workers.tooltip.farmerUseEggs");
    public static final Component TEXT_BUTTON_ADD_WAYPOINT = Component.translatable("gui.workers.button.travel_add_waypoint");
    public static final Component TEXT_BUTTON_TRAVEL_RETURN = Component.translatable("gui.workers.button.travel_return");
    public static final Component TEXT_BUTTON_TRAVEL_START = Component.translatable("gui.workers.button.travel_start");
    public static final Component TEXT_BUTTON_TRAVEL_STOP = Component.translatable("gui.workers.button.travel_stop");
    public static final Component TEXT_BUTTON_FOLLOW = Component.translatable("gui.workers.button.follow");
    public static final Component TOOLTIP_SEND_INFO =  Component.translatable("gui.workers.tooltip.sendInfo");
    public static final Component TOOLTIP_LUMBER_REPLANT = Component.translatable("gui.workers.tooltip.lumberjackReplant");

    public static Component TEXT_HELLO(String job) {
        return Component.translatable("chat.workers.text.hello", job);
    }

    public static Component TEXT_HELLO_OWNED(String job, String owner) {
        return Component.translatable("chat.workers.text.hello_owned", job, owner);
    }

    // TODO: Use these only when work starts
    public static final Component TEXT_RECRUITED1 = Component.translatable("chat.workers.text.recruited1");
    public static final Component TEXT_RECRUITED2 = Component.translatable("chat.workers.text.recruited2");
    public static final Component TEXT_RECRUITED3 = Component.translatable("chat.workers.text.recruited3");

    public static Component TEXT_ATTACKED(String job, String attacker) {
        return Component.translatable("chat.workers.text.attacked", job, attacker);
    }

    public static final Component TEXT_WORKING = Component.translatable("chat.workers.text.working");
    public static final Component TEXT_DONE = Component.translatable("chat.workers.text.done");
    public static final Component TEXT_STARVING = Component.translatable("chat.workers.text.starving");

    public static final Component TEXT_FOLLOW = Component.translatable("chat.workers.text.follow");
    public static final Component TEXT_CONTINUE = Component.translatable("chat.workers.text.continue");
    public static final Component TEXT_WANDER = Component.translatable("chat.workers.text.wander");

    public static MutableComponent TEXT_DISBAND(String name) {
        return Component.translatable("chat.workers.text.disband", name);
    }

    public static MutableComponent TEXT_NO_PAYMENT(String name) {
        return Component.translatable("chat.workers.text.noPaymentInUpkeep", name);
    }

    /*
    public static Component TEXT_BED_KEY() {
        Component currentMapping = ModShortcuts.ASSIGN_BED_KEY.getTranslatedKeyMessage();
        return Component.translatable("chat.workers.controls.assign_bed_key", currentMapping);
    }
    public static Component TEXT_CHEST_KEY() {
        Component currentMapping = ModShortcuts.ASSIGN_CHEST_KEY.getTranslatedKeyMessage();
        return Component.translatable("chat.workers.controls.assign_chest_key", currentMapping);
    }
    public static Component TEXT_WORKSPACE_KEY() {
        Component currentMapping = ModShortcuts.ASSIGN_WORKSPACE_KEY.getTranslatedKeyMessage();
        return Component.translatable("chat.workers.controls.assign_workspace_key", currentMapping);
    }

     */
    public static Component TEXT_OUT_OF_TOOLS() {
        return Component.translatable("chat.workers.text.outOfTools");
    }

    public static Component TEXT_HIRE_COSTS(int cost, String item) {
        return Component.translatable("chat.workers.text.hire_costs", cost, item);
    }
    public static Component TEXT_NEED(int sollPrice, Item emerald) {
        return Component.translatable("chat.workers.text.need", sollPrice, emerald);
    }

    public static Component TEXT_NO_NEED(Item emerald) {
        return Component.translatable("chat.workers.text.noNeed", emerald);
    }
    public static final Component TEXT_FISHER_NO_WATER = Component.translatable("chat.workers.text.fisherNoWater");
    public static final Component TEXT_OUT_OF_STOCK = Component.translatable("chat.workers.text.outOfStock");
    public static final Component TEXT_OUT_OF_STOCK_OWNER = Component.translatable("chat.workers.text.outOfStockOwner");
    public static final Component TEXT_INV_FULL = Component.translatable("chat.workers.text.invFull");
    public static final Component TEXT_INV_FULL_OWNER = Component.translatable("chat.workers.text.invFullOwner");
    public static final Component TEXT_HOME = Component.translatable("chat.workers.text.home");

    public static final Component NEED_CHEST = Component.translatable("chat.workers.needChest");
    public static final Component TEXT_CHEST = Component.translatable("chat.workers.text.chest");
    public static final Component TEXT_CHEST_ERROR = Component.translatable("chat.workers.text.chestError");
    public static final Component NEED_BED = Component.translatable("chat.workers.needBed");
    public static final Component TEXT_BED = Component.translatable("chat.workers.text.bed");
    public static final Component TEXT_BED_ERROR = Component.translatable("chat.workers.text.bedError");

    public static final Component TEXT_NO_FOOD = Component.translatable("chat.workers.text.noFoodInUpkeep");
    public static final Component TEXT_NO_SPACE_INV = Component.translatable("chat.workers.text.noSpaceInvForUpkeep");

    public static final Component TEXT_NO_PICKAXE = Component.translatable("chat.workers.text.noPickaxe");
    public static final Component TEXT_NO_FISHING_ROD = Component.translatable("chat.workers.text.noFishingRod");
    public static final Component TEXT_BUTTON_WORK_POS = Component.translatable("gui.workers.button.workPos");
    public static final Component TEXT_BUTTON_CHEST_POS = Component.translatable("gui.workers.button.chestPos");
    public static final Component TEXT_BUTTON_SLEEP_POS = Component.translatable("gui.workers.button.sleepPos");

    public static final MutableComponent TEXT_CANT_FIND_CHEST = Component.translatable("chat.workers.cantFindChest");
    public static final MutableComponent TEXT_CHEST_FULL = Component.translatable("chat.workers.chestFull");
    public static final MutableComponent TEXT_COULD_NOT_DEPOSIT = Component.translatable("chat.workers.couldNotDeposit");
    public static final Component TEXT_WAYPOINT_NOT_NEAR_TO_PREV = Component.translatable("chat.workers.text.waypointNotNearToPrev");
    public static final Component TEXT_NO_SPACE_FOR_TRADE = Component.translatable("chat.workers.text.noSpaceInvForTrade");

}

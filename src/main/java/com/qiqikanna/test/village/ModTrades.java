package com.qiqikanna.test.village;

import com.qiqikanna.test.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModTrades
{
    public static void registerTrades()
    {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,1,factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.BASKETBALL_BLOCK,1,16,5));
            factories.add(new TradeOffers.SellItemFactory(ModItems.SHIT.getDefaultStack(),1,4,16,5,0.5F));
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.STRAWBERRY,5),
                    new ItemStack(Items.EMERALD,6),
                    12,6,0.5F
            )));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,2,factories -> {
            factories.add(new TradeOffers.ProcessItemFactory(
                    Items.GOLDEN_APPLE,2,16,
                    Items.ENCHANTED_GOLDEN_APPLE,1,
                    12,5));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,1,factories ->
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD_BLOCK,3),
                        new ItemStack(Items.BOOK,1),
                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS,10)),
                        1,10,0.1F
                )));

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ICE_ETHER_MASTER,1,factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.ICE_ETHER,1,16,5));
            factories.add(new TradeOffers.SellItemFactory(ModItems.FIRE_ETHER_AXE.getDefaultStack(),1,1,16,5,0.5F));

        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ICE_ETHER_MASTER,2,factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.FIRE_ETHER,1,16,5));
            factories.add(new TradeOffers.SellItemFactory(ModItems.FIRE_ETHER_PICKAXE.getDefaultStack(),1,1,16,5,0.5F));

        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ICE_ETHER_MASTER,2,factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.ICE_ETHER_BLOCK,1,16,5));
            factories.add(new TradeOffers.SellItemFactory(ModItems.ICE_ETHER_CHESTPLATE.getDefaultStack(),1,1,16,5,0.5F));

        });
    }
}

package com.github.gnottero;

import com.github.gnottero.blocks.GenericVerticalSlab;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GnotDeco implements ModInitializer {

	public static final String MODID = "minecraft";

	public static final Block ACACIA_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block ANDESITE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block BIRCH_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block BLACKSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block COBBLESTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block CRIMSON_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block CUT_SANDSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block DARK_OAK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block DARK_PRISMARINE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block DIORITE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block END_STONE_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block GRANITE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block JUNGLE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block NETHER_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block OAK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block PETRIFIED_OAK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block POLISHED_DIORITE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block POLISHED_GRANITE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block PRISMARINE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block PURPUR_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block QUARTZ_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block RED_SANDSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block SANDSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block SMOOTH_SANDSTONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block SMOOTH_STONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block SPRUCE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block STONE_BRICK_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block STONE_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block WARPED_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
	public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = new GenericVerticalSlab(FabricBlockSettings.of(Material.STONE).hardness(2.0f));

	@Override
	public void onInitialize() {
		
		Registry.register(Registry.BLOCK, new Identifier(MODID, "acacia_vertical_slab"), ACACIA_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "acacia_vertical_slab"), new BlockItem(ACACIA_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "andesite_vertical_slab"), ANDESITE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "andesite_vertical_slab"), new BlockItem(ANDESITE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "birch_vertical_slab"), BIRCH_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "birch_vertical_slab"), new BlockItem(BIRCH_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "blackstone_vertical_slab"), BLACKSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "blackstone_vertical_slab"), new BlockItem(BLACKSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "brick_vertical_slab"), BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "brick_vertical_slab"), new BlockItem(BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cobbled_deepslate_vertical_slab"), COBBLED_DEEPSLATE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cobbled_deepslate_vertical_slab"), new BlockItem(COBBLED_DEEPSLATE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cobblestone_vertical_slab"), COBBLESTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cobblestone_vertical_slab"), new BlockItem(COBBLESTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "crimson_vertical_slab"), CRIMSON_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "crimson_vertical_slab"), new BlockItem(CRIMSON_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cut_copper_vertical_slab"), CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cut_copper_vertical_slab"), new BlockItem(CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cut_red_sandstone_vertical_slab"), CUT_RED_SANDSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cut_red_sandstone_vertical_slab"), new BlockItem(CUT_RED_SANDSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "cut_sandstone_vertical_slab"), CUT_SANDSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cut_sandstone_vertical_slab"), new BlockItem(CUT_SANDSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "dark_oak_vertical_slab"), DARK_OAK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "dark_oak_vertical_slab"), new BlockItem(DARK_OAK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "dark_prismarine_vertical_slab"), DARK_PRISMARINE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "dark_prismarine_vertical_slab"), new BlockItem(DARK_PRISMARINE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "deepslate_brick_vertical_slab"), DEEPSLATE_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "deepslate_brick_vertical_slab"), new BlockItem(DEEPSLATE_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "deepslate_tile_vertical_slab"), DEEPSLATE_TILE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "deepslate_tile_vertical_slab"), new BlockItem(DEEPSLATE_TILE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "diorite_vertical_slab"), DIORITE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "diorite_vertical_slab"), new BlockItem(DIORITE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "end_stone_brick_vertical_slab"), END_STONE_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "end_stone_brick_vertical_slab"), new BlockItem(END_STONE_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "exposed_cut_copper_vertical_slab"), EXPOSED_CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "exposed_cut_copper_vertical_slab"), new BlockItem(EXPOSED_CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "granite_vertical_slab"), GRANITE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "granite_vertical_slab"), new BlockItem(GRANITE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "jungle_vertical_slab"), JUNGLE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "jungle_vertical_slab"), new BlockItem(JUNGLE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "mossy_cobblestone_vertical_slab"), MOSSY_COBBLESTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mossy_cobblestone_vertical_slab"), new BlockItem(MOSSY_COBBLESTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "mossy_stone_brick_vertical_slab"), MOSSY_STONE_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mossy_stone_brick_vertical_slab"), new BlockItem(MOSSY_STONE_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "nether_brick_vertical_slab"), NETHER_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "nether_brick_vertical_slab"), new BlockItem(NETHER_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "oak_vertical_slab"), OAK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "oak_vertical_slab"), new BlockItem(OAK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "oxidized_cut_copper_vertical_slab"), OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "oxidized_cut_copper_vertical_slab"), new BlockItem(OXIDIZED_CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "petrified_oak_vertical_slab"), PETRIFIED_OAK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "petrified_oak_vertical_slab"), new BlockItem(PETRIFIED_OAK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "polished_andesite_vertical_slab"), POLISHED_ANDESITE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "polished_andesite_vertical_slab"), new BlockItem(POLISHED_ANDESITE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "polished_blackstone_brick_vertical_slab"), POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "polished_blackstone_brick_vertical_slab"), new BlockItem(POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "polished_blackstone_vertical_slab"), POLISHED_BLACKSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "polished_blackstone_vertical_slab"), new BlockItem(POLISHED_BLACKSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "polished_deepslate_vertical_slab"), POLISHED_DEEPSLATE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "polished_deepslate_vertical_slab"), new BlockItem(POLISHED_DEEPSLATE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "polished_diorite_vertical_slab"), POLISHED_DIORITE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "polished_diorite_vertical_slab"), new BlockItem(POLISHED_DIORITE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "polished_granite_vertical_slab"), POLISHED_GRANITE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "polished_granite_vertical_slab"), new BlockItem(POLISHED_GRANITE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "prismarine_brick_vertical_slab"), PRISMARINE_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "prismarine_brick_vertical_slab"), new BlockItem(PRISMARINE_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "prismarine_vertical_slab"), PRISMARINE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "prismarine_vertical_slab"), new BlockItem(PRISMARINE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "purpur_vertical_slab"), PURPUR_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "purpur_vertical_slab"), new BlockItem(PURPUR_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "quartz_vertical_slab"), QUARTZ_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "quartz_vertical_slab"), new BlockItem(QUARTZ_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "red_nether_brick_vertical_slab"), RED_NETHER_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "red_nether_brick_vertical_slab"), new BlockItem(RED_NETHER_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "red_sandstone_vertical_slab"), RED_SANDSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "red_sandstone_vertical_slab"), new BlockItem(RED_SANDSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "sandstone_vertical_slab"), SANDSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "sandstone_vertical_slab"), new BlockItem(SANDSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "smooth_quartz_vertical_slab"), SMOOTH_QUARTZ_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "smooth_quartz_vertical_slab"), new BlockItem(SMOOTH_QUARTZ_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "smooth_red_sandstone_vertical_slab"), SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "smooth_red_sandstone_vertical_slab"), new BlockItem(SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "smooth_sandstone_vertical_slab"), SMOOTH_SANDSTONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "smooth_sandstone_vertical_slab"), new BlockItem(SMOOTH_SANDSTONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "smooth_stone_vertical_slab"), SMOOTH_STONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "smooth_stone_vertical_slab"), new BlockItem(SMOOTH_STONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "spruce_vertical_slab"), SPRUCE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "spruce_vertical_slab"), new BlockItem(SPRUCE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "stone_brick_vertical_slab"), STONE_BRICK_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "stone_brick_vertical_slab"), new BlockItem(STONE_BRICK_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "stone_vertical_slab"), STONE_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "stone_vertical_slab"), new BlockItem(STONE_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "warped_vertical_slab"), WARPED_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "warped_vertical_slab"), new BlockItem(WARPED_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "waxed_cut_copper_vertical_slab"), WAXED_CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "waxed_cut_copper_vertical_slab"), new BlockItem(WAXED_CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "waxed_exposed_cut_copper_vertical_slab"), WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "waxed_exposed_cut_copper_vertical_slab"), new BlockItem(WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "waxed_oxidized_cut_copper_vertical_slab"), WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "waxed_oxidized_cut_copper_vertical_slab"), new BlockItem(WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "waxed_weathered_cut_copper_vertical_slab"), WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "waxed_weathered_cut_copper_vertical_slab"), new BlockItem(WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MODID, "weathered_cut_copper_vertical_slab"), WEATHERED_CUT_COPPER_VERTICAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier(MODID, "weathered_cut_copper_vertical_slab"), new BlockItem(WEATHERED_CUT_COPPER_VERTICAL_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));

		System.out.println("Hello Fabric world!");
	}
}

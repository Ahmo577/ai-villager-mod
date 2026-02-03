package com.example.aivillager.entity;

import com.example.aivillager.AIVillagerMod;
import com.example.aivillager.entity.ai.VillagerAIEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(ForgeRegistries.ENTITIES, AIVillagerMod.MOD_ID);

    public static final RegistryObject<EntityType<VillagerAIEntity>> AI_VILLAGER =
        ENTITY_TYPES.register("ai_villager", () ->
            EntityType.Builder.create(VillagerAIEntity::new, EntityClassification.CREATURE)
                .size(0.6f, 1.95f)
                .build(new ResourceLocation(AIVillagerMod.MOD_ID, "ai_villager").toString()));
}
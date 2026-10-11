package com.ggzlou.optimizer;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GGZlouOptimizer implements ModInitializer {
    public static final String MOD_ID = "ggzlouoptimizer";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("GGZlouOptimizer загружен!");
        LOGGER.info("Оптимизатор готов к работе на Minecraft 1.21.11.");
    }
}

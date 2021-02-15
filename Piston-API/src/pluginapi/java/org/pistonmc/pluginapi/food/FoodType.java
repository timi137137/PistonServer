package org.pistonmc.pluginapi.food;

public enum FoodType {
    APPLE,
    BAKED_POTATO,
    BEEF,
    BEETROOT,
    BEETROOT_SOUP,
    BREAD,
    CARROT,
    CHICKEN,
    CHORUS_FRUIT,
    COD,
    COOKED_BEEF,
    COOKED_CHICKEN,
    COOKED_COD,
    COOKED_MUTTON,
    COOKED_PORKCHOP,
    COOKED_RABBIT,
    COOKED_SALMON,
    COOKIE,
    DRIED_KELP,
    ENCHANTED_GOLDEN_APPLE,
    GOLDEN_APPLE,
    GOLDEN_CARROT,
    HONEY_BOTTLE,
    MELON_SLICE,
    MUSHROOM_STEW,
    MUTTON,
    POISONOUS_POTATO,
    PORKCHOP,
    POTATO,
    PUFFERFISH,
    PUMPKIN_PIE,
    RABBIT,
    RABBIT_STEW,
    ROTTEN_FLESH,
    SALMON,
    SPIDER_EYE,
    SUSPICIOUS_STEW,
    SWEET_BERRIES,
    TROPICAL_FISH,
    MOD {
        private Food specificFood;

        @Override
        public void setSpecificFood(Food specificFood) {
            this.specificFood = specificFood;
        }

        @Override
        public Food getSpecificFood() {
            return specificFood;
        }
    },
    UNKNOWN;

    public void setSpecificFood(Food specificFood) {
        throw new UnsupportedOperationException();
    }

    public Food getSpecificFood() {
        throw new UnsupportedOperationException();
    }
}
package buzzies;

import carpet.api.settings.Rule;

import static carpet.api.settings.RuleCategory.*;

public class CarpetBuzziesSettings {
    public static final String BUZZIES = "buzzies";

    public enum BeeNestGenerationOptions {
        VANILLA, OFF, ALWAYS, ALWAYS_ALL;

        public boolean cancelsDefaultDecorator() {
            return this != VANILLA;
        }

        public boolean usesAlwaysDecorator() {
            return this == ALWAYS || this == ALWAYS_ALL;
        }
    }

    @Rule(categories = {BUZZIES, CREATIVE})
    public static BeeNestGenerationOptions beeNestGeneration = BeeNestGenerationOptions.VANILLA;

    @Rule(categories = {BUZZIES, CREATIVE})
    public static boolean beeNestsGenerateBees = true;
}

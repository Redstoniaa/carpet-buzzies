package buzzies;

import carpet.CarpetServer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuzziesMod implements ModInitializer {
    public static final String MOD_ID = "carpet-buzzies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        //LOGGER.info("beenest gaming");
        CarpetServer.manageExtension(new BuzziesExtension());
    }

}

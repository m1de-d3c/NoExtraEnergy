package net.moras.noextraenergy;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModConfig {
    public static final String MOD_ID = "noextraenergy";
    public static final Identifier IDENTIFIER = new Identifier(MOD_ID, "mod");
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier getIdentifier(String _n) {
        return new Identifier(MOD_ID, _n);
    }
}

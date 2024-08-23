package me.kvdpxne.dico;

import java.util.Collection;
import org.bukkit.entity.Player;

/**
 * @since 0.1.0
 */
public interface LocalPlayers {

    /**
     * @since 0.1.0
     */
    Player[] asArray();

    /**
     * @since 0.1.0
     */
    Collection<? extends Player> asCollection();
}

package me.kvdpxne.dico;

import java.util.Collection;
import org.bukkit.entity.Player;

/**
 * Represents a collection of local players, providing methods to access them as
 * an array or a collection.
 *
 * @since 0.1.0
 */
public interface LocalPlayers {

  /**
   * Returns the players as an array.
   *
   * @return The players as an array.
   * @since 0.1.0
   */
  Player[] asArray();

  /**
   * Returns the players as a collection.
   *
   * @return The players as a collection.
   * @since 0.1.0
   */
  Collection<? extends Player> asCollection();
}

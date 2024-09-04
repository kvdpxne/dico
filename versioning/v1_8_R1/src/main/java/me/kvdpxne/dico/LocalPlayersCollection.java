package me.kvdpxne.dico;

import java.util.Collection;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Represents a collection of local players, providing methods to access them as
 * an array or a collection.
 * <p>
 * This implementation uses the Bukkit API's collection of online players.
 *
 * @since 0.1.0
 */
final class LocalPlayersCollection
  implements LocalPlayers {

  /**
   * Constructs a new {@link LocalPlayersCollection} instance.
   *
   * @since 0.1.0
   */
  LocalPlayersCollection() {
  }

  @Override
  public Player[] asArray() {
    return Bukkit.getOnlinePlayers().toArray(Player[]::new);
  }

  @Override
  public Collection<? extends Player> asCollection() {
    return Bukkit.getOnlinePlayers();
  }
}

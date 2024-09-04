package me.kvdpxne.dico;

import java.util.Arrays;
import java.util.Collection;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Represents a collection of local players, providing methods to access them as
 * an array or a collection.
 * <p>
 * This implementation uses the Bukkit API to retrieve the online players.
 *
 * @since 0.1.0
 */
final class LocalPlayersArray
  implements LocalPlayers {

  /**
   * Constructs a new {@link LocalPlayersArray} instance.
   *
   * @since 0.1.0
   */
  LocalPlayersArray() {
  }

  @Override
  public Player[] asArray() {
    return Bukkit.getOnlinePlayers();
  }

  @Override
  public Collection<? extends Player> asCollection() {
    return Arrays.asList(Bukkit.getOnlinePlayers());
  }
}

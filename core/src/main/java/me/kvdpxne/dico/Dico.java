package me.kvdpxne.dico;

import me.kvdpxne.notchity.MinecraftVersionCreator;

/**
 * Provides utility methods for working with local players in a Bukkit server.
 *
 * @since 0.1.0
 */
public final class Dico {

  /**
   * Prevents instantiation of the {@link Dico} class.
   * <p>
   * This class is intended to be used as a utility class and should not be
   * instantiated directly.
   *
   * @throws UnsupportedOperationException Always thrown to indicate that
   *                                       instantiation is not supported.
   * @since 0.1.0
   */
  private Dico() {
    throw new UnsupportedOperationException(
      "Dico is a utility class and cannot be instantiated."
    );
  }

  /**
   * Retrieves a collection of local players.
   * <p>
   * The implementation chosen depends on the Bukkit version. For versions
   * 1.7.10 and later, {@link LocalPlayersCollection} is used; while for earlier
   * versions, {@link LocalPlayersArray} is used.
   *
   * @return A collection of local players.
   * @since 0.1.0
   */
  public static LocalPlayers getLocalPlayers() {
    // The most efficient way to compare versions
    if (MinecraftVersionCreator.getMinecraftVersion().isLaterThanOrEqual(1_007_010)) {
      return new LocalPlayersCollection();
    }

    return new LocalPlayersArray();
  }
}

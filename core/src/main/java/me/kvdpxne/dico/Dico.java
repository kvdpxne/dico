package me.kvdpxne.dico;

import me.kvdpxne.notchity.VersionCreator;

/**
 * @since 0.1.0
 */
public final class Dico {

  /**
   * @since 0.1.0
   */
  public static LocalPlayers getLocalPlayers() {
    if (VersionCreator.getBukkitVersion().isLaterThanOrEqual(10710)) {
      return new LocalPlayersCollection();
    }

    return new LocalPlayersArray();
  }
}

package me.kvdpxne.dico;

import java.util.Collection;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

final class LocalPlayersCollection
  implements LocalPlayers {

  @Override
  public Player[] asArray() {
    return Bukkit.getOnlinePlayers().toArray(Player[]::new);
  }

  @Override
  public Collection<? extends Player> asCollection() {
    return Bukkit.getOnlinePlayers();
  }
}

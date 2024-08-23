package me.kvdpxne.dico;

import java.util.Arrays;
import java.util.Collection;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

final class LocalPlayersArray
  implements LocalPlayers {

  @Override
  public Player[] asArray() {
    return Bukkit.getOnlinePlayers();
  }

  @Override
  public Collection<? extends Player> asCollection() {
    return Arrays.asList(Bukkit.getOnlinePlayers());
  }
}

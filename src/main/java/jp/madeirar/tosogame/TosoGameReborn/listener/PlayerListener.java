package jp.madeirar.tosogame.TosoGameReborn.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerListener implements Listener {
	public void onPVPEvent(EntityDamageByEntityEvent event) {
		if((event.getEntity() instanceof Player) && (event.getDamager() instanceof Player)) {
			event.setDamage(0);
			Player def = (Player)event.getEntity();
			Player att = (Player)event.getDamager();
		}
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.madeirar.tosogame.TosoGameReborn.api;

import org.bukkit.Bukkit;

import jp.madeirar.tosogame.TosoGameReborn.api.event.GameStartEvent;
import jp.madeirar.tosogame.TosoGameReborn.api.event.GameStopEvent;

/**
 *
 * @author peko
 */
public class GameUtility {
    
    public void start(){
        Bukkit.getServer().getPluginManager().callEvent(new GameStartEvent());
    }
    
    public void stop(){
        Bukkit.getServer().getPluginManager().callEvent(new GameStopEvent());
    }
}

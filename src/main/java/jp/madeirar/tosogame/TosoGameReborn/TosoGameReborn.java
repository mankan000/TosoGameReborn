package jp.madeirar.tosogame.TosoGameReborn;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

/**
*
* @author peko mankan000
*/

public class TosoGameReborn extends JavaPlugin implements Listener {

	public static Scoreboard score;
    public static ScoreboardManager sbmanager = Bukkit.getScoreboardManager();//まずスコアボードマネージャーを取得します
    public static Scoreboard sboard = sbmanager.getMainScoreboard();//次にスコアボードを取得します
    public static List<Team> toso = new ArrayList<Team>();
    public static List<Team> hunter = new ArrayList<Team>();
    public static List<Team> jail = new ArrayList<Team>();
    public static List<Team> rec = new ArrayList<Team>();
    public static List<Team> admin = new ArrayList<Team>();

	@Override
    public void onEnable() {
        saveDefaultConfig();
        //regEvents();
        //config();
    }
	@Override
    public void onDisable() {
    	getLogger().info("The TosoGame3 plugin has been unloaded!");
    }


	//チーム作成。待機フェイズにチームを作成し、リセットフェイズで解散する
	public void CreateTeam() {
		//ボツコード Team team = sboard.registerNewTeam("tososya");
	}

}
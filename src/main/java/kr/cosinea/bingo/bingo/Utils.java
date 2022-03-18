package kr.cosinea.bingo;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Utils {

    static Map<UUID, UUID> player = new HashMap<>();
    static Map<UUID, Integer> start = new HashMap<>();
    static Map<UUID, Integer> choice = new HashMap<>();
    static Map<UUID, String> question = new HashMap<>();
    static Map<UUID, String> chat = new HashMap<>();
    static Map<UUID, Integer> click = new HashMap<>();
    static Map<UUID, int[][]> bingo = new HashMap<>();
    static Map<UUID, Integer> bingoCheck = new HashMap<>();

    public void randomChat(Player p, Player p2, Integer random) {
        // Map에 문제 넣기
        String str = Bingo.getPlugin(Bingo.class).getConfig().getString("문제." + random);
        chat.put(p.getUniqueId(), "");
        chat.put(p2.getUniqueId(), "");
        question.put(p.getUniqueId(), str);
        question.put(p2.getUniqueId(), str);
        // 채팅으로 문제 출력
        p.sendMessage(option() + "아래 단어를 빠르게 입력하세요!");
        p.sendMessage(option() + "§6§l" + str);
        p2.sendMessage(option() + "아래 단어를 빠르게 입력하세요!");
        p2.sendMessage(option() + "§6§l" + str);
        // 채팅 체크
        new BukkitRunnable() {
            @Override
            public void run() {
                if (chat.containsKey(p.getUniqueId())) {
                    if (chat.containsValue(str)) {
                        cancel();
                    }
                }
            }
        }.runTaskTimer(Bingo.getInstance(), 0L, 20L);
    }
    public void gameEnd(Player p) {
        p.sendMessage(option() + "게임에서 우승하였습니다!");
        Bukkit.getPlayer(player.get(p.getUniqueId())).sendMessage(option() + "게임에서 패배하였습니다!");
        p.playSound(p.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
        Bukkit.getPlayer(player.get(p.getUniqueId())).playSound(p.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1, 1);

        start.remove(p.getUniqueId());
        start.remove(player.get(p.getUniqueId()));

        choice.remove(p.getUniqueId());
        choice.remove(player.get(p.getUniqueId()));

        question.remove(p.getUniqueId());
        question.remove(player.get(p.getUniqueId()));

        bingo.remove(p.getUniqueId());
        bingo.remove(player.get(p.getUniqueId()));

        bingoCheck.remove(p.getUniqueId());
        bingoCheck.remove(player.get(p.getUniqueId()));

        chat.remove(p.getUniqueId());
        chat.remove(player.get(p.getUniqueId()));

        click.remove(p.getUniqueId());
        click.remove(player.get(p.getUniqueId()));

        player.remove(player.get(p.getUniqueId()));
        player.remove(p.getUniqueId());
    }
    public void set(String display, int ID, int data, int stack, int loc, Inventory inv) {
        ItemStack item = (new MaterialData(ID, (byte)data)).toItemStack(stack);
        ItemMeta items = item.getItemMeta();
        items.setDisplayName(display);
        item.setItemMeta(items);
        inv.setItem(loc, item);
    }
    String option() {
        return "§f§l[ §b§l빙고 §f§l]§f§l ";
    }
}

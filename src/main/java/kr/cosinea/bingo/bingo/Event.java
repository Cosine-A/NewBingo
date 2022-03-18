package kr.cosinea.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class Event extends Utils implements Listener {
    @EventHandler
    public void choiceBingo(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equals("빙고")) {
            e.setCancelled(true);
            int[][] reset = new int[4][4];
            int clear = 0;
            if (e.getCurrentItem() == null || !e.getCurrentItem().hasItemMeta()) {
                e.setCancelled(false);
            }
            if (!(ChatColor.stripColor(e.getCurrentItem().getItemMeta().getDisplayName()).equals("O"))) {
                if (click.containsKey(p.getUniqueId()) && click.get(p.getUniqueId()) >= 1) {
                    switch (e.getRawSlot()) {
                        case 0: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[0][0] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 0, e.getClickedInventory());
                            
                            break;
                        }
                        case 1: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[0][1] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 1, e.getClickedInventory());

                            break;
                        }
                        case 2: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[0][2] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 2, e.getClickedInventory());
                            break;
                        }
                        case 3: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[0][3] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 3, e.getClickedInventory());
                            break;
                        }
                        case 9: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[1][0] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 9, e.getClickedInventory());
                            break;
                        }
                        case 10: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[1][1] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 10, e.getClickedInventory());
                            break;
                        }
                        case 11: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[1][2] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 11, e.getClickedInventory());
                            break;
                        }
                        case 12: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[1][3] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 12, e.getClickedInventory());
                            break;
                        }
                        case 18: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[2][0] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 18, e.getClickedInventory());
                            break;
                        }
                        case 19: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[2][1] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 19, e.getClickedInventory());
                            break;
                        }
                        case 20: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[2][2] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 20, e.getClickedInventory());
                            break;
                        }
                        case 21: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[2][3] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 21, e.getClickedInventory());
                            break;
                        }
                        case 27: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[3][0] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 27, e.getClickedInventory());
                            break;
                        }
                        case 28: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[3][1] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 28, e.getClickedInventory());
                            break;
                        }
                        case 29: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[3][2] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 29, e.getClickedInventory());
                            break;
                        }
                        case 30: {
                            click.remove(p.getUniqueId());
                            int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                            list[3][3] = 1;
                            bingo.put(p.getUniqueId(), list);
                            set("§a§lO", 160, 14, 1, 30, e.getClickedInventory());
                        }
                        break;
                    }
                }
            }
            if (ChatColor.stripColor(e.getCurrentItem().getItemMeta().getDisplayName()).contains("확인")) {
                int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
                switch (e.getRawSlot()) {
                    case 4: {
                        if (list[0][0] == 1 && list[0][1] == 1 && list[0][2] == 1 && list[0][3] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 4, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 13: {
                        if (list[1][0] == 1 && list[1][1] == 1 && list[1][2] == 1 && list[1][3] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 13, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 22: {
                        if (list[2][0] == 1 && list[2][1] == 1 && list[2][2] == 1 && list[2][3] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 22, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 31: {
                        if (list[3][0] == 1 && list[3][1] == 1 && list[3][2] == 1 && list[3][3] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 31, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 36: {
                        if (list[0][0] == 1 && list[1][0] == 1 && list[2][0] == 1 && list[3][0] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 36, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 37: {
                        if (list[0][1] == 1 && list[1][1] == 1 && list[2][1] == 1 && list[3][1] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 37, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 38: {
                        if (list[0][2] == 1 && list[1][2] == 1 && list[2][2] == 1 && list[3][2] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 38, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 39: {
                        if (list[0][3] == 1 && list[1][3] == 1 && list[2][3] == 1 && list[3][3] == 1) {
                            set("§e§l빙고!", 160, 5, 1, 39, e.getClickedInventory());
                            int bingoCount = bingoCheck.getOrDefault(p.getUniqueId(), clear);
                            int bingoPlus = bingoCount + 1;
                            bingoCheck.put(p.getUniqueId(), bingoPlus);
                        } else {
                            p.sendMessage(option() + "아직 라인이 덜 채워졌습니다!");
                        }
                        break;
                    }
                    case 40: {
                        int clear2 = 0;
                        int bingoClear = bingoCheck.getOrDefault(p.getUniqueId(), clear2);
                        if (bingoClear >= 2) {
                            gameEnd(p);
                            p.closeInventory();
                        } else {
                            p.sendMessage(option() + "아직 빙고가 2줄이 아닙니다!");
                        }
                        break;
                    }
                }
            }
        }
    }
    @EventHandler
    public void closeInv(InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        if(start.containsKey(p.getUniqueId())) {
            Player p2 = Bukkit.getPlayer(player.get(p.getUniqueId()));
            if (e.getInventory().getTitle().equals("빙고")) {
                if (!click.containsKey(p.getUniqueId())) {
                    new BukkitRunnable() {
                        int count = 3;

                        @Override
                        public void run() {
                            if (start.containsKey(p.getUniqueId())) {
                                p.sendMessage(option() + count + "초 후에 시작됩니다.");
                                p2.sendMessage(option() + count + "초 후에 시작됩니다.");
                                count--;
                            } else {
                                cancel();
                            }
                            if (count < 0) {
                                cancel();
                                int max = Bingo.getPlugin(Bingo.class).getConfig().getInt("단어수");
                                int random = (int) (Math.random() * max) + 1;
                                randomChat(p, p2, random);
                            }
                        }
                    }.runTaskTimer(Bingo.getInstance(), 0L, 20L);
                } else {
                    new BukkitRunnable(){
                        @Override
                        public void run() {
                            cancel();
                            Gui gui = new Gui();
                            gui.bingoGui(p);
                        }
                    }.runTaskTimer(Bingo.getInstance(), 1L, 0L);
                }
            }
        }
    }
    @EventHandler
    public void checkChatAnswer(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if(start.containsKey(p.getUniqueId())) {
            Player p2 = Bukkit.getPlayer(player.get(p.getUniqueId()));
            String message = e.getMessage();
            e.setCancelled(true);
            if(question.containsValue(message)) {
                click.put(p.getUniqueId(), click.getOrDefault(p.getUniqueId(), 0) + 1);
                chat.put(p.getUniqueId(), message);
                question.put(p.getUniqueId(), "1");
                question.put(player.get(p.getUniqueId()), "1");

                p.sendMessage(option() + "아주 빨랐습니다!");
                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1, 1);
                p2.sendMessage(option() + "너무 느렸네요..");
                p2.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);

                Gui gui = new Gui();
                gui.bingoGui(p);
            } else {
                p.sendMessage(option() + "잘못쓴거 아니죠?");
            }
        }
    }
}
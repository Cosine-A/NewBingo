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
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.scheduler.BukkitRunnable;

public class Event extends Command implements Listener {
    @EventHandler
    public void choiceBingo(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().getTitle().equals("빙고")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null || !e.getCurrentItem().hasItemMeta()) {
                e.setCancelled(false);
            }
            if (!ChatColor.stripColor(e.getCurrentItem().getItemMeta().getDisplayName()).equals("O") || choice.containsKey(p.getUniqueId())) {
                switch (e.getRawSlot()) {
                    case 0: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[0][0] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 0, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 5, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 1: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[0][1] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 1, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 6, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 2: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[0][2] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 2, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 7, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 3: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[0][3] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 3, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 8, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 9: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[1][0] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 9, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 14, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 10: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[1][1] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 10, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 15, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 11: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[1][2] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 11, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 16, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 12: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[1][3] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 12, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 17, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 18: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[2][0] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 18, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 18, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 19: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[2][1] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 19, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 24, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 20: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[2][2] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 20, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 25, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 21: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[2][3] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 21, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 26, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 27: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[3][0] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 27, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 32, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 28: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[3][1] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 28, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 33, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 29: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[3][2] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 29, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 34, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                    case 30: {
                        click.remove(p.getUniqueId());
                        invName.remove(p.getUniqueId());
                        Integer[][] list = new Integer[4][4];
                        list[3][3] = 1;
                        bingo.put(p.getUniqueId(), list);
                        setItem("§a§lO", 160, 14, 1, 30, e.getInventory());
                        setItem("§a§lO", 160, 14, 1, 35, Bukkit.getPlayer(player.get(p.getUniqueId())).getInventory());
                        break;
                    }
                }
            }
            if(e.getRawSlot() == 4) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[0][0] == 1 || list[0][1] == 1 || list[0][2] == 1 || list[0][3] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 13) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[1][0] == 1 || list[1][1] == 1 || list[1][2] == 1 || list[1][3] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 22) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[2][0] == 1 || list[2][1] == 1 || list[2][2] == 1 || list[2][3] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 31) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[3][0] == 1 || list[3][1] == 1 || list[3][2] == 1 || list[3][3] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 36) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[0][0] == 1 || list[1][0] == 1 || list[2][0] == 1 || list[3][0] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 37) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[0][1] == 1 || list[1][1] == 1 || list[2][1] == 1 || list[3][1] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 38) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[0][2] == 1 || list[1][2] == 1 || list[2][2] == 1 || list[3][2] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 39) {
                Integer[][] list = bingo.get(p.getUniqueId());
                if(list[0][3] == 1 || list[1][3] == 1 || list[2][3] == 1 || list[3][3] == 1) {
                    int bingoCount = bingoCheck.get(p.getUniqueId());
                    int bingoPlus = bingoCount + 1;
                    bingoCheck.put(p.getUniqueId(), bingoPlus);
                }
            }
            if(e.getRawSlot() == 40) {
                int bingoClear = bingoCheck.get(p.getUniqueId());
                if (bingoClear >= 2) {
                    gameEnd(p);
                    p.closeInventory();
                }
            }
        }
    }
    @EventHandler
    public void closeInv(InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        if(start.containsKey(p.getUniqueId())) {
            if (e.getInventory().getTitle().equals("빙고")) {
                Bukkit.getPlayer(player.get(p.getUniqueId())).closeInventory();
                new BukkitRunnable() {
                    int count = 3;
                    @Override
                    public void run() {
                        if (start.containsKey(p)) {
                            p.sendMessage(option() + start + "초 후에 시작됩니다.");
                            Bukkit.getPlayer(player.get(p.getUniqueId())).sendMessage(option() + start + "초 후에 시작됩니다.");
                            count--;
                        } else {
                            cancel();
                        }
                        if (count < 0) {
                            cancel();
                        }
                    }
                }.runTaskTimer(Bingo.getInstance(), 0L, 20L);
            } else {
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        cancel();
                        Gui gui = new Gui();
                        gui.bingoGui(p);
                    }
                }.runTaskTimer(Bingo.getInstance(), 5L, 0L);
            }
        }
    }
    @EventHandler
    public void checkChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if(start.containsKey(p.getUniqueId())) {
            String message = e.getMessage();
            e.setCancelled(true);
            if(question.containsValue(message)) {
                click.put(p.getUniqueId(), 1);
                chat.put(p.getUniqueId(), message);
                question.put(p.getUniqueId(), "");
                question.put(player.get(p.getUniqueId()), "");
                p.sendMessage(option() + "아주 빨랐습니다!");
                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1, 1);
                Bukkit.getPlayer(player.get(p.getUniqueId())).sendMessage(option() + "너무 느렸네요..");
                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                Gui gui = new Gui();
                gui.bingoGui(p);
                gui.bingoGui(Bukkit.getPlayer(player.get(p.getUniqueId())));
            }
        } else {
            p.sendMessage("§f§l[ §b§l빙고 §f§l]§f 잘못쓴거 아니죠?");
        }
    }
    public void gameEnd(Player p) {
        p.sendMessage(option() + "게임에서 우승하였습니다!");
        Bukkit.getPlayer(player.get(p.getUniqueId())).sendMessage(option() + "게임에서 패배하였습니다!");
        p.playSound(p.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
        Bukkit.getPlayer(player.get(p.getUniqueId())).playSound(p.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1, 1);

        start.remove(p.getUniqueId());
        start.remove(player.get(p.getUniqueId()));

        invName.remove(p.getUniqueId());
        invName.remove(player.get(p.getUniqueId()));

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
    public void setItem(String display, int ID, int data, int stack, int loc, Inventory inv) {
        ItemStack item = (new MaterialData(ID, (byte)data)).toItemStack(stack);
        ItemMeta items = item.getItemMeta();
        items.setDisplayName(display);
        item.setItemMeta(items);
        inv.setItem(loc, item);
    }
}

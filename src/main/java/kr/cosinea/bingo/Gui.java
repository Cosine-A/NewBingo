package kr.cosinea.bingo;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Gui extends Command{

    public void bingoGui(Player p) {
        if(click.containsKey(p.getUniqueId())) {
            invName.put(p.getUniqueId(), "빙고");
        }
        Inventory inv = Bukkit.createInventory(null, 45, invName.get(p.getUniqueId()) + "화면");
        Integer[][] list = bingo.get(p.getUniqueId());
        Integer[][] list2 = bingo.get(player.get(p.getUniqueId()));
        // 빙고 첫줄
        if(list[0][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[0][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[0][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[0][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        // 빙고 두번째줄
        if(list[1][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[1][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[1][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }

        if(list[1][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        p.openInventory(inv);
        // 빙고 세번째줄
        if(list[2][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[2][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[2][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[2][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        // 빙고 네번째줄
        if(list[3][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[3][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[3][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[3][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        // 아래부터 상대
        if(list2[0][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[0][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[0][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[0][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        // 빙고 두번째줄
        if(list2[1][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[1][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[1][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }

        if(list2[1][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        p.openInventory(inv);
        // 빙고 세번째줄
        if(list2[2][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[2][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[2][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[2][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        // 빙고 네번째줄
        if(list2[3][0] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[3][1] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[3][2] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list2[3][3] == 1) {
            setItem("§a§lO", 160, 14, 1, 0, inv);
        } else {
            setItem("§c§lX", 160, 0, 1, 0, inv);
        }
        // 빙고 줄 확인
        if(list[0][0] == 1 || list[0][1] == 1 || list[0][2] == 1 || list[0][3] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[1][0] == 1 || list[1][1] == 1 || list[1][2] == 1 || list[1][3] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[2][0] == 1 || list[2][1] == 1 || list[2][2] == 1 || list[2][3] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[3][0] == 1 || list[3][1] == 1 || list[3][2] == 1 || list[3][3] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[0][0] == 1 || list[1][0] == 1 || list[2][0] == 1 || list[3][0] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[0][1] == 1 || list[1][1] == 1 || list[2][1] == 1 || list[3][1] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[0][2] == 1 || list[1][2] == 1 || list[2][2] == 1 || list[3][2] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[0][3] == 1 || list[1][3] == 1 || list[2][3] == 1 || list[3][3] == 1) {
            setItem("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            setItem("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
    }
    public void setItem(String display, int ID, int data, int stack, int loc, Inventory inv) {
        ItemStack item = (new MaterialData(ID, (byte)data)).toItemStack(stack);
        ItemMeta items = item.getItemMeta();
        items.setDisplayName(display);
        item.setItemMeta(items);
        inv.setItem(loc, item);
    }
}

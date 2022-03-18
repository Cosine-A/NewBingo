package kr.cosinea.bingo;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Gui extends Utils{
    public void bingoGui(Player p) {
        Inventory inv = Bukkit.createInventory(null, 45, "빙고");
        int[][] reset = new int[4][4];
        int[][] reset2 = new int[4][4];
        int[][] list = bingo.getOrDefault(p.getUniqueId(), reset);
        int[][] list2 = bingo.getOrDefault(player.get(p.getUniqueId()), reset2);
        // 빙고 첫줄
        if(list[0][0] == 1) {
            set("§a§lO", 160, 14, 1, 0, inv);
        } else {
            set("§c§lX", 160, 0, 1, 0, inv);
        }
        if(list[0][1] == 1) {
            set("§a§lO", 160, 14, 1, 1, inv);
        } else {
            set("§c§lX", 160, 0, 1, 1, inv);
        }
        if(list[0][2] == 1) {
            set("§a§lO", 160, 14, 1, 2, inv);
        } else {
            set("§c§lX", 160, 0, 1, 2, inv);
        }
        if(list[0][3] == 1) {
            set("§a§lO", 160, 14, 1, 3, inv);
        } else {
            set("§c§lX", 160, 0, 1, 3, inv);
        }
        // 빙고 두번째줄
        if(list[1][0] == 1) {
            set("§a§lO", 160, 14, 1, 9, inv);
        } else {
            set("§c§lX", 160, 0, 1, 9, inv);
        }
        if(list[1][1] == 1) {
            set("§a§lO", 160, 14, 1, 10, inv);
        } else {
            set("§c§lX", 160, 0, 1, 10, inv);
        }
        if(list[1][2] == 1) {
            set("§a§lO", 160, 14, 1, 11, inv);
        } else {
            set("§c§lX", 160, 0, 1, 11, inv);
        }

        if(list[1][3] == 1) {
            set("§a§lO", 160, 14, 1, 12, inv);
        } else {
            set("§c§lX", 160, 0, 1, 12, inv);
        }
        // 빙고 세번째줄
        if(list[2][0] == 1) {
            set("§a§lO", 160, 14, 1, 18, inv);
        } else {
            set("§c§lX", 160, 0, 1, 18, inv);
        }
        if(list[2][1] == 1) {
            set("§a§lO", 160, 14, 1, 19, inv);
        } else {
            set("§c§lX", 160, 0, 1, 19, inv);
        }
        if(list[2][2] == 1) {
            set("§a§lO", 160, 14, 1, 20, inv);
        } else {
            set("§c§lX", 160, 0, 1, 20, inv);
        }
        if(list[2][3] == 1) {
            set("§a§lO", 160, 14, 1, 21, inv);
        } else {
            set("§c§lX", 160, 0, 1, 21, inv);
        }
        // 빙고 네번째줄
        if(list[3][0] == 1) {
            set("§a§lO", 160, 14, 1, 27, inv);
        } else {
            set("§c§lX", 160, 0, 1, 27, inv);
        }
        if(list[3][1] == 1) {
            set("§a§lO", 160, 14, 1, 28, inv);
        } else {
            set("§c§lX", 160, 0, 1, 28, inv);
        }
        if(list[3][2] == 1) {
            set("§a§lO", 160, 14, 1, 29, inv);
        } else {
            set("§c§lX", 160, 0, 1, 29, inv);
        }
        if(list[3][3] == 1) {
            set("§a§lO", 160, 14, 1, 30, inv);
        } else {
            set("§c§lX", 160, 0, 1, 30, inv);
        }
        // 아래부터 상대
        if(list2[0][0] == 1) {
            set("§a§lO", 160, 14, 1, 5, inv);
        } else {
            set("§c§lX", 160, 0, 1, 5, inv);
        }
        if(list2[0][1] == 1) {
            set("§a§lO", 160, 14, 1, 6, inv);
        } else {
            set("§c§lX", 160, 0, 1, 6, inv);
        }
        if(list2[0][2] == 1) {
            set("§a§lO", 160, 14, 1, 7, inv);
        } else {
            set("§c§lX", 160, 0, 1, 7, inv);
        }
        if(list2[0][3] == 1) {
            set("§a§lO", 160, 14, 1, 8, inv);
        } else {
            set("§c§lX", 160, 0, 1, 8, inv);
        }
        // 빙고 두번째줄
        if(list2[1][0] == 1) {
            set("§a§lO", 160, 14, 1, 14, inv);
        } else {
            set("§c§lX", 160, 0, 1, 14, inv);
        }
        if(list2[1][1] == 1) {
            set("§a§lO", 160, 14, 1, 15, inv);
        } else {
            set("§c§lX", 160, 0, 1, 15, inv);
        }
        if(list2[1][2] == 1) {
            set("§a§lO", 160, 14, 1, 16, inv);
        } else {
            set("§c§lX", 160, 0, 1, 16, inv);
        }

        if(list2[1][3] == 1) {
            set("§a§lO", 160, 14, 1, 17, inv);
        } else {
            set("§c§lX", 160, 0, 1, 17, inv);
        }
        // 빙고 세번째줄
        if(list2[2][0] == 1) {
            set("§a§lO", 160, 14, 1, 23, inv);
        } else {
            set("§c§lX", 160, 0, 1, 23, inv);
        }
        if(list2[2][1] == 1) {
            set("§a§lO", 160, 14, 1, 24, inv);
        } else {
            set("§c§lX", 160, 0, 1, 24, inv);
        }
        if(list2[2][2] == 1) {
            set("§a§lO", 160, 14, 1, 25, inv);
        } else {
            set("§c§lX", 160, 0, 1, 25, inv);
        }
        if(list2[2][3] == 1) {
            set("§a§lO", 160, 14, 1, 26, inv);
        } else {
            set("§c§lX", 160, 0, 1, 26, inv);
        }
        // 빙고 네번째줄
        if(list2[3][0] == 1) {
            set("§a§lO", 160, 14, 1, 32, inv);
        } else {
            set("§c§lX", 160, 0, 1, 32, inv);
        }
        if(list2[3][1] == 1) {
            set("§a§lO", 160, 14, 1, 33, inv);
        } else {
            set("§c§lX", 160, 0, 1, 33, inv);
        }
        if(list2[3][2] == 1) {
            set("§a§lO", 160, 14, 1, 34, inv);
        } else {
            set("§c§lX", 160, 0, 1, 34, inv);
        }
        if(list2[3][3] == 1) {
            set("§a§lO", 160, 14, 1, 35, inv);
        } else {
            set("§c§lX", 160, 0, 1, 35, inv);
        }
        // 빙고 줄 확인
        if(list[0][0] == 1 && list[0][1] == 1 && list[0][2] == 1 && list[0][3] == 1) {
            set("§e§l빙고!", 160, 5, 1, 4, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 4, inv);
        }
        if(list[1][0] == 1 && list[1][1] == 1 && list[1][2] == 1 && list[1][3] == 1) {
            set("§e§l빙고!", 160, 5, 1, 13, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 13, inv);
        }
        if(list[2][0] == 1 && list[2][1] == 1 && list[2][2] == 1 && list[2][3] == 1) {
            set("§e§l빙고!", 160, 5, 1, 22, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 22, inv);
        }
        if(list[3][0] == 1 && list[3][1] == 1 && list[3][2] == 1 && list[3][3] == 1) {
            set("§e§l빙고!", 160, 5, 1, 31, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 31, inv);
        }
        if(list[0][0] == 1 && list[1][0] == 1 && list[2][0] == 1 && list[3][0] == 1) {
            set("§e§l빙고!", 160, 5, 1, 36, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 36, inv);
        }
        if(list[0][1] == 1 && list[1][1] == 1 && list[2][1] == 1 && list[3][1] == 1) {
            set("§e§l빙고!", 160, 5, 1, 37, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 37, inv);
        }
        if(list[0][2] == 1 && list[1][2] == 1 && list[2][2] == 1 && list[3][2] == 1) {
            set("§e§l빙고!", 160, 5, 1, 38, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 38, inv);
        }
        if(list[0][3] == 1 && list[1][3] == 1 && list[2][3] == 1 && list[3][3] == 1) {
            set("§e§l빙고!", 160, 5, 1, 39, inv);
        } else {
            set("§e§l빙고 확인", 160, 4, 1, 39, inv);
        }
        set("§b§l총 빙고 확인", 345, 0, 1, 40, inv);
        set("§c§l위는 상대", 160, 1, 1, 41, inv);
        set("§c§l위는 상대", 160, 1, 1, 42, inv);
        set("§c§l위는 상대", 160, 1, 1, 43, inv);
        set("§c§l위는 상대", 160, 1, 1, 44, inv);
        p.openInventory(inv);
    }
}
package kr.cosinea.bingo;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;

public class Command extends Utils implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (args.length == 0) {
            p.sendMessage(option() + "§b§l 빙고 §f§l시스템 도움말");
            p.sendMessage("");
            p.sendMessage(option() + "/빙고 신청 [플레이어]");
            p.sendMessage(option() + "/빙고 수락");
            p.sendMessage(option() + "/빙고 거절");
            p.sendMessage(option() + "/빙고 포기");
            p.sendMessage(option() + "/빙고 도움말");
            if(p.isOp()) {
                p.sendMessage(option() + "/빙고 문장추가 [문제]");
                p.sendMessage(option() + "/빙고 판");
            }
            return false;
        }
        switch (args[0]) {
            case "판": {
                Gui gui = new Gui();
                gui.bingoGui(p);
                break;
            }
            case "신청": {
                if (args.length == 1) {
                    p.sendMessage(option() + "플레이어를 적어주세요.");
                }
                else if (Bukkit.getPlayerExact(args[1]) == null) {
                    p.sendMessage(option() + "해당 플레이어가 오프라인입니다.");
                }
                else if (start.containsKey(Bukkit.getPlayerExact(args[1]).getUniqueId())) {
                    p.sendMessage(option() + "해당 플레이어는 이미 빙고를 진행 중입니다.");
                }
                else if (player.containsKey(Bukkit.getPlayerExact(args[1]).getUniqueId())) {
                    p.sendMessage(option() + "해당 플레이어가 이미 다른 신청을 보유 중입니다.");
                }
                /*
                else if (args[1].equals(sender.getName())) {
                    p.sendMessage(option() + "본인에게 신청할 수 없습니다.");
                }
                 */
                else if (Bukkit.getPlayerExact(args[1]) != null){
                    Player p2 = Bukkit.getPlayerExact(args[1]);
                    // Map 값 넣기
                    player.put(p.getUniqueId(), p2.getUniqueId());
                    player.put(p2.getUniqueId(), p.getUniqueId());
                    choice.put(p2.getUniqueId(), 0);
                    // 소리
                    p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                    p2.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                    // 메시지
                    p.sendMessage(option() + "§6§l" + args[1] + "§f§l님에게 빙고 대결을 신청하였습니다.");
                    p2.sendMessage("");
                    p2.sendMessage(option() + "§6§l" + sender.getName() + "§f§l님이 빙고 대결을 신청하였습니다!");
                    p2.sendMessage(option() + "§a§l/빙고 수락 §f§l으로 빙고 대결을 수락하거나,");
                    p2.sendMessage(option() + "§c§l/빙고 거절 §f§l으로 빙고 대결을 거절 할 수 있습니다.");
                    p2.sendMessage("");
                    p2.sendMessage(option() + "30초 내로 수락하지 않으면 자동으로 취소됩니다!");
                    // 시간제한
                    new BukkitRunnable() {
                        int count = 30;
                        @Override
                        public void run() {
                            if(count > 0) {
                                count--;
                                if(choice.containsValue(1)) {
                                    cancel();
                                    start.put(p.getUniqueId(), 1);
                                    start.put(p2.getUniqueId(), 1);
                                    p.sendMessage(option() + "상대가 빙고 대결을 수락하였습니다.");
                                    p2.sendMessage(option() + "빙고 대결을 수락하였습니다.");
                                    new BukkitRunnable() {
                                        int startCount = 5;
                                        @Override
                                        public void run() {
                                            if(start.containsKey(p.getUniqueId())) {
                                                p.sendMessage(option() + startCount + "초 후에 시작됩니다.");
                                                p2.sendMessage(option() + startCount + "초 후에 시작됩니다.");
                                                startCount--;
                                            } else {
                                                cancel();
                                            }
                                            if (startCount < 0) {
                                                cancel();
                                                int max = Bingo.getPlugin(Bingo.class).getConfig().getInt("단어수");
                                                int random = (int) (Math.random() * max) + 1;
                                                randomChat(p, p2, random);
                                            }
                                        }
                                    }.runTaskTimer(Bingo.getInstance(), 0L, 20L);
                                }
                                else if (choice.containsValue(2)) {
                                    cancel();
                                    player.remove(p.getUniqueId());
                                    player.remove(p2.getUniqueId());
                                    choice.remove(p2.getUniqueId());
                                    p.sendMessage(option() + "상대가 빙고 대결을 거절하였습니다.");
                                    p2.sendMessage(option() + "빙고 대결을 거절하였습니다.");
                                }
                            }
                            else if(count < 0) {
                                cancel();
                                player.remove(p.getUniqueId());
                                player.remove(p2.getUniqueId());
                                choice.remove(p2.getUniqueId());
                                p.sendMessage(option() + "상대가 빙고 대결을 거절하였습니다.");
                                p2.sendMessage(option() + "빙고 대결을 거절하였습니다.");
                            }
                        }
                    }.runTaskTimer(Bingo.getInstance(),0L,20L);
                }
                break;
            }
            case "수락": {
                if (choice.containsKey(p.getUniqueId())) {
                    if (choice.containsValue(0)) {
                        choice.put(p.getUniqueId(), 1);
                    } else {
                        p.sendMessage(option() + "이미 빙고 대결을 받은 상태입니다.");
                    }
                } else {
                    p.sendMessage(option() + "빙고 대결 신청을 받지 않았습니다.");
                }
                break;
            }
            case "거절": {
                if (choice.containsKey(p.getUniqueId())) {
                    if (choice.containsValue(0)) {
                        choice.put(p.getUniqueId(), 2);
                    } else {
                        p.sendMessage(option() + "이미 빙고 대결을 받은 상태입니다.");
                    }
                } else {
                    p.sendMessage(option() + "빙고 대결 신청을 받지 않았습니다.");
                }
                break;
            }
            case "포기": {
                if (start.containsKey(p.getUniqueId())) {
                    p.sendMessage(option() + "상대가 대결을 포기했습니다.");
                    Bukkit.getPlayer(player.get(p.getUniqueId())).sendMessage(option() + "대결을 포기하였습니다.");
                    p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1, 1);
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
                } else {
                    p.sendMessage(option() + "게임 중이 아닙니다.");
                }
                break;
            }
            case "문장추가": {
                if (args.length == 1) {
                    p.sendMessage(option() + "문장을 적어주세요.");
                }
                if (args.length > 1) {
                    String sentence = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
                    Bingo.getPlugin(Bingo.class).getConfig().set("문제." + (1 + Bingo.getPlugin(Bingo.class).getConfig().getInt("단어수")), sentence);
                    int count = Bingo.getPlugin(Bingo.class).getConfig().getInt("단어수");
                    int count2 = count + 1;
                    Bingo.getPlugin(Bingo.class).getConfig().set("단어수", count2);
                    Bingo.getPlugin(Bingo.class).saveConfig();
                    p.sendMessage(option() + "§6§l[" + sentence + "]§f§l 문장을 추가하였습니다.");
                }
                break;
            }
            default: {
                p.sendMessage(option() + "§b§l 빙고 §f§l시스템 도움말");
                p.sendMessage("");
                p.sendMessage(option() + "/빙고 신청 [플레이어]");
                p.sendMessage(option() + "/빙고 수락");
                p.sendMessage(option() + "/빙고 거절");
                p.sendMessage(option() + "/빙고 포기");
                p.sendMessage(option() + "/빙고 도움말");
                if (p.isOp()) {
                    p.sendMessage(option() + "/빙고 문장추가 [문제]");
                }
            }
        }
        return true;
    }
}
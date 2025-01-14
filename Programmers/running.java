package Programmers;

import java.util.*;

public class running {
    public static void main(String[] args) {
        running obj = new running();
        obj.solution(obj.players, obj.callings);
    }

    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};

    String[] solution(String[] players, String[] callings){
        /*for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if(callings[i].equals(players[j])){
                    String tmp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = tmp;
                }
            }
        }*/ // 시간에러가 출력된다. 자료구조에 대한 공부가 필요하다.
        HashMap<Integer, String> player = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            player.put(i, players[i]);
            if(callings[i].equals(player.get(i))){
                player.put(i, i-1);
            }
        }

        /*for (int i = 0; i < players.length; i++) {
            System.out.print(players[i] + " ");
        }*/ // only 출력용
        return players;
    }
}

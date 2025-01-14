package Programmers;

public class bandage { // 진행 시간 : 1일
    public static void main(String[] args) {
        bandage obj = new bandage();
        obj.solution(obj.band, obj.heal, obj.attacks);
    }

    //bandage는 [시전 시간(t초), 초당 회복량(x), 추가 회복량(y)]
    //attacks[i]는 [공격 시간, 피해량]

    int[] band = {5, 1, 5};
    int heal = 30;
    int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};


    int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];

        int FULL = health;
        int successSkill = 0;

        int lastTurn = attacks[attacks.length-1][0];
        int attackTurn = 0;

        for(int turn = 0; turn <= lastTurn; turn++){
            if(turn == attacks[attackTurn][0]){
                health -= attacks[attackTurn][1];
                if(health <= 0){
                    return -1;
                }
                attackTurn++;
                successSkill = 0;
            }else{
                if(health >= FULL){
                    health = FULL;
                    successSkill++;
                }else{
                    health += x;
                    successSkill++;
                    if(successSkill == t){
                        health += y;
                        System.out.println("추가체력회복");
                        successSkill = 0;
                    }
                    System.out.println("체력 회복 : " + health);
                }

            }
        }
        return health;
    }
}

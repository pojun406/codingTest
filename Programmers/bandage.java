package Programmers;

public class bandage {
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
        int success = 0;
        int dmg = 0;
        boolean hit = false;
        int answer = 0;
        int turn = attacks[attacks.length-1][0];

        for (int i = 0; i <= turn; i++) {
            for (int j = 0; j < attacks.length; j++) {
                if(i == attacks[j][0]){
                    hit = true;
                    success = 0;
                    dmg = attacks[j][1];
                }
            }

            if(hit){
                health -= dmg;
                hit = false;
                System.out.println("데미지 : " + dmg);
                System.out.println("잔여 HP : " + health);
            } else if((health > FULL || health + x >= FULL || health + x + y >= FULL) && !hit){

            }
        }

        return answer;
    }
}

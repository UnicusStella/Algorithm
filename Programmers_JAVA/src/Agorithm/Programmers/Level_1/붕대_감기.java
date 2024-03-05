package Agorithm.Programmers.Level_1;

import java.util.HashMap;

public class 붕대_감기 {
    public static void main(String[] args) {

        붕대_감기 stella = new 붕대_감기();

        int[] bandage1 = {5, 1, 5};
        int health1 = 30;
        int[][] attacks1 = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        int[] bandage2 = {3, 2, 7};
        int health2 = 20;
        int[][] attacks2 = {{1, 15}, {5, 16}, {8, 6}};

        int[] bandage3 = {4, 2, 7};
        int health3 = 20;
        int[][] attacks3 = {{1, 15}, {5, 16}, {8, 6}};

        int[] bandage4 = {1, 1, 1};
        int health4 = 5;
        int[][] attacks4 = {{1, 2}, {3, 2}};

        System.out.println("Answer = " + stella.solution(bandage1, health1, attacks1));
        System.out.println("Answer = " + stella.solution(bandage2, health2, attacks2));
        System.out.println("Answer = " + stella.solution(bandage3, health3, attacks3));
        System.out.println("Answer = " + stella.solution(bandage4, health4, attacks4));
    }

    /*
        bandage	    health	    attacks	                                result
        [5, 1, 5]	30	        [[2, 10], [9, 15], [10, 5], [11, 5]]	5
        [3, 2, 7]	20	        [[1, 15], [5, 16], [8, 6]]	            -1
        [4, 2, 7]	20	        [[1, 15], [5, 16], [8, 6]]	            -1
        [1, 1, 1]	5	        [[1, 2], [3, 2]]	                    3
     */
    public int solution(int[] bandage, int health, int[][] attacks) {

        int totalBattleTime = attacks[attacks.length - 1][0];
        int battleTime = 1;
        int healCount = 0;
        int maxHealth = health;

        HashMap<Integer, Integer> enermyAttack = new HashMap<>();

        for (int[] attack : attacks)
            enermyAttack.put(attack[0], attack[1]);

        while (totalBattleTime >= battleTime) {
            if (enermyAttack.containsKey(battleTime)) {
                health -= enermyAttack.get(battleTime);
                healCount = 0;
            } else {
                health += bandage[1];
                healCount++;
                if (healCount == bandage[0]) {
                    health += bandage[2];
                    healCount = 0;
                }
                if (health >= maxHealth) health = maxHealth;
            }
            if (health <= 0) return -1;
            battleTime++;
        }

        return health;
    }

    public int solution2(int[] bandage, int health, int[][] attacks) {

        int battleTime = 0;
        int recoveryTime = 0;
        int maxHealth = health;

        for (int[] attack : attacks) {
            if (health <= 0) return -1;

            recoveryTime = attack[0] - battleTime - 1;
            battleTime = attack[0];

            health += bandage[1] * recoveryTime;
            health += bandage[2] * (recoveryTime / bandage[0]);
            if (health > maxHealth) health = maxHealth;

            health -= attack[1];
        }

        return health <= 0 ? -1 : health;
    }
}
package ar.unnoba.edu.ipoo;

import ar.unnoba.edu.ipoo.Attacks.*;
import ar.unnoba.edu.ipoo.Defenses.*;

import java.util.Random;

public class RandomStrategySelector {
    private static final Random rand = new Random();

    private static final AttackStrategy[] ATTACK_STRATEGIES = {
            new PunchAttack(),
            new KickAttack()
    };
    private static final DefenseStrategy[] DEFENSE_STRATEGIES = {
            new ShieldDefense(),
            new ArmorDefense(),
            new BonusDefense()
    };





    public static AttackStrategy[] getRandomAttackStrategies() {
        return rand.nextInt(ATTACK_STRATEGIES.length() -1);
    }
}

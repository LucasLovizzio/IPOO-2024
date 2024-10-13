package ar.unnoba.edu.ipoo;

import ar.unnoba.edu.ipoo.Attacks.*;
import ar.unnoba.edu.ipoo.Defenses.*;

import java.util.Random;

public class RandomStrategySelector {
    private static final Random rand = new Random();

    private static final AttackStrategy[] ATTACK_STRATEGIES = {
            new PunchAttack(),
            new KickAttack(),
            new LaserAttack(),
            new MissileAttack(),
            new HammerAttack(),
            new FlameThrowerAttack(),
            new ElectricShockAttack()
    };
    private static final DefenseStrategy[] DEFENSE_STRATEGIES = {
            new ShieldDefense(),
            new ArmorDefense(),
            new BonusDefense(),
            new EvadeDefense(),
            new AbsorbDefense(),
            new CounterDefense()
    };

    public AttackStrategy getRandomAttackStrategy() {
        int length = ATTACK_STRATEGIES.length;
        return ATTACK_STRATEGIES[rand.nextInt(length)-1];
    }

    public DefenseStrategy getRandomDefenseStrategy() {
        int length = DEFENSE_STRATEGIES.length;
        return DEFENSE_STRATEGIES[rand.nextInt(length)-1];
    }
}

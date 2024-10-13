package ar.unnoba.edu.ipoo.Attacks;

import ar.unnoba.edu.ipoo.AttackStrategy;

public class HammerAttack implements AttackStrategy {
    @Override
    public int attack() {
        return 80;
    }
}

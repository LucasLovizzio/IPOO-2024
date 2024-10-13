package ar.unnoba.edu.ipoo.Defenses;

import ar.unnoba.edu.ipoo.DefenseStrategy;

public class ShieldDefense implements DefenseStrategy {
    @Override
    public int defend(int attack) {
        return 30;
    }
}

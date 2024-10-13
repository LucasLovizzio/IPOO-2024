package ar.unnoba.edu.ipoo.Defenses;

import ar.unnoba.edu.ipoo.DefenseStrategy;

public class AbsorbDefense implements DefenseStrategy {
    @Override
    public int defend(int attack) {
        return attack - 60;
    }
}

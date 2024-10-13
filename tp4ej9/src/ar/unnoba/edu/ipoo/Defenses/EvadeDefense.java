package ar.unnoba.edu.ipoo.Defenses;

import ar.unnoba.edu.ipoo.DefenseStrategy;

public class EvadeDefense implements DefenseStrategy {
    @Override
    public int defend(int attack) {
        return attack - 40;
    }
}

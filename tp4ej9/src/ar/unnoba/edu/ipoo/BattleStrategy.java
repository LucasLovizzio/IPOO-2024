package ar.unnoba.edu.ipoo;

public interface BattleStrategy {
    default String getStrategyName() {
        return getClass().getSimpleName();
    }
}

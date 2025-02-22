package code.practice.task2;

import org.jetbrains.annotations.NotNull;

public class FootballTeam implements Comparable<FootballTeam>{

    private String name;
    private int power;

    public FootballTeam(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(@NotNull FootballTeam o) {
        return Integer.compare(power, o.getPower());
    }
}

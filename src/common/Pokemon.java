package common;

/**
 *
 * @author agajkowski
 */
public class Pokemon {

    private int heathPoints;
    private int pokedexEntry;
    private String name;
    private boolean evolution;

    public Pokemon(String name, int pokedexEntry, int heathPoints, boolean evolution) {
        this.heathPoints = heathPoints;
        this.pokedexEntry = pokedexEntry;
        this.name = name;
        this.evolution = evolution;
    }

    @Override
    public String toString() {
        return "PokedexEntry: " + pokedexEntry +"\n"+ "Name: " + name +"\n"+ "HP: " + heathPoints +"\n"+ "Evolution possible? " + evolution;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.pokedexEntry;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (this.pokedexEntry != other.pokedexEntry) {
            return false;
        }
        return true;
    }

    public int getHeathPoints() {
        return heathPoints;
    }

    public void setHeathPoints(int heathPoints) {
        this.heathPoints = heathPoints;
    }

    public int getPokedexEntry() {
        return pokedexEntry;
    }

    public void setPokedexEntry(int pokedexEntry) {
        this.pokedexEntry = pokedexEntry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEvolution() {
        return evolution;
    }

    public void setEvolution(boolean evolution) {
        this.evolution = evolution;
    }
}

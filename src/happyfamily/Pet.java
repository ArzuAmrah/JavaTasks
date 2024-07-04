package happyfamily;

public class Pet {
    private String species;
    private String nickname;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    // Getters ve Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

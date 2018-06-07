public class Pokedex extends AbstractPokemon {
    public String pokemonInfo(Pokemon pokemon){
        String name = pokemon.getName();
        int health = pokemon.getHealth();
        String type = pokemon.getType();

        return name + health + type;
    }
}

public abstract class AbstractPokemon implements PokemonInterface {
    public Pokemon createPokemon(String name, int health, String type){
        Pokemon p = new Pokemon(name, health, type);
        return p;
    }
    public void attackPokemon(Pokemon pokemon){
        int attack = 10;
        int currentHealth = pokemon.getHealth();
        pokemon.setHealth(currentHealth - attack);
    }

}

package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)

public class PokemonPage1Pojo {
    private List<AbilitiesPokemonPojo> abilities;
    private int base_experience;
    //private List<Map<String,String>> forms;
    private List<Map<String,Object>> game_indices;
    private int height;
    private List held_items;
    private int id;
    private boolean is_default;
    private String location_area_encounters;
    private String name;
    private int order;
    private List past_types;
    private Map<String,String> species;
    private Map<String, Object> sprites;
    private List<Map<String,Object>> stats;
    private List<Map<String,Object>> types;
    private int weight;
    private List<Map<String,Object>> moves;

    public void setAbilities(List<AbilitiesPokemonPojo> abilities) {
        this.abilities = abilities;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

//    public List<Map<String, String>> getForms() {
//        return forms;
//    }
//
//    public void setForms(List<Map<String, String>> forms) {
//        this.forms = forms;
//    }

    public List<Map<String, Object>> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<Map<String, Object>> game_indices) {
        this.game_indices = game_indices;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List getHeld_items() {
        return held_items;
    }

    public void setHeld_items(List held_items) {
        this.held_items = held_items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List getPast_types() {
        return past_types;
    }

    public void setPast_types(List past_types) {
        this.past_types = past_types;
    }

    public Map<String, String> getSpecies() {
        return species;
    }

    public void setSpecies(Map<String, String> species) {
        this.species = species;
    }

    public Map<String, Object> getSprites() {
        return sprites;
    }

    public void setSprites(Map<String, Object> sprites) {
        this.sprites = sprites;
    }

    public List<Map<String, Object>> getStats() {
        return stats;
    }

    public void setStats(List<Map<String, Object>> stats) {
        this.stats = stats;
    }

    public List<Map<String, Object>> getTypes() {
        return types;
    }

    public void setTypes(List<Map<String, Object>> types) {
        this.types = types;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Map<String, Object>> getMoves() {
        return moves;
    }

    public void setMoves(List<Map<String, Object>> moves) {
        this.moves = moves;
    }

    public List<AbilitiesPokemonPojo> getAbilities() {
        return abilities;
    }

    public void setAbility(List<AbilitiesPokemonPojo> abilities) {
        this.abilities = abilities;
    }
}

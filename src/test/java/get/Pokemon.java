package get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojo.AbilitiesPokemonPojo;
import pojo.PokemonPage1Pojo;
import pojo.PokemonPojo;
import pojo.ResultsPokemonPojo;

import java.util.*;

public class Pokemon {
    @Test
    public void pokemonGetWithPojo() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";
        Response response = RestAssured.given().header("Accept", "application/json")
                .queryParam("limit", "1279")
                .when().get().then()
                .statusCode(200).extract().response();
        PokemonPojo deserializedResp = response.as(PokemonPojo.class);
        int actualCount = deserializedResp.getResults().size();
        int expectedCount = 1279;
        Assert.assertEquals(expectedCount, actualCount);
        Assert.assertEquals(1279, deserializedResp.getCount());
        List<ResultsPokemonPojo> allPokemon = deserializedResp.getResults();
        Assert.assertEquals(1279, allPokemon.size());
        for (ResultsPokemonPojo pikachu : allPokemon) {
            if (pikachu.getName().equalsIgnoreCase("pikachu")) {
                System.out.println(pikachu.getUrl());
            }
        }
    }

    @Test
    public void homework() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";
        Response response = RestAssured.given().header("Accept", "application/json")
                .when().get().then().statusCode(200).extract().response();
        PokemonPojo deserializedResponse = response.as(PokemonPojo.class);
        Assert.assertEquals(20, deserializedResponse.getResults().size());
        Map<String,List<String>> pokemonAbilities = new LinkedHashMap<>();
        for (int i = 0; i < 20; i++) {
            List<ResultsPokemonPojo> allPokemon = deserializedResponse.getResults();
            RestAssured.baseURI = allPokemon.get(i).getUrl();
            Response responseAbility = RestAssured.given().header("Accept", "application/json")
                    .when().get().then().statusCode(200).extract().response();
            PokemonPage1Pojo pokemonPage1Pojo = responseAbility.as(PokemonPage1Pojo.class);
            List<String> abilities = new ArrayList<>();
            for (AbilitiesPokemonPojo ability:pokemonPage1Pojo.getAbilities()) {
                abilities.add(ability.getAbility().getName());}
                pokemonAbilities.put(deserializedResponse.getResults().get(i).getName(),abilities);
        }
        System.out.println(pokemonAbilities);
    }
}
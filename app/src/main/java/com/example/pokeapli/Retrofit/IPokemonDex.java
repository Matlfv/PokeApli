package com.example.pokeapli.Retrofit;

import com.example.pokeapli.Model.Pokedex;

import java.util.Observable;

import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    io.reactivex.Observable<Pokedex> getListPokemon();
}

package com.example.tombenkemounandroidkotlin.data.remote

import retrofit2.Call
import retrofit2.http.GET


interface PokeApi {
    @get:GET("newapi.json")
    val Response : Call<RestPokemonResponse>
}
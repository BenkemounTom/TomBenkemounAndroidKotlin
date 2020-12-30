package com.example.tombenkemounandroidkotlin.data.remote

import com.example.tombenkemounandroidkotlin.domain.entity.PokemonResponse

data class RestPokemonResponse (
    val results :List <PokemonResponse>
)
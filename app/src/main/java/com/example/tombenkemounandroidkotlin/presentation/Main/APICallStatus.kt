package com.example.tombenkemounandroidkotlin.presentation.Main

import com.example.tombenkemounandroidkotlin.domain.entity.PokemonResponse

sealed class APICallStatus

data class APICallSuccess(val charList: List<PokemonResponse>) : APICallStatus()

object APICallFailure : APICallStatus()
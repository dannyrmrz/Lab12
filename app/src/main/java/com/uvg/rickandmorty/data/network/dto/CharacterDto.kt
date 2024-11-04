package com.uvg.rickandmorty.data.network.dto

import com.uvg.rickandmorty.data.model.Character
import kotlinx.serialization.Serializable

@Serializable
data class CharacterDto(
    val results: List<Character>
)
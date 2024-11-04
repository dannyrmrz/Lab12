package com.uvg.rickandmorty.data.network.dto


import com.uvg.rickandmorty.data.model.Location
import kotlinx.serialization.Serializable

@Serializable
data class LocationDTO(
    val results: List<Location>
)
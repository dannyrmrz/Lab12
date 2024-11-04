package com.uvg.rickandmorty.data.network

import com.uvg.rickandmorty.data.model.Character
import com.uvg.rickandmorty.data.model.Location
import com.uvg.rickandmorty.data.network.dto.CharacterDto
import com.uvg.rickandmorty.data.network.dto.LocationDTO
import io.ktor.client.call.body
import io.ktor.client.request.get

class Api {
    private val client = Factory.create()

    suspend fun getCharacters(): List<Character> {
        val response = client.get("https://rickandmortyapi.com/api/character") //fetchs the info
        val charactersDTO = response.body<CharacterDto>() //casts it
        return charactersDTO.results //returns the list
    }

    suspend fun getLocations(): List<Location> {
        val response = client.get("https://rickandmortyapi.com/api/location")
        val locationsDTO = response.body<LocationDTO>()
        return locationsDTO.results
    }
}

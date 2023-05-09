package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {

    //https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacter(): Call<CharacterList>

    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Long): Call<br.senai.sp.jandira.rickandmorty.model.Character>

    //https://rickandmortyapi.com/api/character/?page=19
    @GET("character/")
    fun getCharactersByPage(@Query("page") pageNumber: Int): Call<CharacterList>

    @GET("character")
    fun getCharacterByNameAndAlive(
        @Query("name") name: String,
        @Query("status") status: String
    ): Call<CharacterList>
}
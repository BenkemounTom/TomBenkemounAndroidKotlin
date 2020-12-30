package com.example.tombenkemounandroidkotlin.presentation.Main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tombenkemounandroidkotlin.data.remote.PokeApi
import com.example.tombenkemounandroidkotlin.data.remote.RestPokemonResponse
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ViewModelList (
): ViewModel() {
    val apiLiveData: MutableLiveData<APICallStatus> = MutableLiveData()
    private val BASE_URL = "https://raw.githubusercontent.com/BenkemounTom/Tombenkemounprojet32/master/"

    fun makeAPICall(){
        val gson = GsonBuilder()
            .setLenient()
            .create()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        val nierApi = retrofit.create(PokeApi::class.java)
        val call: Call<RestPokemonResponse>? = nierApi?.Response
        if (call != null) {
            call.enqueue(object : Callback<RestPokemonResponse?> {
                override fun onResponse(
                    call: Call<RestPokemonResponse?>?,
                    response: Response<RestPokemonResponse?>
                ) {
                    if (response.isSuccessful && response.body() != null) {
                        val charaList = response.body()!!.results
                        apiLiveData.value = APICallSuccess(charaList)
                    }
                }
                override fun onFailure(call: Call<RestPokemonResponse?>?, t: Throwable?) {
                    apiLiveData.value = APICallFailure
                }
            })
        }
    }
}

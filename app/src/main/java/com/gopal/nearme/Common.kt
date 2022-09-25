package com.gopal.nearme

import com.gopal.nearme.Model.Results
import com.gopal.nearme.Remote.IGoogleAPIService
import com.gopal.nearme.Remote.RetrofitClient


object Common {
    var currentResult: Results? = null

    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService:IGoogleAPIService
    get()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}
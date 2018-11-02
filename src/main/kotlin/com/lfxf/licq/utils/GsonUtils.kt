package com.lfxf.licq.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder

object   GsonUtils {
    fun getGson():Gson{
        return GsonBuilder().create()
    }
}
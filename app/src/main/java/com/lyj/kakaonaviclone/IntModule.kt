package com.lyj.kakaonaviclone

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object IntModule{

    @Provides
    @Singleton
    fun provideMyInt() : MyInt = MyInt()
}

class MyInt{
    fun myInf() : Int{
        return 10
    }
}
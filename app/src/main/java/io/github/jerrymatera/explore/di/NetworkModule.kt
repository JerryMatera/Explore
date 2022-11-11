package io.github.jerrymatera.explore.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.jerrymatera.explore.data.network.CountryAPI
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideCountryAPI(): CountryAPI{
        return CountryAPI.create()
    }
}
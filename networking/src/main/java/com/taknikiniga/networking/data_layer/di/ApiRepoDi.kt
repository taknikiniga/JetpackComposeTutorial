package com.taknikiniga.networking.data_layer.di

import com.taknikiniga.networking.data_layer.repo.ApiRepo
import com.taknikiniga.networking.data_layer.repo_impl.ApiRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ApiRepoDi {

    @Binds
    abstract fun provideApiRepo(apiRepoImpl: ApiRepoImpl):ApiRepo

}
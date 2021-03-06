package com.raul.androidapps.softwaretesttandem.di.modules

import com.raul.androidapps.softwaretesttandem.di.interfaces.CustomScopes
import com.raul.androidapps.softwaretesttandem.ui.weather.WeatherFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Suppress("unused")
@Module
abstract class FragmentsProvider {

    @CustomScopes.FragmentScope
    @ContributesAndroidInjector
    abstract fun providesMainFragmentFactory(): WeatherFragment

}
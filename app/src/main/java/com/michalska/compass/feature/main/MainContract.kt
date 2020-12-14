package com.michalska.compass.feature.main

import android.app.Activity
import com.michalska.compass.base.BasePresenterInterface

interface MainContract {

    interface View {
        fun showUpdatedLocation(latitude: String, longitude: String)
        fun startLocation()
        fun showLocationError(latitudeError: String, longitudeError: String)
        fun getViewActivity(): Activity
        fun invalidLongitude()
        fun invalidLatitude()
        fun clearLongitude()
        fun clearLatitude()
        fun runSwipeUp()
        fun loadDestination()
    }

    interface Presenter :
        BasePresenterInterface<View> {
        fun locationChanged(latitude: String, longitude: String)
        fun requestPermission()
        fun onPermissionResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
        )

        fun setLongitude()
        fun setLatitude()
        fun handleButtonClick()
        fun handleSaveButtonClick()
    }
}
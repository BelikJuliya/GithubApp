package android.example.githubapp.presentation

import android.app.Application
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class GithubApp : Application() {
    var instance: GithubApp? = null
    private var cicerone: Cicerone<Router>? = null

    companion object {
        internal lateinit var INSTANCE: GithubApp
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        cicerone = Cicerone.create()
    }

    fun getNavigatorHolder(): NavigatorHolder? {
        return cicerone!!.navigatorHolder
    }

    fun getRouter(): Router? {
        return cicerone!!.router
    }
}
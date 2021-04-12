package android.example.githubapp.data

import com.arellomobile.mvp.MvpView

interface IGithubView : MvpView {
    fun displayRepos(user : String)
    //@AddToEndSingle // Moxy Strategy
    fun changeView(parameter: Any)

    //@Skip
    fun onError(error: String)
}
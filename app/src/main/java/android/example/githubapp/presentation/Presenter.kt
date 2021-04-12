package android.example.githubapp.presentation

import android.example.githubapp.data.IGithubView
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.terrakok.cicerone.Router

@InjectViewState // аннотация для привязывания ViewState к Presenter
open class Presenter(
    private val initParams: Any // параметры для инициализации Presenter
): MvpPresenter<IGithubView>() {
    override fun onFirstViewAttach() { // Данный метод вызовется всего один раз - при первом присоединении View к Presenter
        super.onFirstViewAttach()
        GlobalScope.launch {
            try {
                // some async operations
                withContext(Dispatchers.Main) {
                    viewState.changeView("blabla") // обращение к View из Presenter
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    viewState.onError("blabla")
                }
            }
        }
    }

    open fun doSomethingInPresenter(params: Any) {
        // do something in presenter
    }
}
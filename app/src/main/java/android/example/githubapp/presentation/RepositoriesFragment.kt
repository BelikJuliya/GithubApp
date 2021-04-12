package android.example.githubapp.presentation

import android.example.githubapp.R
import android.example.githubapp.data.IGithubView
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.repositories_fragment.view.*

class RepositoriesFragment : MvpFragment(), IGithubView {
    @InjectPresenter // аннотация для получения экземпляра Presenter
    lateinit var presenter: IGithubView



    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.repositories_fragment, container, false)
        presenter.displayRepos("SMB") // обращение к Presenter из View
        view.recycler_view.adapter = RecyclerViewAdapter(generateDummyList(50))
        view.recycler_view.layoutManager = LinearLayoutManager(activity)
        view.recycler_view.setHasFixedSize(true)
        return view
    }

    private fun generateDummyList(size: Int): List<GithubRepository> {
        val list = ArrayList<GithubRepository>()
        for (i in 0 until size) {
            val item = GithubRepository("Item $i", "Line 2")
            list += item
        }
        return list
    }

    override fun displayRepos(user: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun changeView(parameter: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        //Toast.makeText(baseContext, error, Toast.LENGTH_SHORT).show()
    }
}
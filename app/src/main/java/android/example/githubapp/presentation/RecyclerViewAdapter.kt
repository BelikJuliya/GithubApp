package android.example.githubapp.presentation

import android.example.githubapp.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_item.view.*

class RecyclerViewAdapter (private val repositoriesList: List<GithubRepository>) : RecyclerView.Adapter<RecyclerViewAdapter.RepositoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoriesViewHolder {
        val gitRepositoryView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_item, parent, false)
        return RepositoriesViewHolder(gitRepositoryView)
    }

    override fun onBindViewHolder(holder: RepositoriesViewHolder, position: Int) {
        val currentItem = repositoriesList[position]
        holder.title.text = currentItem.title
        holder.summary.text = currentItem.summary
    }

    override fun getItemCount() = repositoriesList.size

    class RepositoriesViewHolder(gitRepositoryView: View) : RecyclerView.ViewHolder(gitRepositoryView){
        val title = gitRepositoryView.title
        val summary = gitRepositoryView.summary
    }
}
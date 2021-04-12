package android.example.githubapp.presentation

import android.example.githubapp.R
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth

class MainFragment : Fragment() {
    private lateinit var mAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    private fun login() {
        mAuth = FirebaseAuth.getInstance()
        val user = mAuth.currentUser

        /**If user is not authenticated, send him to SignInActivity to authenticate first.
         * Else send him to DashboardActivity*/
        Handler().postDelayed({
            if (user != null) {
//                val dashboardIntent = Intent(this, DashboardActivity::class.java)
//                startActivity(dashboardIntent)
                //finish()
            } else {
//                val signInIntent = Intent(this, SignInActivity::class.java)
//                startActivity(signInIntent)
                //finish()
            }
        }, 2000)
    }
}
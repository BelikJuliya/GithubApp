package android.example.githubapp.presentation

import android.example.githubapp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.android.SupportFragmentNavigator

class MainActivity : AppCompatActivity() {
    private val mNavigator = SupportAppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

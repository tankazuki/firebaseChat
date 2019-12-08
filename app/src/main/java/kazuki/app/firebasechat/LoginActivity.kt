package kazuki.app.firebasechat

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button_login.setOnClickListener{
            val email = email_exittext_login.text.toString()
            val password = password_edittext_login.text.toString()

            Log.d("LoginActivity", "Attempt login with email/password $email/*******")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)

        }

        back_to_register.setOnClickListener {
            finish()
        }
    }

}
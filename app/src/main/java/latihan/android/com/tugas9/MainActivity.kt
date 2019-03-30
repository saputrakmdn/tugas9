package latihan.android.com.tugas9

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{
            val username =et_username.text.toString().trim()
            val password = et_password.text.toString().trim()
            handleLogin(username, password)

        }
    }
    private fun handleLogin(username: String, password:String){
        info {"data username: $username, data password: $password"}
        if(username.equals("admin")&&password.equals("123")){
            toast("welcome$username")
            startActivity(intentFor<nextLogin>("data" to username))
        }else{
            alert(title="warning", message = "Username dan password salah") {
                positiveButton(buttonText = "Oke"){

                }
                isCancelable = false
            }.show()

    }
}
}

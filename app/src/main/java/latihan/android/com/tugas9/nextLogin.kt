package latihan.android.com.tugas9

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*

class nextLogin: AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewPage().setContentView(this)
        val tv_data: TextView = findViewById(R.id.data)
        val data = intent.getStringExtra("data")
            tv_data.setText(data)


    }
}
class viewPage :AnkoComponent<nextLogin>{
    override fun createView(ui: AnkoContext<nextLogin>)= with(ui) {
        verticalLayout{
            lparams(width= matchParent, height = matchParent){
                background = ColorDrawable(Color.parseColor("#acc6ef"))
                gravity = Gravity.CENTER
            }
            textView{
                text = "Welcome"
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                textSize = 25f
            }.lparams(width= matchParent, height = wrapContent){
                margin = 10
            }
            textView{
                id = R.id.data
                text = "test"
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                textSize = 25f
            }.lparams(width = matchParent, height = wrapContent){
                margin= 10
            }
        }
    }

}
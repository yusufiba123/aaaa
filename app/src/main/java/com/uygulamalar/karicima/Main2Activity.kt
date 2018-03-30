package com.uygulamalar.karicima

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    val isim:String="zeynep"
    val isim1:String="Zeynep"
    val isim2:String="ZEYNEP"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun yaz(view: View){
        if (editText.text.toString().equals(isim)){
            imageView.visibility= View.VISIBLE
            imageView2.visibility= View.INVISIBLE
            imageView3.visibility= View.INVISIBLE
        }

        if (editText.text.toString().equals(isim1)){
            imageView2.visibility= View.VISIBLE
            imageView.visibility= View.INVISIBLE
            imageView3.visibility= View.INVISIBLE
        }
        if (editText.text.toString().equals(isim2)){
            imageView3.visibility= View.VISIBLE
            imageView.visibility= View.INVISIBLE
            imageView2.visibility= View.INVISIBLE
        }
    }
}

package com.man1049.viewcomposition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.man1049.viewcomposition.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    val activitySubBinding by lazy { ActivitySubBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activitySubBinding.root)

        //파라미터를 받아서 버튼text를 변경
        //intent는 호출한 엑티비티에서 보냈기때문에 사용 가능
        activitySubBinding.button3.text = intent.getStringExtra("이름1")
        activitySubBinding.button4.text = intent.getStringExtra("이름2")
        
        // 왼쪽 버튼을 클릭할시
        activitySubBinding.button3.setOnClickListener {
            // intent에 값을 주입함
            val intent = Intent(applicationContext, MainActivity::class.java).apply {
                putExtra("name",activitySubBinding.button3.text.toString())
                Log.d("이름설정",activitySubBinding.button3.text.toString())
            }
            // 값을 담아줌
            setResult(RESULT_OK, intent)
            // SubActivity를 닫고 MainActivity에 값을 전달
            finish()
            }

        // 오른쪽 버튼을 클릭할시
        activitySubBinding.button4.setOnClickListener {
            // intent에 값을 주입함
            val intent = Intent(applicationContext, MainActivity::class.java).apply {
                putExtra("name",activitySubBinding.button4.text.toString())
                Log.d("이름설정",activitySubBinding.button4.text.toString())
            }
            // 값을 담아줌
            setResult(RESULT_OK, intent)
            // SubActivity를 닫고 MainActivity에 값을 전달
            finish()
        }

        
    }
}
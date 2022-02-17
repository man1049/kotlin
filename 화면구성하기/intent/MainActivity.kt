package com.man1049.viewcomposition

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.ActionBar
import com.man1049.viewcomposition.databinding.ActivityMainBinding
import com.man1049.viewcomposition.databinding.ActivitySubBinding

class MainActivity : AppCompatActivity() {
    val activityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    // ActivityResultLauncher를 선언
    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)
        
        // 서브엑티비티에 값을 보내고 띄우는 부분
        activityMainBinding.button.setOnClickListener {
            // intent에 Intent(applicationContext, 서브엑티비티 이름::class.java)를 주입
            var intent = Intent(applicationContext, SubActivity::class.java)
            
            // 보낼 파라미터를 작성
            intent.putExtra("이름1","김백산")
            intent.putExtra("이름2","태백산")
            
            // intnet의 데이터를 보내면서 선언한 클래스를 작동
            activityResultLauncher.launch(intent)

        }

        // 서브엑티비티에서 받아오기
        activityResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if(it.resultCode == RESULT_OK){
                    // SubActivity에서 받아온 값을 처리
                    activityMainBinding.nameText.text = it.data?.getStringExtra("name")
                    Log.d("선택은?","${it.data?.getStringExtra("name")}")
                    activityMainBinding.selectName.visibility = View.VISIBLE
                    activityMainBinding.nameText.visibility = View.VISIBLE
                }
            }
    }


}
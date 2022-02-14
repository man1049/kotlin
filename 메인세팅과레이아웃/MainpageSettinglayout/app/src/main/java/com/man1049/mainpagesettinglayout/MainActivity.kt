package com.man1049.mainpagesettinglayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.man1049.mainpagesettinglayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // XML을 불러와서 사용하는 방법을 사용하면 오류가 많아 바인딩을해서 사용하는 것을 권장한다고 함
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnSay.setOnClickListener{
            if (binding.textSay.text.equals("반갑읍니다")){
                binding.textSay.text = "Hello"
            }else{
                binding.textSay.text = "반갑읍니다"
            }
        }
    }
}
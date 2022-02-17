package com.man1049.layoutandlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.SeekBar
import androidx.core.widget.addTextChangedListener
import com.man1049.layoutandlife.databinding.*
import java.util.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    val mainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val basicLayoutBinding by lazy { BasicLayoutBinding.inflate(layoutInflater) }
    val inputTextBinding by lazy {InputTextBinding.inflate(layoutInflater)}
    val linearLayoutBinding by lazy{ LinearLayoutBinding.inflate(layoutInflater)}
    val scrollViewBinding by lazy{ ScrollViewBinding.inflate(layoutInflater)}
    val spaceBinding by lazy { SpaceBinding.inflate(layoutInflater)}
    val widgetsTextViewBinding by lazy { WidgetsTextViewBinding.inflate(layoutInflater)}
    val widgetsEditTextBinding by lazy { WidgetsEditTextBinding.inflate(layoutInflater)}
    val progressBarBinding by lazy { ProgressBarBinding.inflate(layoutInflater) }
    val seekBarBinding by lazy { SeekBarBinding.inflate(layoutInflater) }
    val ratingBarBinding by lazy { RatingBarBinding.inflate(layoutInflater) }
    val radioButtonBinding by lazy { RadioButtonBinding.inflate(layoutInflater) }
    val checkBoxBinding by lazy { CheckBoxBinding.inflate(layoutInflater) }

    // 체크박스 리스너
    val listener by lazy {
        CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b){
                when(compoundButton.id){
                    R.id.checkBox -> Log.d("체크박스","김백산체크")
                    R.id.checkBox2 -> Log.d("체크박스","태백산체크")
                    R.id.checkBox3 -> Log.d("체크박스","소백산체크")
                }
            }else{
                when(compoundButton.id){
                    R.id.checkBox -> Log.d("체크박스","김백산체크해제")
                    R.id.checkBox2 -> Log.d("체크박스","태백산체크해제")
                    R.id.checkBox3 -> Log.d("체크박스","소백산체크해제")
                }
            }

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //setContentView(mainBinding.root)
        //기본 레이아웃
        //setContentView(basicLayoutBinding.root)
        /*
        //인풋텍스트에 입력을 할 때 반응
        setContentView(inputTextBinding.root)
        binding.editTextTextPersonName3.addTextChangedListener {
            Log.d("TextChange","$it")
        }
         */
        //setContentView(linearLayoutBinding.root)
        //스크롤 기능
        //setContentView(scrollViewBinding.root)
        //컴포넌트 사이에 공간주기
        //setContentView(spaceBinding.root)
        //텍스트 속성들의 기능
        //setContentView(widgetsTextViewBinding.root)
        //인풋텍스트
        //setContentView(widgetsEditTextBinding.root)

        
        // 프로그레스바
        setContentView(progressBarBinding.root)

        // showProgress를 호출할 때 true를 주면 보여지고
        // false를 주면 숨김
        fun showProgress(show: Boolean){
            if (show){
                progressBarBinding.ProgressBarLayout.visibility = View.VISIBLE
            }else{
                progressBarBinding.ProgressBarLayout.visibility = View.GONE
            }
        }

        //서브스레드 생성
        //서브스레드를 생성해서 내부에 Thread.sleep을 하지않으면
        //메인스레드인 onCreate내에서 동작하기 때문에
        //화면이 sleep(숫자)만큼 화면에 레이아웃이 그려지지 않고 멈춰있음
        thread(start = true){
            for (i in 3 downTo 0) {
                Thread.sleep(1000)
                // view는 메인스레드가 아니면 작동하지 않고 강제종료됨
                // runOnUiThread 스코프안에 코드를 입력해서 메인스레드에서 작동하도록 해줌
                runOnUiThread {
                    if (i == 0){
                        progressBarBinding.ProgressBarLayout.visibility = View.GONE
                    }
                    progressBarBinding.textView3.text = "$i"
                }

            }
        }
        
        /*
        //Seekbar 사용법
        setContentView(seekBarBinding.root)
        seekBarBinding.seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            // SeekBar - 시크바 위젯 , Int - 시크바의 Value , Boolean - 터치여부
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                seekBarBinding.textView11.text = "$p1"
                Log.d("seekBarValue","$p1")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
        */
        /*
        //별점 위젯
        setContentView(ratingBarBinding.root)

        ratingBarBinding.ratingBar.setOnRatingBarChangeListener {
            // ratingBar - 레이팅바 , fl - 현재별점 , b - 사용자 입력 여부
            ratingBar, fl, b ->
            ratingBarBinding.textView9.text = "$fl"
            Log.d("ratingBar","$fl")
        }
        */
        /*
        //라디오 버튼
        setContentView(radioButtonBinding.root)

        // radioGroup - 라디오그룹 위젯
        // i - 해당 라디오 그룹내에 클릭 된 라디오버튼의 id
        radioButtonBinding.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            when (i){
                // R.id는 생성된 id들을 코드로 생성한 것
                R.id.radioButton1 -> Log.d("라디오버튼", "김백산")
                R.id.radioButton3 -> Log.d("라디오버튼", "태백산")
                R.id.radioButton4 -> Log.d("라디오버튼", "소백산")
            }
        }
         */

        /*
        // 체크박스
        setContentView(checkBoxBinding.root)

        checkBoxBinding.checkBox.setOnCheckedChangeListener(listener)
        checkBoxBinding.checkBox2.setOnCheckedChangeListener(listener)
        checkBoxBinding.checkBox3.setOnCheckedChangeListener(listener)
        */

    }


}
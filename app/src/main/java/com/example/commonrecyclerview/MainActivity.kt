package com.example.commonrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.commonrecyclerview.adapter.CommonAdapter
import com.example.commonrecyclerview.data.CommonItem
import com.example.commonrecyclerview.data.ViewObject
import com.example.commonrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*
         * Retrofit2를 통해 데이터를 받고 JSON parsing까지 하였다고 가정합니다. 데이터의 예시는 아래와 같습니다.
         {
            "data": [
                {
                    "viewType": "ONE_LINE_TEXT",
                    "viewObject": {
                        "text1": "제목이 없는 글입니다."
                    }
                },{
                    "viewType": "TWO_LINE_TEXT",
                    "viewObject": {
                        "text1": "제목입니다.",
                        "text2": "안녕하세요. 반갑습니다. 제 이름은 홍길동입니다."
                    }
                },{
                    "viewType": "ONE_IMAGE",
                    "viewObject": {
                        "url": "https://picsum.photos/536/354"
                    }
                }
            ]
        }
         */
        val adapter = CommonAdapter(
            arrayOf(
                CommonItem(
                    "ONE_LINE_TEXT",
                    ViewObject.OneLineTextViewObject("제목이 없는 글입니다.")
                ), CommonItem(
                    "TWO_LINE_TEXT",
                    ViewObject.TwoLineTextViewObject("제목입니다.", "안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.")
                ), CommonItem(
                    "ONE_IMAGE",
                    ViewObject.OneImageViewObject("https://picsum.photos/536/354")
                )
            )
        )
        binding.recyclerviewCommon.adapter = adapter
    }
}
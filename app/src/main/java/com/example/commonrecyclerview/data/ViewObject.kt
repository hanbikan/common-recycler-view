package com.example.commonrecyclerview.data

/** 새로운 뷰타입이 생길 때마다 업데이트해야 합니다. */
sealed class ViewObject {
    data class OneLineTextViewObject(
        val text1: String
    ): ViewObject()

    data class TwoLineTextViewObject(
        val text1: String,
        val text2: String
    ): ViewObject()

    data class OneImageViewObject (
        val url: String
    ): ViewObject()
}
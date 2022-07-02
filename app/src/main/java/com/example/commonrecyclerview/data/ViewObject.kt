package com.example.commonrecyclerview.data

/** 새로운 뷰타입이 생길 때마다 업데이트해야 합니다. */
sealed class ViewObject {
    data class OneLineTextViewObject(
        val contents: String
    ): ViewObject()

    data class TwoLineTextViewObject(
        val title: String,
        val contents: String
    ): ViewObject()

    data class OneImageViewObject (
        val url: String
    ): ViewObject()
}
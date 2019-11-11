package com.noir.qiitaclient

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.noir.qiitaclient.model.Article
import com.noir.qiitaclient.model.User
import com.noir.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)

    // ArticleViewオブジェクトを生成
    val articieView = ArticleView(applicationContext)

    // Articleオブジェクトを生成して、ArticleViewオブジェクトにセット
    articieView.setArticle(
      Article(
        id = "123",
        title = "Kotlin入門",
        url = "http://www.example.com/articles/123",
        user = User(id = "456", name = "たろう", profileImageUrl = "")
      )
    )

    // このアクティビティにArticleViewをセット
    setContentView(articieView)

  }
}

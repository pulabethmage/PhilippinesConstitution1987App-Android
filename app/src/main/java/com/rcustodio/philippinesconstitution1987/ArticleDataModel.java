package com.rcustodio.philippinesconstitution1987;

public class ArticleDataModel {

    String articleTitle;
    String articleDescription;

    public ArticleDataModel(String title, String description ) {
        this.articleTitle=title;
        this.articleDescription=description;


    }

    public String getTitle() {
        return articleTitle;
    }

    public String getDescription() {
        return articleDescription;
    }



}

package com.example.newsapp2;

public class News {


    //Title of the news article
    private String mWebTitle;

    // name of the author of the article
    private String mAuthorName;

    //Name of the section
    private String mSectionName;

    //Date and time of the publication
    private String mWebPublicationDate;

    //URL of the html content
    private String mUrl;


    public News(String webTitle, String authorName, String sectionName, String webPublicationDate, String url) {
        mWebTitle = webTitle;
        mAuthorName = authorName;
        mSectionName = sectionName;
        mWebPublicationDate = webPublicationDate;
        mUrl = url;
    }

    // returns the title of the news
    public String getWebTitle() {
        return mWebTitle;
    }

    // returns the section name of the news
    public String getSectionName() {
        return mSectionName;
    }

    // returns the publication date of the news
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    // returns the author name of the article
    public String getAuthorName() { return mAuthorName; }

    // returns the web URL of the news
    public String getUrl() {
        return mUrl;
    }
}
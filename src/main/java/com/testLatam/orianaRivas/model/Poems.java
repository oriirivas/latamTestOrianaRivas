package com.testLatam.orianaRivas.model;

public class Poems {
    String content;
    Object poet;
    String title;
    String url;

    public String getContent() {
        return content;
    }

    public Object getPoet() {
        return poet;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Poems{" +
                "content='" + content + '\'' +
                ", poet=" + poet +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

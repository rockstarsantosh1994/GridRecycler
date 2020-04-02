package com.s.gridrecyclerview;

class SpeechData {

    private int imageSrc;
    private String title;

    public SpeechData(int imageSrc, String title) {
        this.imageSrc = imageSrc;
        this.title = title;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
package com.example.flyyy.miwork;

/**
 * {@link Word} 显示用户想要学习的词汇
 * 它包括Miwor词汇及其翻译
 */
public class Word {
    private String mMiworkWord;
    private String mDefaultWord;
    private int mImageId;

    public Word(String defaultWord, String miworkWord, int imageId) {
        mMiworkWord = miworkWord;
        mDefaultWord = defaultWord;
        mImageId = imageId;
    }

    public String getMiworkWord() {
        return mMiworkWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public int getmImageId() {
        return mImageId;
    }
}

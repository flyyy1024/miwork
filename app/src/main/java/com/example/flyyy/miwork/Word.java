package com.example.flyyy.miwork;

/**
 * {@link Word} 显示用户想要学习的词汇
 * 它包括Miwor词汇及其翻译
 */
public class Word {
    private String mMiworkWord;
    private String mDefaultWord;
    private int mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultWord, String miworkWord, int imageId) {
        mMiworkWord = miworkWord;
        mDefaultWord = defaultWord;
        mImageId = imageId;
    }

    public Word(String defaultWord, String miworkWord) {
        mMiworkWord = miworkWord;
        mDefaultWord = defaultWord;
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

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}

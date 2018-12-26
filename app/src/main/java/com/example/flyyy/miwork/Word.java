package com.example.flyyy.miwork;

/**
 * {@link Word} 显示用户想要学习的词汇
 * 它包括Miwor词汇及其翻译
 */
public class Word {
    private String mMiworkWord;
    private String mDefaultWord;

    public Word(String miworkWord , String defaultWord) {
        mMiworkWord = miworkWord;
        mDefaultWord = defaultWord;
    }

    public String getMiworkWord() {
        return mMiworkWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }
}

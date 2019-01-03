package com.example.flyyy.miwork;

/**
 * {@link Word} 显示用户想要学习的词汇及其相关资源
 * 它包括Miwor词汇及、翻译、图片资源id、媒体资源id
 */
public class Word {
    private String mMiworkWord;
    private String mDefaultWord;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mMusicId;

    //因为值-1不在所有的id资源值内，故可用-1表示没有图片
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultWord, String miworkWord, int imageId, int musicId) {
        mMiworkWord = miworkWord;
        mDefaultWord = defaultWord;
        mImageId = imageId;
        mMusicId = musicId;
    }

    public Word(String defaultWord, String miworkWord, int musicId) {
        mMiworkWord = miworkWord;
        mDefaultWord = defaultWord;
        mMusicId = musicId;
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

    public int getmMusicId() {
        return mMusicId;
    }

    /**
     * 检查是否有图片
     *
     * @return 如果mImageId中的值有变化，说明有图片
     */
    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}

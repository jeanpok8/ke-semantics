package com.example.android.esemantics;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Kinyarwanda translation, audio file, and
 * optional image file for that word.
 */
public class Word {
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mDefaultTranslationId;
    private int mEsemanticsTranslationId;
    private int mAudioResourceId;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId    is the string resource ID for the word in a language that the
     *                                user is already familiar with (such as English)
     * @param esemanticsTranslationId is the string resource Id for the word in the Kinyarwanda language
     * @param audioResourceId         is the resource ID for the audio file associated with this word
     */
    public Word(int defaultTranslationId, int esemanticsTranslationId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mEsemanticsTranslationId = esemanticsTranslationId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId    is the string resource ID for the word in a language that the
     *                                user is already familiar with (such as English)
     * @param esemanticsTranslationId is the string resource Id for the word in the Kinyarwanda language
     * @param imageResourceId         is the drawable resource ID for the image associated with the word
     * @param audioResourceId         is the resource ID for the audio file associated with this word
     */
    public Word(int defaultTranslationId, int esemanticsTranslationId, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mEsemanticsTranslationId = esemanticsTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    /**
     * Get the string resource ID for the Kinyarwanda translation of the word.
     */
    public int getEsemanticsTranslationId() {
        return mEsemanticsTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
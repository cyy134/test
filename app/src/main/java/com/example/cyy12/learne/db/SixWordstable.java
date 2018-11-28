package com.example.cyy12.learne.db;

import android.telephony.mbms.StreamingServiceInfo;

public class SixWordstable {
    private int SWordId;
    private String SWord;
    private String STranslate;

    public int getSWordId() {
        return SWordId;
    }

    public void setSWordId(int SWordId) {
        this.SWordId = SWordId;
    }

    public String getSTranslate() {
        return STranslate;
    }

    public void setSTranslate(String STranslate) {
        this.STranslate = STranslate;
    }

    public String getSWord() {
        return SWord;
    }

    public void setSWord(String SWord) {
        this.SWord = SWord;
    }
}

package com.example.cyy12.learne.db;

import android.text.SpannableString;

public class Rwordstable {
    private int RwordId;//复习表中单词
    private int userId;//用户id
    private String Rword;//复习表中单词
    private String Rtranslate;//复习表中单词中文意思

    public String getRtranslate() {
        return Rtranslate;
    }

    public void setRtranslate(String translate) {
        this.Rtranslate = translate;
    }

    public int getRwordId() {
        return RwordId;
    }

    public void setRwordId(int rwordId) {
        RwordId = rwordId;
    }

    public String getRword() {
        return Rword;
    }

    public void setRword(String rword) {
        Rword = rword;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

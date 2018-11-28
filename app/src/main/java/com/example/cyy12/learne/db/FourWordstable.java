package com.example.cyy12.learne.db;

public class FourWordstable {
    private int FWordId;//单词表单词id
    private String FWord;//单词表单词
    private String FTranslate;//单词表单词中文意思

    public int getFWordId() {
        return FWordId;
    }

    public void seFtWordId(int wordId) {
       FWordId = wordId;
    }

    public String getFWord() {
        return FWord;
    }

    public void setFWord(String word) {
        FWord = word;
    }

    public String getFTranslate() {
        return FTranslate;
    }

    public void setFTranslate(String translate) {
       FTranslate = translate;
    }
}

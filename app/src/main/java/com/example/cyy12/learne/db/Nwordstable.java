package com.example.cyy12.learne.db;

public class Nwordstable {
    private int NwordsId;//生词表单个生词id
    private int userId;
    private String Nwords;//生词表单词
    private String Ntranslate;//生词表单词中文意思

    public int getNwordsId() {
        return NwordsId;
    }

    public void setNwordsId(int nwordsId) {
        NwordsId = nwordsId;
    }

    public int getUserId() {
        return userId;
    }

    public String getNtranslate() {
        return Ntranslate;
    }

    public void setNtranslate(String ntranslate) {
        Ntranslate = ntranslate;
    }

    public String getNwords() {
        return Nwords;
    }

    public void setNwords(String nwords) {
        Nwords = nwords;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

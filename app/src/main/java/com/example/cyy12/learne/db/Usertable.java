package com.example.cyy12.learne.db;

public class Usertable{
    private int userId;
    private String userName;
    private String userPassword;
    private String WordType;//选择词库类型
    private String TestWord;//测试单词数
    private String WrongInterval;//错误单词间隔数

    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }
    public String getUserName(){
        return userName;

    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserPassword(){
        return userPassword;
    }
    public void setUserPassword(String userPassword){
        this.userPassword=userPassword;
    }
    public String getWordType(){
        return WordType;
    }
    public void setWordType(String wordType){
        this.WordType=wordType;
    }
    public String getTestWord(){
        return TestWord;
    }
    public void setTestWord(String testWord){
        this.TestWord=testWord;
    }
    public String getWrongInterval(){
        return WrongInterval;
    }
    public void setWrongInterval(String wrongInterval){
        this.WrongInterval=wrongInterval;
    }

}

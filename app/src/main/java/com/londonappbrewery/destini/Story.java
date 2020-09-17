package com.londonappbrewery.destini;

public class Story {

    int mAnswer1;
    int mAnswer2;
    int mStory;

    public int getStory() {
        return mStory;
    }

    public void setStory(int story) {
        mStory = story;
    }

    public Story(int answer1, int answer2, int story){
        mAnswer1 = answer1;
        mAnswer2 = answer2;
        mStory = story;
    }

    public int getAnswer1() {
        return mAnswer1;
    }

    public void setAnswer1(int answer1) {
        mAnswer1 = answer1;
    }

    public int getAnswer2() {
        return mAnswer2;
    }

    public void setAnswer2(int answer2) {
        mAnswer2 = answer2;
    }


}
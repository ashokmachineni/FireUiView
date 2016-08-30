package com.ashok.fireuiview;

/**
 * Created by ashok on 8/30/16.
 */
public class Blog {
    private String image,desc,test;

    public Blog(){

    }

    public Blog(String image, String desc, String test) {
        this.image = image;
        this.desc = desc;
        this.test = test;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

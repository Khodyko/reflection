package com.company.web;

public class Task1Super {

    protected String t1="protected";
    String t1_1="package-private";
    private String t1_2="private";
    public String t1_3="public";

    public String getT1_3() {
        return t1_3;
    }

    public void setT1_3(String t1_3) {
        this.t1_3 = t1_3;
    }

    protected String getT1() {
        return t1;
    }

    protected void setT1(String t1) {
        this.t1 = t1;
    }

    String getT1_1() {
        return t1_1;
    }

    void setT1_1(String t1_1) {
        this.t1_1 = t1_1;
    }

    private String getT1_2() {
        return t1_2;
    }

    private void setT1_2(String t1_2) {
        this.t1_2 = t1_2;
    }
}

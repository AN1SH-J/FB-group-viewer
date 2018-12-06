package io.google.facebookgroupviewer;

public class Feed {

    private String name;
    private String desc;

    public Feed(String name, String desc) {
        this.name = name;
        this.desc = desc;
        }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}


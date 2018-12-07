package io.google.facebookgroupviewer;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties

public class Feed {

    private String name;
    private String desc;
    private String imageurl;

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


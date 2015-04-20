package com.stud.criminalintent.app;

import java.util.UUID;

/**
 * @autor Ken.Cui
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(UUID id) {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}

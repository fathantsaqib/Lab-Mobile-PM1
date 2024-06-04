package com.example.prak3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Forall implements Parcelable {

    private String name, caption;
    private Integer image,image_story, iv_post, followers, following;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getImage_story() {
        return image_story;
    }

    public void setImage_story(Integer image_story) {
        this.image_story = image_story;
    }

    public Integer getIv_post() {
        return iv_post;
    }

    public void setIv_post(Integer iv_post) {
        this.iv_post = iv_post;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    protected Forall(Parcel in) {
        name = in.readString();
        caption = in.readString();
        if (in.readByte() == 0) {
            image = null;
        } else {
            image = in.readInt();
        }
        if (in.readByte() == 0) {
            image_story = null;
        } else {
            image_story = in.readInt();
        }
        if (in.readByte() == 0) {
            iv_post = null;
        } else {
            iv_post = in.readInt();
        }
        if (in.readByte() == 0) {
            followers = null;
        } else {
            followers = in.readInt();
        }
        if (in.readByte() == 0) {
            following = null;
        } else {
            following = in.readInt();
        }
    }

    public static final Creator<Forall> CREATOR = new Creator<Forall>() {
        @Override
        public Forall createFromParcel(Parcel in) {
            return new Forall(in);
        }

        @Override
        public Forall[] newArray(int size) {
            return new Forall[size];
        }
    };

    public Forall(String name, String caption, Integer image, Integer image_story, Integer iv_post, Integer followers, Integer following) {
        this.name = name;
        this.caption = caption;
        this.image = image;
        this.image_story = image_story;
        this.iv_post = iv_post;
        this.followers = followers;
        this.following = following;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(caption);
        if (image == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image);
        }
        if (image_story == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image_story);
        }
        if (iv_post == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(iv_post);
        }
        if (followers == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(followers);
        }
        if (following == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(following);
        }
    }
}

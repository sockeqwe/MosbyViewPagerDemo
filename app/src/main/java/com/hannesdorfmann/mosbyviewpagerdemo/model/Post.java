package com.hannesdorfmann.mosbyviewpagerdemo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.hannesdorfmann.parcelableplease.annotation.ParcelablePlease;

/**
 * @author Hannes Dorfmann
 */
@ParcelablePlease public class Post implements Parcelable {

  String id;
  String headline;
  String image_src;
  String story;

  public String getId() {
    return id;
  }

  public String getHeadline() {
    return headline;
  }

  public String getImageSrc() {
    return image_src;
  }

  public String getStory() {
    return story;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    PostParcelablePlease.writeToParcel(this, dest, flags);
  }

  public static final Creator<Post> CREATOR = new Creator<Post>() {
    public Post createFromParcel(Parcel source) {
      Post target = new Post();
      PostParcelablePlease.readFromParcel(target, source);
      return target;
    }

    public Post[] newArray(int size) {
      return new Post[size];
    }
  };
}

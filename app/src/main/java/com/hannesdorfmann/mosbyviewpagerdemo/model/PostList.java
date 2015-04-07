package com.hannesdorfmann.mosbyviewpagerdemo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.hannesdorfmann.parcelableplease.annotation.ParcelablePlease;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hannes Dorfmann
 */
@ParcelablePlease public class PostList implements Parcelable {

  ArrayList<Post> posts;

  public List<Post> getPosts() {
    return posts;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    PostListParcelablePlease.writeToParcel(this, dest, flags);
  }

  public static final Creator<PostList> CREATOR = new Creator<PostList>() {
    public PostList createFromParcel(Parcel source) {
      PostList target = new PostList();
      PostListParcelablePlease.readFromParcel(target, source);
      return target;
    }

    public PostList[] newArray(int size) {
      return new PostList[size];
    }
  };
}

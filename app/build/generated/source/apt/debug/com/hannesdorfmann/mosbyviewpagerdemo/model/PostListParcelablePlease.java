package com.hannesdorfmann.mosbyviewpagerdemo.model;

import android.os.Parcel;

/**
 * Generated class by @ParcelablePlease . Do not modify this code!
 */
public class PostListParcelablePlease {

  public static void writeToParcel(PostList source, Parcel parcel, int flags) {

    parcel.writeByte( (byte) (source.posts != null ? 1 : 0) );
    if (source.posts != null) {
      parcel.writeList(source.posts);
    }
  }

  public static void readFromParcel(PostList target, Parcel parcel) {

    boolean postsNullHelper;
    postsNullHelper = ( parcel.readByte() == 1 );
    if (postsNullHelper) {
      java.util.ArrayList<com.hannesdorfmann.mosbyviewpagerdemo.model.Post> postsListHelper = new java.util.ArrayList<com.hannesdorfmann.mosbyviewpagerdemo.model.Post>();
      parcel.readList(postsListHelper, com.hannesdorfmann.mosbyviewpagerdemo.model.Post.class.getClassLoader());
      target.posts = postsListHelper;
    } else {
      target.posts = null;
    }
  }
}

package com.hannesdorfmann.mosbyviewpagerdemo.model;

import android.os.Parcel;

/**
 * Generated class by @ParcelablePlease . Do not modify this code!
 */
public class PostParcelablePlease {

  public static void writeToParcel(Post source, Parcel parcel, int flags) {

    parcel.writeString(source.id);

    parcel.writeString(source.headline);

    parcel.writeString(source.image_src);

    parcel.writeString(source.story);
  }

  public static void readFromParcel(Post target, Parcel parcel) {

    target.id = parcel.readString();

    target.headline = parcel.readString();

    target.image_src = parcel.readString();

    target.story = parcel.readString();
  }
}

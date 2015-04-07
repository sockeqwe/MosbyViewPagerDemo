package com.hannesdorfmann.mosbyviewpagerdemo.model;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * @author Hannes Dorfmann
 */
public interface GivesMeHopeApi {

  @GET("/posts/all.json")
  public void getPosts(Callback<PostList> callback);

}

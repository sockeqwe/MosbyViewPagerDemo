package com.hannesdorfmann.mosbyviewpagerdemo;

import com.hannesdorfmann.mosby.retrofit.LceRetrofitPresenter;
import com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi;
import com.hannesdorfmann.mosbyviewpagerdemo.model.PostList;
import javax.inject.Inject;

/**
 * @author Hannes Dorfmann
 */
public class PostsPresenter extends LceRetrofitPresenter<PostsView, PostList> {

  GivesMeHopeApi api;

  @Inject
  public PostsPresenter(GivesMeHopeApi api){
    this.api = api;
  }

  public void loadPosts(boolean pullToRefresh){
    api.getPosts(new LceCallback(pullToRefresh));
  }
}

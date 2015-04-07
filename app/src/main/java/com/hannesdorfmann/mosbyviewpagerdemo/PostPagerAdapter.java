package com.hannesdorfmann.mosbyviewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.hannesdorfmann.mosbyviewpagerdemo.model.PostList;
import com.hannesdorfmann.mosbyviewpagerdemo.post.PostFragmentBuilder;

/**
 * @author Hannes Dorfmann
 */
// You may consider to use FragmentStatePagerAdpater to reduce memory consumption
public class PostPagerAdapter extends FragmentPagerAdapter {

  private PostList postList;

  public PostPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override public Fragment getItem(int position) {
    return new PostFragmentBuilder(postList.getPosts().get(position)).build();
  }

  @Override public int getCount() {
    return postList == null ? 0 : postList.getPosts().size();
  }

  public PostList getPostList() {
    return postList;
  }

  public void setPostList(PostList postList) {
    this.postList = postList;
  }

}

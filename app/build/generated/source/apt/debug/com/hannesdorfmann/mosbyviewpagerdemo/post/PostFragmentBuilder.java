package com.hannesdorfmann.mosbyviewpagerdemo.post;

import android.os.Bundle;
public final class PostFragmentBuilder {
  private final Bundle mArguments = new Bundle();

  public PostFragmentBuilder(com.hannesdorfmann.mosbyviewpagerdemo.model.Post post) {
    mArguments.putParcelable("post", post);
  }
  public static PostFragment newPostFragment(com.hannesdorfmann.mosbyviewpagerdemo.model.Post post) {
    return new PostFragmentBuilder(post).build();
  }
  public static final void injectArguments(PostFragment fragment) {
    Bundle args = fragment.getArguments();
    if (args == null) {
      throw new IllegalStateException("No arguments set");
    }
    if (!args.containsKey("post")) {
      throw new IllegalStateException("required argument post is not set");
    }
    fragment.post = args.getParcelable("post");
  }
  public PostFragment build() {
    PostFragment fragment = new PostFragment();
    fragment.setArguments(mArguments);
    return fragment;
  }
  public <F extends PostFragment> F build(F fragment) {
    fragment.setArguments(mArguments);
    return fragment;
  }
}

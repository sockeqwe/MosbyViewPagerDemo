package com.hannesdorfmann.mosbyviewpagerdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import butterknife.InjectView;
import com.hannesdorfmann.mosby.dagger1.viewstate.lce.Dagger1MvpLceViewStateActivity;
import com.hannesdorfmann.mosby.mvp.viewstate.lce.ParcelableLceViewState;
import com.hannesdorfmann.mosby.mvp.viewstate.lce.data.ParcelableDataLceViewState;
import com.hannesdorfmann.mosbyviewpagerdemo.model.PostList;

public class MainActivity
    extends Dagger1MvpLceViewStateActivity<SwipeRefreshLayout, PostList, PostsView, PostsPresenter>
    implements PostsView, SwipeRefreshLayout.OnRefreshListener {

  @InjectView(R.id.viewPager) ViewPager viewPager;

  PostPagerAdapter adapter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    contentView.setOnRefreshListener(this);
  }

  @Override public ParcelableLceViewState<PostList, PostsView> createViewState() {
    return new ParcelableDataLceViewState<>();
  }

  @Override public PostList getData() {
    return adapter.getPostList();
  }

  @Override protected String getErrorMessage(Throwable throwable, boolean b) {
    return "An error has occurred";
  }

  @Override protected PostsPresenter createPresenter() {
    return getObjectGraph().get(PostsPresenter.class);
  }

  @Override public void setData(PostList postList) {
    adapter = new PostPagerAdapter(getSupportFragmentManager());
    adapter.setPostList(postList);
    viewPager.setAdapter(adapter);
  }

  @Override public void loadData(boolean b) {
    presenter.loadPosts(b);
  }

  @Override public void onRefresh() {
    loadData(true);
  }

  @Override public void showError(Throwable e, boolean pullToRefresh) {
    super.showError(e, pullToRefresh);
    contentView.setRefreshing(false);
  }

  @Override public void showContent() {
    super.showContent();
    contentView.setRefreshing(false);
  }

  @Override public void showLoading(boolean pullToRefresh) {
    super.showLoading(pullToRefresh);
    if (!contentView.isRefreshing()){
      contentView.post(new Runnable() {
        @Override public void run() {
          contentView.setRefreshing(true);
        }
      });
    }
  }
}

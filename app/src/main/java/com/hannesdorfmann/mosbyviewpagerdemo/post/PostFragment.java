package com.hannesdorfmann.mosbyviewpagerdemo.post;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.InjectView;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.mosby.dagger1.Dagger1MosbyFragment;
import com.hannesdorfmann.mosbyviewpagerdemo.R;
import com.hannesdorfmann.mosbyviewpagerdemo.model.Post;
import com.squareup.picasso.Picasso;
import javax.inject.Inject;

/**
 * @author Hannes Dorfmann
 */
public class PostFragment extends Dagger1MosbyFragment {

  @Arg Post post;

  @Inject Picasso picasso;

  @InjectView(R.id.image) ImageView image;

  @InjectView(R.id.title) TextView title;

  @InjectView(R.id.text) TextView text;

  @Override protected int getLayoutRes() {
    return R.layout.fragment_post;
  }

  @Override public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    title.setText(post.getHeadline());
    text.setText(Html.fromHtml(post.getStory()));

    picasso.load(post.getImageSrc())
        .placeholder(R.color.transparent)
        .error(R.color.transparent)
        .into(image);
  }

  @Override protected void injectDependencies() {
    getObjectGraph().inject(this);
  }
}

// Generated code from Butter Knife. Do not modify!
package com.hannesdorfmann.mosbyviewpagerdemo.post;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class PostFragment$$ViewInjector<T extends com.hannesdorfmann.mosbyviewpagerdemo.post.PostFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296294, "field 'image'");
    target.image = finder.castView(view, 2131296294, "field 'image'");
    view = finder.findRequiredView(source, 2131296298, "field 'title'");
    target.title = finder.castView(view, 2131296298, "field 'title'");
    view = finder.findRequiredView(source, 2131296323, "field 'text'");
    target.text = finder.castView(view, 2131296323, "field 'text'");
  }

  @Override public void reset(T target) {
    target.image = null;
    target.title = null;
    target.text = null;
  }
}

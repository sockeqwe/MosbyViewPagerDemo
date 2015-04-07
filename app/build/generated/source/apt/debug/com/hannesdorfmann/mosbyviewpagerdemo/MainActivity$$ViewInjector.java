// Generated code from Butter Knife. Do not modify!
package com.hannesdorfmann.mosbyviewpagerdemo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.hannesdorfmann.mosbyviewpagerdemo.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296322, "field 'viewPager'");
    target.viewPager = finder.castView(view, 2131296322, "field 'viewPager'");
  }

  @Override public void reset(T target) {
    target.viewPager = null;
  }
}

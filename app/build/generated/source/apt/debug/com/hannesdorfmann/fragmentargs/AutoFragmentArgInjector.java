package com.hannesdorfmann.fragmentargs;

import android.os.Bundle;
public final class AutoFragmentArgInjector
    implements FragmentArgsInjector {

  public void inject(Object target) {

    Class<?> targetClass = target.getClass();
    String targetName = targetClass.getCanonicalName();

    if ( "com.hannesdorfmann.mosbyviewpagerdemo.post.PostFragment".equals(targetName) ) {
      com.hannesdorfmann.mosbyviewpagerdemo.post.PostFragmentBuilder.injectArguments( ( com.hannesdorfmann.mosbyviewpagerdemo.post.PostFragment ) target);
      return;
    }
  }
}

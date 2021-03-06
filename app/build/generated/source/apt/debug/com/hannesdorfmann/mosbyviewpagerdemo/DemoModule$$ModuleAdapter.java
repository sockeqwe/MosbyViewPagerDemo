// Code generated by dagger-compiler.  Do not edit.
package com.hannesdorfmann.mosbyviewpagerdemo;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class DemoModule$$ModuleAdapter extends ModuleAdapter<DemoModule> {
  private static final String[] INJECTS = { "members/com.hannesdorfmann.mosbyviewpagerdemo.post.PostFragment", "members/com.hannesdorfmann.mosbyviewpagerdemo.PostsPresenter", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public DemoModule$$ModuleAdapter() {
    super(com.hannesdorfmann.mosbyviewpagerdemo.DemoModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, true /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, DemoModule module) {
    bindings.contributeProvidesBinding("com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi", new ProvidesGivesMeHopeApiProvidesAdapter(module));
    bindings.contributeProvidesBinding("com.squareup.picasso.Picasso", new ProvidesPicassoProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidesGivesMeHopeApiProvidesAdapter extends ProvidesBinding<com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi>
      implements Provider<com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi> {
    private final DemoModule module;

    public ProvidesGivesMeHopeApiProvidesAdapter(DemoModule module) {
      super("com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi", IS_SINGLETON, "com.hannesdorfmann.mosbyviewpagerdemo.DemoModule", "providesGivesMeHopeApi");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi>}.
     */
    @Override
    public com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi get() {
      return module.providesGivesMeHopeApi();
    }
  }

  /**
   * A {@code Binding<com.squareup.picasso.Picasso>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.squareup.picasso.Picasso>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidesPicassoProvidesAdapter extends ProvidesBinding<com.squareup.picasso.Picasso>
      implements Provider<com.squareup.picasso.Picasso> {
    private final DemoModule module;

    public ProvidesPicassoProvidesAdapter(DemoModule module) {
      super("com.squareup.picasso.Picasso", IS_SINGLETON, "com.hannesdorfmann.mosbyviewpagerdemo.DemoModule", "providesPicasso");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.squareup.picasso.Picasso>}.
     */
    @Override
    public com.squareup.picasso.Picasso get() {
      return module.providesPicasso();
    }
  }
}

package com.hannesdorfmann.mosbyviewpagerdemo;

import android.content.Context;
import com.hannesdorfmann.mosbyviewpagerdemo.model.GivesMeHopeApi;
import com.hannesdorfmann.mosbyviewpagerdemo.post.PostFragment;
import com.squareup.picasso.Picasso;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import retrofit.RestAdapter;

/**
 * @author Hannes Dorfmann
 */
@Module(
    library = true,
    injects = {
        PostFragment.class,
        PostsPresenter.class
    }
)
public class DemoModule {

  private Context applicationContext;

  public DemoModule(Context context){
    this.applicationContext = context;
  }


  @Provides @Singleton
  public GivesMeHopeApi providesGivesMeHopeApi(){
    RestAdapter restAdapter = new RestAdapter.Builder()
        .setEndpoint("http://api.givesmehope.com/v1")
        .build();

    return restAdapter.create(GivesMeHopeApi.class);
  }

  @Provides @Singleton public Picasso providesPicasso(){
    return Picasso.with(applicationContext);
  }
}

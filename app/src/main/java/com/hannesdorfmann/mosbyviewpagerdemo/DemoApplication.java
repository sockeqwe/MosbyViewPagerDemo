package com.hannesdorfmann.mosbyviewpagerdemo;

import android.app.Application;
import com.hannesdorfmann.mosby.dagger1.Injector;
import dagger.ObjectGraph;

/**
 * @author Hannes Dorfmann
 */
public class DemoApplication extends Application implements Injector{

  private ObjectGraph objectGraph;

  @Override public void onCreate() {
    super.onCreate();
    objectGraph = ObjectGraph.create(new DemoModule(this));
  }

  @Override public ObjectGraph getObjectGraph() {
    return objectGraph;
  }
}

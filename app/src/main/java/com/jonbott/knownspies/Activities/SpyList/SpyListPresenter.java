package com.jonbott.knownspies.Activities.SpyList;

import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jonbott.knownspies.Helpers.Threading;
import com.jonbott.knownspies.ModelLayer.DTOs.SpyDTO;
import com.jonbott.knownspies.ModelLayer.Database.Realm.Spy;
import com.jonbott.knownspies.ModelLayer.Enums.Source;
import com.jonbott.knownspies.ModelLayer.ModelLayer;
import com.jonbott.knownspies.ModelLayer.Translation.SpyTranslator;

import java.io.IOException;
import java.util.List;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.realm.Realm;
import io.realm.RealmResults;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SpyListPresenter {

    private static final String TAG = "SpyListPresenter";

    ModelLayer modelLayer = new ModelLayer();


    private Realm realm = Realm.getDefaultInstance();

    //region Presenter Methods

    public void loadData(Consumer<List<Spy>> onNewResults, Consumer<Source> notifyDataReceived) {
        modelLayer.loadData(onNewResults, notifyDataReceived);
    }

    //endregion

}

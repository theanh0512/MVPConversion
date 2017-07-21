package com.jonbott.knownspies.ModelLayer.Translation;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jonbott.knownspies.ModelLayer.DTOs.SpyDTO;
import com.jonbott.knownspies.ModelLayer.Enums.DTOType;

import java.util.List;

public class TranslationLayer {
    private static final String TAG = "TranslationLayer";

    private Gson gson = new Gson();

    private SpyTranslator spyTranslator = new SpyTranslator();

    public List<SpyDTO> convertJson(String json) {
        Log.d(TAG, "converting json to dtos");

        TypeToken<List<SpyDTO>> token = new TypeToken<List<SpyDTO>>(){};

        return gson.fromJson(json, token.getType());
    }

    public SpyTranslator translatorFor(DTOType type){
        switch (type) {
            case spy:
                return spyTranslator;
            default:
                return spyTranslator;
        }
    }
}

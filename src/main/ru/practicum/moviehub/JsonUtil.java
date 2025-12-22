package ru.practicum.moviehub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {
    private static final Gson GSON = new GsonBuilder()
            .create();

    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }
}
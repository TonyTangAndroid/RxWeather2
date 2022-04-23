package com.example.android.rxweather.datamodel;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

import java.util.List;

@GenerateTypeAdapter
@AutoValue
public abstract class Dto implements Parcelable {
    @SerializedName("address")
    public abstract String address();

    @SerializedName("days")
    public abstract List<Day> weather_list_by_days();

    @SerializedName("currentConditions")
    public abstract CurrentConditions currentConditions();
}

package com.example.android.rxweather;

import com.example.android.rxweather.datamodel.Day_RX;
import com.example.android.rxweather.roomdatabean.DayModel;

public class DayToDayModel {
    public static DayModel rxToDayModel(Day_RX day, int weather_obj_id) {
        return new DayModel(
                day.datetime_daily(),
                day.datetimeEpoch_daily(),
                day.temp_max(),
                day.temp_min(),
                day.icon_daily(),
                weather_obj_id);
    }
}
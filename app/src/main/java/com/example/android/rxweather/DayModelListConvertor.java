package com.example.android.rxweather;

import com.example.android.rxweather.datamodel.Dto_RX;
import com.example.android.rxweather.roomdatabean.DayModel;
import java.util.List;
import java.util.stream.Collectors;

public class DayModelListConvertor {
    public static List<DayModel> convertor(Dto_RX dtoRX, int weatherObjId) {
        return dtoRX
                .weather_list_by_days()
                .stream()
                .map(assetsBean ->
                        new DayModel(assetsBean.datetime_daily(),
                                assetsBean.datetimeEpoch_daily(),
                                assetsBean.temp_max(),
                                assetsBean.temp_min(),
                                assetsBean.icon_daily(),
                                weatherObjId))
                .collect(Collectors.toList());
    }
}
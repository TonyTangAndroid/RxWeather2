package com.example.android.rxweather.recyclerview;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.android.rxweather.R;
import com.example.android.rxweather.datamodel.Hours;
import com.example.android.rxweather.util.Convertor;

public class HoursListViewHolder extends RecyclerView.ViewHolder{
    LinearLayout parent_layout;
    TextView server_time_hourly,temperature_hourly;
    ImageView icon_hourly;

    public HoursListViewHolder(@NonNull View itemView) {
        super(itemView);
        parent_layout = itemView.findViewById(R.id.list_item_hourly);
        server_time_hourly = itemView.findViewById(R.id.server_time_hourly);
        temperature_hourly = itemView.findViewById(R.id.temperature_hourly);
        icon_hourly = itemView.findViewById(R.id.icon_hourly);
    }

    @SuppressLint("SetTextI18n")
    public void bindHoursData(Hours hourlyItem){
        server_time_hourly.setText(Convertor.unixTimeConvertTo12HourFormat(hourlyItem.datetimeEpoch_hourly()));
        temperature_hourly.setText(hourlyItem.temp_hourly()+"°");
        Glide.with(itemView.getContext()).load(hourlyItem.icon_hourly()).into(icon_hourly);
    }

}

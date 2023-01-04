package com.nevitoniuri.ticketbusapi.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DateUtil {

    public static LocalDateTime handleData(String data) {
        return LocalDateTime.parse(data, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static LocalDateTime handleDataHora(String dataHora) {
        return LocalDateTime.parse(dataHora, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

}

package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Enum {
    ACCEPTED(2650978523929384669L, "Запрос не обработан"),
    PROCESSED(2871289810490758340L, "Запрос обработан"),
    ANSWERED(2871290103546778821L, "Дан ответ"),
    SENT(2871290321197601990L, "Отправлен"),
    NOT_FOUND(2650977848948430555L, "Данные отсутствуют"),
    FOUND_IN_ARCHIVE(2650978360519300828L, "Данные обнаружены в архиве");

    Long id;

    String name;
}

package com.testLatam.orianaRivas.service;

import java.text.ParseException;
public interface IPersonService<K,T> {
    K birthdayInfo(T t) throws ParseException;
}

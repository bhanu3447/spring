package com.bhanu.dummy1.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("Car")
@Primary
@Component
public class Car implements Vehicle
{

}

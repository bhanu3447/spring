package com.bhanu.dummy1.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Bike")
@Component
public class Bike  implements Vehicle
{

}

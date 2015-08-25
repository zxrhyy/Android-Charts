//
// DataRange.java
// cn.limc.androidcharts.degree
//
// Created by limc on 2015-7-22.
//
// Copyright 2015 Shanghai Okasan-Huada Computer System Co. Ltd., All rights reserved.
//
package cn.limc.androidcharts.model;

import cn.limc.androidcharts.series.ChartDataSet;

/**
 * DataRange
 * Description: <br>
 *   <p>add description here </p>
 * Tags: <br>
 *   <p> </p>
 *
 * @author limc
 * @version v1.0 
 * 
 * History: <br>
 * 2015-7-22 limc create v1.0 <br>
 *
 */
public interface DataRange {
    
    public static final int DEFAULT_DATA_MULTIPLE = 1;
    public static final boolean DEFAULT_AUTO_CALC_VALUE_RANGE = true;
    
    int getDataMultiple();
    double getMaxValue();
    double getMinValue();
    void setMaxValue(double max);
    void setMinValue(double min);
    
    double getValueRange();
    double valueForRate(double rate);
    
    boolean isAutoCalcValueRange();
    void calcValueRange(ChartDataSet data);
    void optimizeValueRange();
    
    RangeCalculator getRangeCalculator();
    void setRangeCalculator(RangeCalculator rangeCalculator);
}

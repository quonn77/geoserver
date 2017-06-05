/* Copyright (c) 2013 - 2017 Boundless - http://boundlessgeo.com All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package com.boundlessgeo.gsr.core.symbol;

import com.boundlessgeo.gsr.core.format.EnumTypeConverter;

/**
 * 
 * @author Juan Marin, OpenGeo
 * 
 */
public class SimpleLineSymbolEnumConverter extends EnumTypeConverter {

    public SimpleLineSymbolEnumConverter() {
        super(SimpleLineSymbolEnum.class);
    }

    @Override
    public String toString(Object obj) {
        String str = "";
        if (obj instanceof SimpleLineSymbolEnum) {
            SimpleLineSymbolEnum fieldType = (SimpleLineSymbolEnum) obj;
            switch (fieldType) {
            case DASH:
                str = "esriSLSDash";
                break;
            case DASH_DOT:
                str = "esriSLSDashDot";
                break;
            case DASH_DOT_DOT:
                str = "esriSLSDashDotDot";
                break;
            case DOT:
                str = "esriSLSDot";
                break;
            case INSIDE_FRAME:
                str = "esriSLSInsideFrame";
                break;
            case NULL:
                str = "esriSLSNull";
                break;
            case SOLID:
                str = "esriSLSSolid";
                break;
            }
        }
        return str;
    }
}

/* Copyright (c) 2013 - 2017 Boundless - http://boundlessgeo.com All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package com.boundlessgeo.gsr.core.feature;

import com.boundlessgeo.gsr.core.geometry.Geometry;

/**
 * 
 * @author Juan Marin, OpenGeo
 * 
 */
public class Feature {

    private Geometry geometry;

    private AttributeList attributes;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public AttributeList getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeList attributes) {
        this.attributes = attributes;
    }

    public Feature(Geometry geometry, AttributeList attributes) {

        super();
        this.geometry = geometry;
        this.attributes = attributes;
    }
}

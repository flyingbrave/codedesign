package com.yxy.structure.core;

import com.yxy.structure.AppJoint;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



/**
 * Created by zhounl on 2017/11/14.
 */
@Retention(RetentionPolicy.CLASS)
public @interface ServiceProvider {
    String value() default AppJoint.DEFAULT_NAME;
}

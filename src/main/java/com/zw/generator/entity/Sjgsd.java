package com.zw.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hellozw
 * @since 2020-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Sjgsd implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 手机前7位
     */
    private String sjhmq7;

    /**
     * 归属地运营商
     */
    private String gsdyys;


}

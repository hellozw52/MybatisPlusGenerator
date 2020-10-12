package com.zw.generator.entity;

import java.time.LocalDateTime;
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
public class RegionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码
     */
    private String regionId;

    /**
     * 名称
     */
    private String regionName;

    /**
     * 简称
     */
    private String regionShortName;

    /**
     * 上级代码
     */
    private String regionSuperId;

    /**
     * 经度
     */
    private String regionLon;

    /**
     * 纬度
     */
    private String regionLat;

    /**
     * 排序
     */
    private Integer regionSort;

    /**
     * 创建时间
     */
    private LocalDateTime regionCreateTime;

    /**
     * 修改时间
     */
    private LocalDateTime regionModifyTime;

    /**
     * 备注
     */
    private String regionRemark;

    /**
     * 状态
     */
    private Integer regionState;

    /**
     * 租户ID
     */
    private String regionTenantId;

    /**
     * 级别
     */
    private String regionLevel;


}

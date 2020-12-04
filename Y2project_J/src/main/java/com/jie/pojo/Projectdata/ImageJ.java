package com.jie.pojo.Projectdata;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/414:10     图片列表 【image Table】      ImageJ
 * -♥---J
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageJ {
    private Integer imgId;
    private String  imgThumbnail;
    private String  imgName;
    private String  imgAttribute;
    private Integer imgSuborDinate;
    private Integer imgAuditStatus;
    private String  imgopen;
}

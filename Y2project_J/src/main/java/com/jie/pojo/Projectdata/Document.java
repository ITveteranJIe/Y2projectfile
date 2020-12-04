package com.jie.pojo.Projectdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/414:07     文档列表 【document Table】      Document
 * -♥---J
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    private  Integer  documentId;
    private  String   documentName;
    private  String   documentwhat;
    private  String   documenWay;
    private  Integer  documenState;
    private  String   documenTurnoverTime;
    private  Integer  documenCliksInt;
}

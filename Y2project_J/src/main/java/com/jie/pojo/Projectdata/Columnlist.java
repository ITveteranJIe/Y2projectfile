package com.jie.pojo.Projectdata;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/414:03     栏目 实体类 【Column table】      Columnlist
 * -♥---J
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Columnlist {
    private  Integer  columnID;
    private  String   columnName;
    private  String   columnimg;
    private  String   columnType;
    private  String   columnOpen;
    private  Integer  columnState;
    private  String   columnTurnovertime;
}

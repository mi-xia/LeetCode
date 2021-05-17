package javaTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class dealTableTest {

    @Test
    public void dealTable() {

        String ss = "id bigint(20) NOT NULL AUTO_INCREMENT 自增主键\n" +
                "activity_id bigint(20) NOT NULL COMMENT 活动id\n" +
                "item_id bigint(20) DEFAULT NULL COMMENT 商品id\n" +
                "total_quantity bigint(20) DEFAULT NULL COMMENT 总数量\n" +
                "available_quantity bigint(20) DEFAULT NULL COMMENT 可用数量\n" +
                "warehouse_code varchar(40) DEFAULT NULL COMMENT 仓库编码\n" +
                "status tinyint(6) NOT NULL COMMENT 状态\n" +
                "create_at datetime DEFAULT NULL COMMENT 创建时间\n" +
                "update_at datetime DEFAULT NULL COMMENT 更新时间";

        dealTable s = new dealTable();
        s.dealTable(ss);

    }
}
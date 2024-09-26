package cn.hutool.db;

import cn.hutool.db.sql.Order;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PageTest {

	@Test
	public void addOrderTest() {
		Page page = new Page();
		page.addOrder(new Order("aaa"));
		assertEquals(page.getOrders().length, 1);
		page.addOrder(new Order("aaa"));
		assertEquals(page.getOrders().length, 2);
	}
}

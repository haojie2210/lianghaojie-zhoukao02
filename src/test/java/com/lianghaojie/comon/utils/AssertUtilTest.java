package com.lianghaojie.comon.utils;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/**
 * 
 * @ClassName: AssertUtilTest 
 * @Description: 断言测试类
 * @author:单击开始
 * @date: 2019年7月15日 上午9:16:33
 */
public class AssertUtilTest {

	@Test
	public void test1() throws CMSException {
		AssertUtil.isTrue(3>2, "没通过");
	}
	@Test
	public void test2() throws CMSException {
		AssertUtil.isFalse(3<2, "没通过");
	}
	@Test
	public void test3() throws CMSException {
		
		Object obj = null ;
		AssertUtil.notNull(obj, "没通过");
	}
	@Test
	public void test4() throws CMSException {
		
		Object obj = new Object() ;
		AssertUtil.isNull(obj, "没通过");
	}
	@Test
	public void test5() throws CMSException {
		
//		List list = new ArrayList<>() ;
//		list.add(new Object());
		List list = null;
		AssertUtil.notEmpty(list, "没通过");
	}
	@Test
	public void test6() throws CMSException {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("obj", new Object());
//		Map<String, Object> map1 = null ;
		Map<String, Object> map = null;
		AssertUtil.notEmpty(map, "没通过");
	}
	@Test
	public void test7() throws CMSException {
		
		AssertUtil.hasText(null, "没通过");
	}
	@Test
	public void test8() throws CMSException {
		
		BigDecimal bigDecimal = new BigDecimal(0);
		AssertUtil.greaterThanZero(bigDecimal, "没通过");
	}
}

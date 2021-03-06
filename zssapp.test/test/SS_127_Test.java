/* order_test_1Test.java

	Purpose:
		
	Description:
		
	History:
		Sep, 7, 2010 17:30:59 PM

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

This program is distributed under Apache License Version 2.0 in the hope that
it will be useful, but WITHOUT ANY WARRANTY.
*/

//insert => entire row : F12
public class SS_127_Test extends SSAbstractTestCase {
	@Override
	protected void executeTest() {
		String oriF12value = getSpecifiedCell(5,11).text();
		String oriG12value = getSpecifiedCell(6,11).text();
		
		rightClickCell(5,11);
		mouseOver(jq("a.z-menu-cnt:eq(0)"));		
		waitResponse();
		click(jq("$insertEntireRow a.z-menu-item-cnt"));
		waitResponse();
		
		//verify
		String f12value = getSpecifiedCell(5,11).text();
		String f13value = getSpecifiedCell(5,12).text();		
		verifyEquals(oriF12value, f13value);
		verifyEquals(f12value, null);
		String g12value = getSpecifiedCell(6,11).text();
		String g13value = getSpecifiedCell(6,12).text();		
		verifyEquals(oriG12value, g13value);
		verifyEquals(g12value, null);
	}
}




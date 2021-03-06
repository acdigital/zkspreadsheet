import org.zkoss.ztl.JQuery;
import org.zkoss.ztl.util.ColorVerifingHelper;


public class SS_071_Test extends SSAbstractTestCase {

    @Override
    protected void executeTest() {
        // Select cell
        JQuery cell_L_13 = getSpecifiedCell(11, 12);
        clickCell(cell_L_13);
        clickCell(cell_L_13);
        
        // Click Border icon
        JQuery borderIcon = jq("$fastIconBtn $borderBtn:visible");
        mouseOver(borderIcon);
        waitResponse();
        clickAt(borderIcon, "30,0");
        waitResponse();
        
        // Click left border
        click(jq(".z-menu-popup:visible .z-menu-item:eq(2)"));
        waitResponse();
        
        // Verify
        verifyTrue(ColorVerifingHelper.isEqualColor("#000000", getSpecifiedCell(10, 12).parent().css("border-left-color")));
    }

}

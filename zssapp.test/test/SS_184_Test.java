import org.zkoss.ztl.JQuery;


public class SS_184_Test extends SSAbstractTestCase {

    @Override
    protected void executeTest() {
        // Select source cell
        JQuery cell_J_13 = getSpecifiedCell(9, 12);
        clickCell(cell_J_13);
        clickCell(cell_J_13);
        
        // Ctrl + C
        keyDownNative(CTRL);
        waitResponse();
        keyDownNative(C);
        waitResponse();
        keyUpNative(C);
        waitResponse();
        keyUpNative(CTRL);
        waitResponse();
        
        // Right click target cell
        JQuery cell_L_13 = loadTargetCell();
        clickCell(cell_L_13);
        rightClickCell(cell_L_13);
        waitResponse();
        
        // Click Paste Special on the context menu
        click(jq("$pasteSpecial"));
        waitResponse();
        
        // Choose Values and number formats
        click(jq("$valueWithNumFmt input[id*=real]"));
        waitResponse();
        click(jq("$okBtn"));
        waitResponse();
        
        // Verify
        cell_L_13 = loadTargetCell();
        verifyEquals("Incorrect result! J13=" + cell_J_13.text() + ", L13=" + cell_L_13.text(), 
                cell_J_13.text(), cell_L_13.text());
    }
    
    private JQuery loadTargetCell() {
        return getSpecifiedCell(11, 12);
    }

}

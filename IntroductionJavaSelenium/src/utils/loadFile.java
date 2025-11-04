package utils;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class loadFile {
	Robot r;
	StringSelection ss;

	public void loadFileSystem(String dir) throws AWTException {
		r = new Robot();
		r.delay(1000);
		ss = new StringSelection(dir);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);;
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}

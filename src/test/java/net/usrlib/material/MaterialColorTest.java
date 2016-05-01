package net.usrlib.material;

import org.junit.Test;

import junit.framework.TestCase;
import net.usrlib.material.color.*;

public class MaterialColorTest extends TestCase {
	@Test
	public void testGetTheme() {
		MaterialTheme theme = MaterialTheme.getTheme(Theme.OBSIDIAN);

		assertTrue(
				"MaterialColor.getTheme should return a valid object of the type MaterialTheme", 
				theme instanceof MaterialTheme
		);
	}
	@Test
	public void testGetColor() {
		MaterialTheme theme = MaterialTheme.getTheme(Theme.OBSIDIAN);
		ColorCode colorCode = theme.getColor(MaterialColor.BLUE);
		String hexValue = Blue.COLOR_LIST.get(Theme.OBSIDIAN.getValue()).hex;

		assertTrue(
				"Theme.getColor should return the correct color code for the selected Theme", 
				colorCode.hex.equals(hexValue)
		);
	}
	@Test
	public void testGetNextColor() {
		MaterialTheme theme = MaterialTheme.getTheme(Theme.SAHARA);
		ColorCode colorCode = theme.getNextColor();
		// Red is always the first color on the palette
		String hexValue = Red.COLOR_LIST.get(Theme.SAHARA.getValue()).hex;

		assertTrue(
				"Theme.getNextColor should return the next color on the palette for the selected Theme", 
				colorCode.hex.equals(hexValue)
		);
	}
}

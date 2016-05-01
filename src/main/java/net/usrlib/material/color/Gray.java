package net.usrlib.material.color;

import java.util.Arrays;
import java.util.List;

import net.usrlib.material.ColorCode;

public class Gray {
	public static final ColorCode _50 = new ColorCode("FAFAFA", new int[] {250, 250, 250});
	public static final ColorCode _100 = new ColorCode("F5F5F5", new int[] {245, 245, 245});
	public static final ColorCode _200 = new ColorCode("EEEEEE", new int[] {238, 238, 238});
	public static final ColorCode _300 = new ColorCode("E0E0E0", new int[] {224, 224, 224});
	public static final ColorCode _400 = new ColorCode("BDBDBD", new int[] {189, 189, 189});
	public static final ColorCode _500 = new ColorCode("9E9E9E", new int[] {158, 158, 158});
	public static final ColorCode _600 = new ColorCode("757575", new int[] {117, 117, 117});
	public static final ColorCode _700 = new ColorCode("616161", new int[] {97, 97, 97});
	public static final ColorCode _800 = new ColorCode("424242", new int[] {66, 66, 66});
	public static final ColorCode _900 = new ColorCode("212121", new int[] {33, 33, 33});

	public static final List<ColorCode> COLOR_LIST = Arrays.asList(
			_50,
			_100,
			_200,
			_300,
			_400,
			_500,
			_600,
			_700,
			_800,
			_900
	);
}

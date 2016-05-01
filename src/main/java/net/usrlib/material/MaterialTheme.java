/*
 * Copyright 2016. UsrLib.Net
 *
 * Licensed under the Apache License,  Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *@author https://github.com/rgr-myrg
 */
package net.usrlib.material;

import java.util.Arrays;
import java.util.List;

import net.usrlib.material.color.Amber;
import net.usrlib.material.color.Blue;
import net.usrlib.material.color.BlueGray;
import net.usrlib.material.color.Brown;
import net.usrlib.material.color.Cyan;
import net.usrlib.material.color.DeepOrange;
import net.usrlib.material.color.DeepPurple;
import net.usrlib.material.color.Gray;
import net.usrlib.material.color.Green;
import net.usrlib.material.color.Indigo;
import net.usrlib.material.color.LightBlue;
import net.usrlib.material.color.LightGreen;
import net.usrlib.material.color.Lime;
import net.usrlib.material.color.Orange;
import net.usrlib.material.color.Pink;
import net.usrlib.material.color.Purple;
import net.usrlib.material.color.Red;
import net.usrlib.material.color.Teal;
import net.usrlib.material.color.Yellow;

public class MaterialTheme {
	private List<ColorCode> mPalette;
	private int mColorIndex = 0;
	private final int mThemeValue;

	public MaterialTheme(Theme theme) {
		mThemeValue = theme.getValue();

		// Load this Palette
		this.mPalette = Arrays.asList(
				getColorFromList(Red.COLOR_LIST),
				getColorFromList(Pink.COLOR_LIST),
				getColorFromList(Purple.COLOR_LIST),
				getColorFromList(DeepPurple.COLOR_LIST),
				getColorFromList(Indigo.COLOR_LIST),
				getColorFromList(Blue.COLOR_LIST),
				getColorFromList(LightBlue.COLOR_LIST),
				getColorFromList(Cyan.COLOR_LIST),
				getColorFromList(Teal.COLOR_LIST),
				getColorFromList(Green.COLOR_LIST),
				getColorFromList(LightGreen.COLOR_LIST),
				getColorFromList(Lime.COLOR_LIST),
				getColorFromList(Yellow.COLOR_LIST),
				getColorFromList(Amber.COLOR_LIST),
				getColorFromList(Orange.COLOR_LIST),
				getColorFromList(DeepOrange.COLOR_LIST),
				getColorFromList(Brown.COLOR_LIST),
				getColorFromList(Gray.COLOR_LIST),
				getColorFromList(BlueGray.COLOR_LIST)
		);
	}

	public ColorCode getColor(MaterialColor color) {
		final int index = color.getValue();
		return mPalette.get(index);
	}

	public ColorCode getNextColor() {
		if (mColorIndex > mPalette.size() - 1) {
			mColorIndex = 0;
		}

		ColorCode selectedColor = mPalette.get(mColorIndex);

		mColorIndex++;

		return selectedColor;
	}

	public static final MaterialTheme getTheme(Theme theme) {
		return new MaterialTheme(theme);
	}

	private ColorCode getColorFromList(final List<ColorCode> list) {
		return mThemeValue > list.size() - 1 ? list.get(0) : list.get(mThemeValue);
	}
}

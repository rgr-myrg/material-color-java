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

public enum Theme {
	TWILIGHT(),
	HARVEST_MOON(),
	COOL(),
	SUNRISE(),
	SAHARA(),
	PRAIRIE(),
	AUTUMN(),
	TOPAZ(),
	OBSIDIAN(),
	DRIFTWOOD(),
	SUNSET(),
	ASH(),
	FREESIA(),
	SEASHELL();

	private final int mValue;

	private Theme() {
		this.mValue = IdGen.nextId();
	}

	public int getValue() {
		return mValue;
	}
	private static class IdGen {
		private static int sId = -1;

		private static final int nextId() {
			sId++;
			return sId;
		}
	}
}
